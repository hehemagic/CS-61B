/* Names.java */

import java.io.*;

/** The Names class provides a single function, main, that will
 *   perform various manipulations of the name John Fitzgerald Kennedy. 
 *   This is a modification of the program on page 43 of Arnow and Weiss.
 */

class Names {

/** Performs various string operations on the name John Fitzgerald Kennedy.
 *  @param arg is not used.
 */
  public static void main(String arg[]) {
    String first = "John";
    String middle = "Fitzgerald";
    String last = "Kennedy";
    String initials;
    String firstInit, middleInit, lastInit;

    firstInit = first.substring(0,1);     //get the first character of the string named first
    middleInit = middle.substring(0,1);
    lastInit = last.substring(0,1);
    initials = firstInit.concat(middleInit);    // connect the string named firstInit with the string named middleInit
    initials = initials.concat(lastInit);

    System.out.println();       //There is missing a ';' in the source code
    System.out.println(first + " " + middle + " " + last + " ");   // output
    System.out.println(initials);
    System.out.println(last + ", " + first + " " + middle);
    System.out.println(last + ", " + first + " " + middleInit +".");
    System.out.println(first.toUpperCase() + " " + last.toUpperCase());   //change all characters of the string named first and last to upperclass

    System.out.println(first + " equals john is " + first.equals("john"));   //find whether two strings are the same
    System.out.println(first + " equals john (ignoring case) is " 
		       + first.equalsIgnoreCase("john"));                            //find whether two strings are the same, regardless of the case of characters
    System.out.println("The character at index 3 in " + middle + " is " +
		       middle.substring(3,4));    //The index is not right
    System.out.println("The index of \"gerald\" within " + middle + " is " +
		       middle.indexOf("gerald"));                                  // find the index of 'gerald' in the string named middle, and return the first index of gerald
    System.out.println("The index of \"gerald\" within " + last + " is " +
		       last.indexOf("gerald"));                                    // 'gerald' is not in the string named last, so it returns -1

    System.out.println();
  }
}