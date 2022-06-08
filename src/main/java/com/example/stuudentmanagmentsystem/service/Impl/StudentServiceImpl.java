package com.example.stuudentmanagmentsystem.service.Impl;

import com.example.stuudentmanagmentsystem.entity.Student;
import com.example.stuudentmanagmentsystem.repository.StudentRepo;
import com.example.stuudentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        super();
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
}
