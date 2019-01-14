package com.stackroute.unittest.pe3;

import com.stackroute.unittest.pe3.RemoveVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RemoveVowelsTest {

    @Before
    public void setUp() throws Exception {
    com.stackroute.unittest.pe3.RemoveVowels test = new RemoveVowels();
    }

    RemoveVowels RemoveVowels;

    @After
    public void tearDown() throws Exception {
    RemoveVowels=null;
    }


    @Test
    public void checkForVowelsSuccess(){

        RemoveVowels test = new RemoveVowels();
        String[] places={"India","United States"};
        String[] places1={"Ind","Untd Stts"};
        assertArrayEquals(places1,test.vowelsRemove(2,places));
    }

    @Test
    public void checkForVowelFailure(){
        RemoveVowels test = new RemoveVowels();

        String[] places={"India","United States"};
        String[] places1={"Ind","Untd Stts"};
        assertNotEquals(null,test.vowelsRemove(2,places));


    }
}