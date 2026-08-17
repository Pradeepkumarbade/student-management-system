package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    @Test
void testStudentObjectNotNull() {
Student student = new Student(101, "Pradeep");
assertNotNull(student);
}
@Test
void testStudentNameNotEmpty() {
Student student = new Student(101, "Pradeep");
assertFalse(student.getName().isEmpty());
}
}
