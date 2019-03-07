package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/")
    public String index(Model model){

        //Create student

        Student student=new Student();
        student.setStudentName("Raghav");
        student.setAddress("Dockside");
        student.setCity("Columbia");
        student.setPhone(985948943);
student.setState("MD");
student.setZip(21045);
student.setMajor("Science");


//lets create course

        Course course= new Course();
        course.setCourseName("Science");

        //Add the course to an empty list

        Set<Course> courses=new HashSet<Course>();
        courses.add(course);

        course=new Course();
        course.setCourseName("Biology");

        student.setCourses(courses);

        studentRepository.save(student);

        model.addAttribute("students",studentRepository.findAll());
        return "index";

    }
}
