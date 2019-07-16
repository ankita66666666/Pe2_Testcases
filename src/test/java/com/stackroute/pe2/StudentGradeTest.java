

package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradeTest {

     StudentsGrade studentsGrade;

    @Before
    public void setUp() {
        studentsGrade = new StudentsGrade();
        //*****pass atleast one test case before exrcution;
    }

    @After
    public void tearDown() {
        studentsGrade = null;
    }



    @Test
    public void testCalculateAvgGivenStudentGradesShouldReturnAvgGrade() {
        int[] testStudentGrades = {26, 56, 88, 67};
        studentsGrade.addStudentGrade(testStudentGrades);
        assertEquals("testCalculateAvgGivenStudentGradesShouldReturnAverage: Check calculateAverage()",
                81.50,
                studentsGrade.calculateAverage(),
                0.0);
    }

    @Test
    public void testMaxGradeGivenStudentGradesShouldReturnMaxGrade() {
        int[] testStudentGrades = {26, 56, 88, 67};
        studentsGrade.addStudentGrade(testStudentGrades);
        assertEquals("testMaxGradeGivenStudentGradesShouldReturnMaximumGrade: check maximumGrade()",
                98, studentsGrade.maximumGrade());
    }

    @Test
    public void testMinGradeGivenStudentGradesShouldReturnMinGrade() {
        int[] testStudentGrades = {26, 56, 88, 67};
        studentsGrade.addStudentGrade(testStudentGrades);
        assertEquals("testMinGradeGivenStudentGradesShouldReturnMinimumGrade: check minimumGrade()",
                65, studentsGrade.minimumGrade());
    }
}




