/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**TWrite a java program to calculate first and last date of a week.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class FirstAndLastDate {
public static void main(String[] args){
    Calendar c= Calendar.getInstance();
    c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
    DateFormat a= new SimpleDateFormat("EEE dd/MM/yyyy");
    System.out.println( a.format(c.getTime()));
        for(int i=0;i<6;i++){
            c.add(Calendar.DATE,1); }
        System.out.println(a.format(c.getTime())); } }
