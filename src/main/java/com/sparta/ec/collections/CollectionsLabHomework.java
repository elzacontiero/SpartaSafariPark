package com.sparta.ec.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class CollectionsLabHomework {

    // Ex.1 (HashSet)
    public static HashSet<Integer> makeFiveSet(int max){

        HashSet<Integer> result = new HashSet<>();
        for (int i = 1; i <= max; i++) {
            if(i %5 == 0) {
                result.add(i);
            }
        }
        return result;
    }


    // Ex.2 (ArrayList)
    public static List<String> longWordList(String phrase){
          ArrayList<String> result = new ArrayList<>();
        String[] words = phrase.split(" ");

        for (String word : words){
            if(word.length() >= 5) {
               result.add(word);
            }
        }
        return result;
    }

    //Ex.3

    public static int countDigits(String input){

        int count = 0;
        /* each character is of type char.Input is not iterable, because you can't loop over
        a String, then convert String toCharArray()
        */

        for (char c : input.toCharArray()){
            // static method isDigit is available in class Character.
            if(Character.isDigit(c)){ // if digit increment count.
                count++;
            }
        }
        return count;

    }
}
