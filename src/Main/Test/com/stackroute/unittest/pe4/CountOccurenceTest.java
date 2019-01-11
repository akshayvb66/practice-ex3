package com.stackroute.unittest.pe4;

import com.stackroute.unittest.pe4.CountOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CountOccurenceTest {

    CountOccurence test;
    @Before
    public void setUp() throws Exception {
        test= new CountOccurence(); }

    @After
    public void tearDown() throws Exception {
         test = null; }


    @Test
    public void cccurenceTestSuccess(){
        String s = "I am akshay badiger";
        assertEquals(4,test.countNumberOfTimes(s,"a")); }

    @Test
    public void cccurenceTestFailure(){
        String s = "We live in India";
        assertNotEquals(4,test.countNumberOfTimes(s,"a")); }
}