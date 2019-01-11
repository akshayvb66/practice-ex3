package com.stackroute.unittest.pe4;

import com.stackroute.unittest.pe4.FindTheName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class CheckTheName {

    FindTheName test;

    @Before
    public void setUp() throws Exception {
        test= new FindTheName(); }

    @After
    public void tearDown() throws Exception {
        test=null; }

    @Test
    public void checkIfNameSuccess(){
        String s="Is Harry here";
        assertEquals(true,test.findHarry(s)); }

    @Test
    public void checkIfNameFailure(){
        String s="Is Henry here";
        assertNotEquals(true,test.findHarry(s)); }
}