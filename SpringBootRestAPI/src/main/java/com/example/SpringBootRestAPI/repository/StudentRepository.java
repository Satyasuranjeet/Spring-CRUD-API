package com.example.SpringBootRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootRestAPI.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
