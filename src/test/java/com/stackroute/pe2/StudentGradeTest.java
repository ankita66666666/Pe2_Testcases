

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
    public void checkCalculateAverageGivenStudentGradesShouldReturnAverage() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGrade.addStudentsGrade(testStudentGrades);
        assertEquals("checkCalculateAverageGivenStudentGradesShouldReturnAverage: Check calculateAverage()",
                81.50,
                studentsGrade.calculateAverage(),
                0.0);
        //***Test actual result=expected result;
    }

    @Test
    public void checkMaximumGradeGivenStudentGradesShouldReturnMaximumGrade() {
        int[] testStudentGrades = {86, 65, 98, 77};
        studentsGrade.addStudentsGrade(testStudentGrades);
        assertEquals("checkMaximumGradeGivenStudentGradesShouldReturnMaximumGrade: check maximumGrade()",
                98, studentsGrade.maximumGrade());
    }


    }
