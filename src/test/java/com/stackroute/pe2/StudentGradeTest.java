

package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {

    private StudentGrade studentsGrade;

    @Before
    public void setUp() {
        studentsGrade = new StudentGrade();
    }

    @After
    public void tearDown() {
        studentsGrade = null;
    }

    @Test
    public void testCalculateAverageGivenStudentGradesShouldReturnAverage() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGrade.addStudentGrade(testStudentGrades);
        assertEquals("testCalculateAverageGivenStudentGradesShouldReturnAverage: Check calculateAverage()",
                81.50,
                studentsGrade.calculateAverage(),
                0.0);
    }

    @Test
    public void testMaximumGradeGivenStudentGradesShouldReturnMaximumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGrade.addStudentGrade(testStudentGrades);
        assertEquals("testMaximumGradeGivenStudentGradesShouldReturnMaximumGrade: check maximumGrade()",
                98, studentsGrade.maximumGrade());
    }

    @Test
    public void testMinimumGradeGivenStudentGradesShouldReturnMinimumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGrade.addStudentGrade(testStudentGrades);
        assertEquals("testMinimumGradeGivenStudentGradesShouldReturnMinimumGrade: check minimumGrade()",
                65, studentsGrade.minimumGrade());
    }
}