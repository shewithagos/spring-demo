package com.example.stuudentmanagmentsystem.repository;

import com.example.stuudentmanagmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
