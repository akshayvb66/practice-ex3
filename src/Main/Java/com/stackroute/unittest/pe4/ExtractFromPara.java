/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

import java.util.Arrays;
/**This class takes input string and sorts the words in alphabetical order
 *
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


