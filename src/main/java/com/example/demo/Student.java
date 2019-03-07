package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="MCStudents")
public class Student {

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public Set<Course> courses;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long student_ID;

    private String studentName;

    private String address;

    private String city;

    private String state;

    private long zip;

    private long phone;

    private String major;

    public Student() {
    }

    public long getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(long student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
