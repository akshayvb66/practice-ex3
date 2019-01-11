package com.stackroute.unittest.pe4;

import com.stackroute.unittest.pe4.StringTranspose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestForStringTranspose {

    StringTranspose test;

    @Before
    public void setUp() throws Exception {
        test = new StringTranspose(); }

    @After
    public void tearDown() throws Exception {
       test= null; }

    @Test
    public void testforTransposeSuccess(){
        String s ="a quick brown fox jumps over the lazy dog";
        String s2= "a kciuq nworb xof spmuj revo eht yzal god ";
        assertEquals(s2,test.transposed(s)); }

    @Test
    public void testforTransposeFailure(){
        String s ="a quick brown fox jumps over the lazy dog";
        assertNotEquals(null,test.transposed(s)); }
}