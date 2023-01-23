package com.sparta.ec.stringmanipulation;


public class MoreStringsAppMain {
    public static void main(String[] args) {
        String s1=  "Hello"; // created in the String pool. (special area of the heap). runtime look in the pool.
        //it will just return what is in the heap.
        String s2 = new String("Hello"); // constructed in the HEAP.

        boolean s1_s2 = s1 ==s2;
        String s3 = s2.intern();
        boolean s1_s3 = s1 ==s3;
        System.out.println(s1.hashCode() + " " + s3.hashCode());

        // String manipulation

        String myString = "  Java list fundamentals ";
        var result = myString.trim().toUpperCase().replace('L', '*').replace('T', '*').substring(0,13);

        // concatenating Strings - without StringBuilder
        System.out.println(makeDashedString(100));

        // concatenating Strings - WITH StringBuilder
        System.out.println(makeDashedStringWithStringBuilder(100));

        //Another way to join strings - opposite of the split() method

        String joinedNames = String.join(",", "Cathy", "Laura", "Nish", "Astha" , "Neil");
        String[] splitNames = joinedNames.split(",");

        // formatting strings

        long popWorldLong = 7_900_000_000L;
        System.out.println("There are " + popWorldLong + "people in the world.");

        // or System.out.printf("There are %d people in the world", popWorldLong);

        // formatted string
        String formattedString = String.format("There are %d people in the world", popWorldLong);

        double pi = 3.14159;

        System.out.printf("Pi  - %f \n" , pi);
        System.out.printf("Pi to 2 decimal places - %.2f \n", pi);
        System.out.printf("Pi to 4 decimal places - %.4f \n", pi);

        System.out.printf("Money in the bank - %09.2f%n \n", 34.916);
    }

    public static String makeDashedString(int length){
        String str = " ";
        for(int i = 1; i<=length; i++) {
            str += "-";

        }
        return str;
    }

    public static String makeDashedStringWithStringBuilder(int length) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 1; i<= length; i++) {
            sb.append('-');
        }

        return sb.toString();
    }
}
