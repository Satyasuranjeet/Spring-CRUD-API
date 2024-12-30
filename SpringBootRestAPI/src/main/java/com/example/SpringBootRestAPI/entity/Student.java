package com.example.SpringBootRestAPI.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNO;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_percentage")
    private float percentage;

    @Column(name = "student_branch")
    private String branch;

    // Default constructor
    public Student() {}

    // Constructor with parameters
    public Student(int rollNO, String name, float percentage, String branch) {
        this.rollNO = rollNO;
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    // Getters and setters
    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "rollNO=" + rollNO +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", branch='" + branch + '\'' +
                '}';
    }
}
