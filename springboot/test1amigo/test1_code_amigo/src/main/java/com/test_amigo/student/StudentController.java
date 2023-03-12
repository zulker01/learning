package com.test_amigo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// this class is for api control of students
@RestController
//@RequestMapping(path="/students")
public class StudentController {

    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(path="/students1")
    public List<Student> getStudentService() {
        return studentService.getStudents();
    }

    @GetMapping("/test_stu")
    public test_stu_record gets()
    {
        return new test_stu_record("hehe this is mine code","500 everything found");
    }

    record  test_stu_record(String msg,String errorcode){}
}
