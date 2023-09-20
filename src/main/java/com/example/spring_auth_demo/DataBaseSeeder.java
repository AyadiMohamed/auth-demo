package com.example.spring_auth_demo;

import com.example.spring_auth_demo.domain.Role;
import com.example.spring_auth_demo.domain.Student;
import com.example.spring_auth_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataBaseSeeder implements CommandLineRunner {

    private final PasswordEncoder passwordEncoder;
    private final StudentRepository studentRepository;

    @Autowired
    public DataBaseSeeder(PasswordEncoder passwordEncoder, StudentRepository studentRepository){
        this.passwordEncoder = passwordEncoder;
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Role studentRole = new Role();
        studentRole.setRole("STUDENT");

        Student s1 = new Student();
        s1.setFirstName("ayadi2");
        s1.setLastName("Mohamed3");
        s1.setEmail("med1@gmail.com");
        s1.setPassword(passwordEncoder.encode("123456"));
        s1.addRole(studentRole);
        studentRepository.save(s1);
    }
}
