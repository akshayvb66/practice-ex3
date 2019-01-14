/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

import java.util.Arrays;
/**Write a program that sets up a String variable containing a paragraph of text of your choice.
 a. Extract the words from the text and sort them into alphabetical order.
 b. Display the sorted list of words.
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class ExtractFromPara {
    public static String sortWords(String a){
        String sorted = "" ;
        String[] words = a.split(" ");
        Arrays.sort(words);
        for (int i=0;i<words.length;i++){
                sorted += words[i] + " "; }
        return sorted;
    }  }


