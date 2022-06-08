package com.example.stuudentmanagmentsystem.controller;

import com.example.stuudentmanagmentsystem.entity.Student;
import com.example.stuudentmanagmentsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    // handler method to return model and view
     @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
    @GetMapping("/students/new")
    public String createStudent(Model model) {
        // create student object to hold student form
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "SuccessPage";
    }
}
