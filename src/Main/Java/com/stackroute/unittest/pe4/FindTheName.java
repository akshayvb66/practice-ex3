/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

/**This class takes input string and checks if it contains a specific word
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class FindTheName {
    public boolean findHarry(String input) {
        String inputString=input.toLowerCase();
        if(inputString==null) {
            return false; }
        else {
            if(inputString.matches(".*harry.*")) {
            return true; }
            else
            return false; }
    }}