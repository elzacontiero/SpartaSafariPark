package com.sparta.ec.stringmanipulation;

public class MoreStringsLab {

    // manipulates and returns a string - see the unit test for requirements
    public static String manipulateString(String input, int num)
    {
        StringBuilder builder = new StringBuilder(); // Creating a string builder object
        if (input != null) {
            builder.append(input.toUpperCase()); // Append to builder the input in upper case.
        }

        for(int i=0; i<num; i++) {  // start loop from 0 to num:
            builder.append(i); // append i to the end of the builder.
        }
        return builder.toString(); // I can't return a StringBuilder, so convert to String.
    }


    // Returns a formatted address string given its components
    public static String address(int number, String street, String city, String postcode)
    {

        return String.join(" ", Integer.toString(number), street, city, postcode) + ".";
    }


    // returns a string representing a test score, written as percentage to 1 decimal place.
    public static String scorer(int score, int outOf)
    {
       double percentage = ((double)score/outOf)*100;
       return String.format("You got %d out of %d: %.1f%%",score, outOf, percentage);

    }
}

