# 🎓 Student Management API

A RESTful CRUD API built with Spring Boot and MySQL for managing student records.

## 📚 Table of Contents
- [Features](#features)
- [Tech Stack](#tech-stack)
- [API Endpoints](#api-endpoints)
- [Setup](#setup)
- [API Documentation](#api-documentation)

## ✨ Features
- Create, read, update, and delete student records
- Fetch individual students by roll number
- Retrieve all students
- MySQL database integration
- RESTful architecture

## 🛠️ Tech Stack
- Spring Boot
- MySQL
- Maven
- Java
- Spring Data JPA

## 🔌 API Endpoints

### Get All Students
```http
GET /students
```
Returns a list of all students in the database.

### Get Student by Roll Number
```http
GET /students/{rollNo}
```
Fetches a specific student by their roll number.

### Create Student
```http
POST /students/add
```
Creates a new student record.

**Request Body:**
```json
{
    "name": "John Doe",
    "rollNo": "2141010033",
    "grade": "A"
}
```

### Update Student
```http
PUT /students/update/{id}
```
Updates an existing student's information.

### Delete Student
```http
DELETE /students/{id}
```
Removes a student record from the database.

## 🚀 Setup

1. **Prerequisites**
   - Java 11 or higher
   - MySQL
   - Maven

2. **Database Configuration**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. **Build & Run**
   ```bash
   mvn clean install
   java -jar target/student-api.jar
   ```

## 📖 API Documentation
Access the API documentation at:
```
http://localhost:8080/swagger-ui.html
```

## 🔍 Testing
The API can be tested using Postman or any HTTP client. Default port: `8080`

