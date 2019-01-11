/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

/**This class takes input string and replaces the d with f and l with t
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class ReplaceDWithF {
    public static String replaceDandL(String a){
        String s1= a.replaceAll("d","f");
        String s2= s1.replaceAll("l","t");
        return s2; } }
