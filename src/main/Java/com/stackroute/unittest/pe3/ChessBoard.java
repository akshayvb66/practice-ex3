/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe3;

/**Write a program to create a ChessBoard pattern with the help of multidimensional array,
 * where WWrepresents white color and BB represents Black color.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */


public class ChessBoard {
    public static String printBoard(int rows, int columns) {
        String str = "WW|";
        String board = "";
        for (int i = 1; i <= rows; i++) {
            if ((i % 2) != 0) {
                for (int j = 0; j < 4; j++) {
                    if(j<3)
                    board = board + "WW|BB|";
                    else
                    board = board + "WW|BB|\n"; }
            } else {
                for (int j = 0; j < 4; j++) {
                    if(j<3)
                        board = board + "BB|WW|";
                    else
                        board = board + "BB|WW|\n"; } } }
        return board;
    } }