//package com.stackroute.pe2;

//public class FileToByteArrayRead {
//}



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
    public void GivenReadFileSuccessAndExtensionShouldReturnByteArray() {
        String testString = "Hello. This is a test string";
        byte[] testByteArray = testString.getBytes();
        assertArrayEquals("testReadFileSuccessGivenFileNameAndExtensionShouldReturnByteArray: check readFile()",
                testByteArray, fileToByteArrayRead.readFile("test", "txt"));
    }


    /**
     * Test for readFile() to throw FileNotFoundException
     * when the wrong(non-existent) file path is given.
     */
    @Test(expected = FileNotFoundException.class)
    public void GivenReadFileFailureAndExtensionShouldReturnFileNotFoundException() {
        fileToByteArrayRead.readFile("test1", "txt");
    }
}