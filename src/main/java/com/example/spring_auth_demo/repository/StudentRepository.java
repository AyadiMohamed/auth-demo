package com.example.spring_auth_demo.repository;

import com.example.spring_auth_demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

     Student findByEmail(String email);
}
