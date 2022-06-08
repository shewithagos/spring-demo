package com.example.stuudentmanagmentsystem.service;

import com.example.stuudentmanagmentsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
