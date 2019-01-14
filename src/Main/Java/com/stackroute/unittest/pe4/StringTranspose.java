/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

/**Write a program to transpose the given string.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class StringTranspose {
    public static String transposed(String s) {
        String[] s1 = s.split(" ");
        int num = s1.length;
        String reverseString = "";

        for (int i = 0; i < s1.length; i++) {
            String word = s1[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j); }
                reverseString = reverseString + reverseWord + " "; }
        return reverseString; }
}
