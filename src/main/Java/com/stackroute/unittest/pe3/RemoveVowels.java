/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

/**Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class RemoveVowels {
    public static String[]  vowelsRemove(int a , String[] b){
        String[] removed = new String[a];
        for(int i=0;i<a;i++){
            b[i]=b[i].replaceAll("[aeiou]","");
            removed[i]=b[i]; }
        return removed; }
}
