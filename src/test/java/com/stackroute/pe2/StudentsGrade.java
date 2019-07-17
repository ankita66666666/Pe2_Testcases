

package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsGrade {

     StudentGrade studentGrade;

    @Before
    public void setUp() {
        studentGrade = new StudentGrade();
        //*****pass atleast one test case before exrcution;
    }

    @After
    public void tearDown() {
        studentGrade = null;
    }



    @Test
    public void testCalculateAvgGivenStudentGradesShouldReturnAvgGrade() {
        int[] testStudentGrades = {26, 56, 88, 67};
        studentGrade.addStudentGrade(testStudentGrades);
        assertEquals("testCalculateAvgGivenStudentGradesShouldReturnAverage: Check calculateAverage()",
                59.25,
                studentGrade.calculateAverage(),
                0.0);
    }

    @Test
    public void testMaxGradeGivenStudentGradesShouldReturnMaxGrade() {
        int[] testStudentGrades = {26, 56, 88, 67};
        studentGrade.addStudentGrade(testStudentGrades);
        assertEquals("testMaxGradeGivenStudentGradesShouldReturnMaximumGrade: check maximumGrade()",
                88, studentGrade.maximumGrade());
    }

    @Test
    public void testMinGradeGivenStudentGradesShouldReturnMinGrade() {
        int[] testStudentGrades = {26, 56, 88, 67};
        studentGrade.addStudentGrade(testStudentGrades);
        assertEquals("testMinGradeGivenStudentGradesShouldReturnMinimumGrade: check minimumGrade()",
                26, studentGrade.minimumGrade());
    }
}




