/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**This class takes input string at which positions a particular string is there
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */
public class MultipleOccurence {
    public static String countMultiple(String a, String b) {
        String s="";
        Pattern r = Pattern.compile(b);
        int count = 0;
        Matcher matcher = r.matcher(a);
        while (matcher.find()) {
          { count++;
          s =s+ "Found at " + matcher.start()+"-"+matcher.end()+"\n"; }
        } return s;
    }}

