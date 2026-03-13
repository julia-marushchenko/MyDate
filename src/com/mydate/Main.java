/**
 *  Java program to demonstrate Date class.
 */

package com.mydate;

import java.util.Date;

/**
 *  Main class.
 */
public class Main {

    // Entry point for Java Virtual Machine.
    public static void main(String[] args) {

        // Creating instance of Date class.
        Date date = new Date();

        // Printing current date to console.
        System.out.println("Current date is: " + date); // Output: Current date is: Fri Mar 13 04:37:57 CET 2026

        // Creating date counting it in milliseconds since 1 January 1970 00:00:00.
        Date miliSecDate = new Date(4576546587765L);

        // Printing counted date to console.
        System.out.println("Counted date in the future is: " + miliSecDate); // Output: Counted date is:
                                                                             // Thu Jan 10 07:56:27 CET 2115

    }
}
