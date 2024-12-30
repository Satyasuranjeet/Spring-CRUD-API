package com.example.SpringBootRestAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.SpringBootRestAPI.entity.Student;
import com.example.SpringBootRestAPI.repository.StudentRepository;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;
   
    // Get all the students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
            return repo.findAll();
    
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
    	return repo.findById(id) .get();
    }
    
    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student) {
    	repo.save(student);
    }
    
    @PutMapping("/students/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return repo.findById(id)
            .map(student -> {
                if (updatedStudent.getName() != null) {
                    student.setName(updatedStudent.getName());
                }
                if (updatedStudent.getPercentage() != 0) {
                    student.setPercentage(updatedStudent.getPercentage());
                }
                if (updatedStudent.getBranch() != null) {
                    student.setBranch(updatedStudent.getBranch());
                }
                Student savedStudent = repo.save(student);
                return ResponseEntity.ok(savedStudent);
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @DeleteMapping("/students/delete/{id}")
    public void removeStuent(@PathVariable int id) {
    	Student sw = repo.findById(id).get();
    	repo.delete(sw);
    }
   
}
