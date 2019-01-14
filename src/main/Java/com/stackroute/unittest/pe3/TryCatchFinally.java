/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;
/**TCreate a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class TryCatchFinally {
    public static void main(String[] args){
        String[] str= new String[5];
        try{
            String s= str[6]; }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("\n"+"Exception has been caught"); }
        finally {
            System.out.println("\n"+"finally has been executed"); } }
}
