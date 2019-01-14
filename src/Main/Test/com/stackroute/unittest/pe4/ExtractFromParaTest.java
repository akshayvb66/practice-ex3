package com.stackroute.unittest.pe4;

import com.stackroute.unittest.pe4.ExtractFromPara;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class ExtractFromParaTest {

    ExtractFromPara test;
    @Before
    public void setUp() throws Exception {
        test = new ExtractFromPara(); }

    @After
    public void tearDown() throws Exception {
        test=null; }

    @Test
    public void extractTextSuccess(){
        String s = "it could be a snippet of dialogue with narration";
        String s2="a be could dialogue it narration of snippet with ";
        assertEquals(s2,test.sortWords(s)); }

    @Test
    public void extractTextFailure(){
        String s = "it could be a snippet of dialogue with narration";
        String s2="a be could it narration of snippet with ";
        assertNotEquals(s2,test.sortWords(s)); }
}