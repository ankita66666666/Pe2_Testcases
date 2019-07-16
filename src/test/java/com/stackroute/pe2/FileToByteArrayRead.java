//package com.stackroute.pe2;

//public class FileToByteArrayRea



package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileToByteArrayRead {

    FileToByteArrayRead fileToByteArrayRead;

    @Before
    public void setUp() {
        fileToByteArrayRead = new FileToByteArrayRead();
    }

    @After
    public void tearDown() {
        fileToByteArrayRead = null;
    }

    @Test
    public void givenReadFileSuccessAndExtensionShouldReturnByteArray() {
        String testString = "Hello. This is a test string";
        byte[] testByteArray = testString.getBytes();
        assertArrayEquals("testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, fileToByteArrayRead.readFile( "txt"));
    }


    /**
     * Test for readFile() to throw FileNotFoundException
     * when the wrong(non-existent) file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void testReadFileFailureAndExtensionShouldReturnFileNotFoundException() {
        fileToByteArrayRead.readFile( "txt");
    }

    @Test
    public void givenReadFileSuccessAndExtensionShouldReturnErrorMessage() {
        byte[] testByteArray = {'n', 'o'};

             assertArrayEquals(testByteArray,fileToByteArrayRead.readFile( "txt"));
    }