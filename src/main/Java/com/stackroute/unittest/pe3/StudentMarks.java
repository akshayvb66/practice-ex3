/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

/**Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numOfStudents.
 * It then prompts user for the grades of each of the students and saves them in an int array called stuGrades.
 * Your program shall check that the grade is between 0 and 100 else has to trow an error message.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class StudentMarks {
    public static String checksValidMarks(int a, int[] b) {
        String c="";
        for (int i = 0; i < a; i++) {
            if (b[i]< 0 || b[i]>100) {
                c = "grades of  are not valid";
                break; }
            else {
                c = "marks are valid"; }
        }
        return c; } }