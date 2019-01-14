/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

/**Write a program to find out if a series of 7 digits are consecutive numbers.
 *  To make this easier, assume the digits are a string and use split()
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class CheckConsecNum {
    public String consecNumbers(int[] a) {
        String s="";
        for (int i = 0; i < 7; i++) {
            if(i>=1) {
            if (a[i] - a[i - 1] == 1 || a[i] - a[i - 2] == -2) {
                s = "true";
                continue;
            } else
                s = "false";
            break; }
            else {
            if (a[i] - a[i + 1] == 1 || a[i] - a[i + 1] == -1) {
                s = "true";
                continue; }
            else
                s="false";
                break; }
        }
return s; }
}