package com.example.stuudentmanagmentsystem;

import com.example.stuudentmanagmentsystem.entity.Student;
import com.example.stuudentmanagmentsystem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagmentSystemApplication.class, args);
    }

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void run(String... args) throws Exception {
  //     Student s1 = new Student("Shewit", "Hagos","sh@gmail.com");
//        Student s2 = new Student("Semir", "Jaber","sj@gmail.com");
//        Student s3 = new Student("Mire", "Habte","mh@gmail.com");
//
//     studentRepo.save(s1);
//        studentRepo.save(s2);
//        studentRepo.save(s3);


    }
}
