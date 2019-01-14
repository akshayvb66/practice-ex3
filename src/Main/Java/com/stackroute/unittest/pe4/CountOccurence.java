/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;
/**Write a java program to count the total number of occurrences of a given character in a string without using any loop?
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class CountOccurence{
        public static int countNumberOfTimes(String a, String b){
            String small= a.replaceAll(b,"");
            int count=a.length()-small.length();
            return count; } }
