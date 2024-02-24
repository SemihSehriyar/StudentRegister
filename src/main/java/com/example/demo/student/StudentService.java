package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Semo",
                        "Semo@semo",
                        LocalDate.of(2002, Month.AUGUST,26),
                        21
                )
        );
    }
}
