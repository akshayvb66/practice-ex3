package com.stackroute.unittest.pe3;

import com.stackroute.unittest.pe3.StudentMarks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class StudentMarksTest {

    @Before
    public void setUp() throws Exception {
        com.stackroute.unittest.pe3.StudentMarks test=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    StudentMarks=null;
    }

    StudentMarks StudentMarks;

    @Test
    public void studentsTest(){
        StudentMarks test=new StudentMarks();
        int[] grades={12,23,46,78};
        String s ="marks are valid";
        assertEquals(s,test.checksValidMarks(4,grades)); }


    @Test
    public void studentsTestFailure(){
        StudentMarks test=new StudentMarks();
        int[] grades={12,23,46,78};
        String s ="marks are not valid";
        assertNotEquals(s,test.checksValidMarks(4,grades)); }

}