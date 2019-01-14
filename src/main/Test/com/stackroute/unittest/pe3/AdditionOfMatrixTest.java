package com.stackroute.unittest.pe3;

import com.stackroute.unittest.pe3.AdditionOfMatrix;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;


@RunWith(JUnit4.class)
public class AdditionOfMatrixTest {

    @Before
    public void setUp() throws Exception {
    AdditionOfMatrix test= new AdditionOfMatrix();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addMatrixSuccess(){
        AdditionOfMatrix test= new AdditionOfMatrix();
    int[][] a= {{1,2},{3,4}};
    int[][] b={{1,2,3},{3,4}};
    int[][] c={{2,4},{6,8}};
assertArrayEquals(c,test.sumOfMatrix(2,2,a,b));
    }

    @Test
    public void addMatrixFailure(){
        AdditionOfMatrix test= new AdditionOfMatrix();
        int[][] a= {{1,2},{3,4}};
        int[][] b={{1,2},{3,4},{6,7}};
    assertNotEquals("size not equal",test.sumOfMatrix(2,2,a,b));

    }

}