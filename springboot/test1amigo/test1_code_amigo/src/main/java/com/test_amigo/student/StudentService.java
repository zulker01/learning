package com.test_amigo.student;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents()
    {
        return List.of(new Student("masud",11,2));
    }
}
