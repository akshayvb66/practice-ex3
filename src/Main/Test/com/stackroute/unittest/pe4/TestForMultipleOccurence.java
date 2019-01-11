package com.stackroute.unittest.pe4;

import com.stackroute.unittest.pe4.MultipleOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestForMultipleOccurence {

    MultipleOccurence test;

    @Before
    public void setUp() throws Exception {
        test= new MultipleOccurence(); }

    @After
    public void tearDown() throws Exception {
        test = null; }


    @Test
    public void testForMulipleSuccess(){
        String s="She sells seashells by the seashore";
        String s2="Found at 4-7\n";
        assertEquals(s2,test.countMultiple(s,"sel")); }

    @Test
    public void testForMulipleFailure(){
        String s="She sells seashells by the seashore";
        String s2="Found at 4-7\n";
        assertNotEquals(null,test.countMultiple(s,"sel")); }
}