/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

/**Write a program that will generate exceptions of type NegativeArraySizeException, IndexOutOfBoundsException, NullPointerException.
 * Record the catching of each exception by displaying the message stored in the exception object.
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class DiffExceptions {
        public static void main(String[] args){
            try{
                String[] str= new String[-2];
                }
            catch(NegativeArraySizeException b){
                System.out.println("\n"+"Negative array exception has been caught");
                }
            finally {
                System.out.println("\n"+"finally has been executed in Negative array exception");
                }
            int[] arr= new int[3];
            try{
                int a = arr[3];
                }
            catch(IndexOutOfBoundsException c){
                System.out.println("\n"+"Index out of bound exception has been caught");
                }
            finally {
                System.out.println("\n"+"finally has been executed in Index out of bound exception");
                }
            String s=null;
            try{
            if(s.equals("abc"))
                s="abc";
            else
                s=null; }
            catch(NullPointerException c){
                System.out.println("\n"+"Null pointer exception has been caught");
                }
            finally {
                System.out.println("\n"+"finally has been executed in null pointer exception");
                } }
}


