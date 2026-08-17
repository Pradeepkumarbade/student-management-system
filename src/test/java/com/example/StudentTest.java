package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void testStudentName() {
        Student student = new Student(101, "Pradeep");

        assertEquals("Pradeep", student.getName());
    }

    @Test
    void testStudentId() {
        Student student = new Student(101, "Pradeep");

        assertEquals(101, student.getId());
    }
}
