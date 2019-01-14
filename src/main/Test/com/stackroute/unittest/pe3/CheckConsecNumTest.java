package com.stackroute.unittest.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class CheckConsecNumTest {

    @Before
    public void setUp() throws Exception {
        CheckConsecNum test = new CheckConsecNum();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void checkForConsec(){
        CheckConsecNum test = new CheckConsecNum();
        int[] arr={1,2,3,4,5,6,7};
        assertEquals("true",test.consecNumbers(arr)); }

    @Test
    public void checkForConsecFailure(){
        CheckConsecNum test = new CheckConsecNum();
        int[] arr={1,2,3,4,5,6,6};
        assertNotEquals("true",test.consecNumbers(arr)); }
}
