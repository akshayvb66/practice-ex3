package com.stackroute.unittest.pe4;

import com.stackroute.unittest.pe4.ReplaceDWithF;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestIfReplaceDWithF {

    ReplaceDWithF test;
    @Before
    public void setUp() throws Exception {
        test= new ReplaceDWithF(); }

    @After
    public void tearDown() throws Exception {
        test = null; }

    @Test
    public void replacedSuccess(){
        ReplaceDWithF test= new ReplaceDWithF();
        String s = "daily dry";
        assertEquals("faity fry",test.replaceDandL(s)); }

    @Test
    public void replacedFailure(){
        ReplaceDWithF test= new ReplaceDWithF();
        String s = "daily dry";
        assertNotEquals("fairy fry",test.replaceDandL(s)); }
}