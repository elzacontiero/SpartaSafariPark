package com.sparta.ec.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class CollectionsLabHomework {

    // Ex.1 LAB (HashSet)
    public static HashSet<Integer> makeFiveSet(int max){

        HashSet<Integer> result = new HashSet<>();
        for (int i = 1; i <= max; i++) {
            if(i %5 == 0) {
                result.add(i);
            }
        }
        return result;
    }


    // Ex.2 LAB (ArrayList)
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

    //Ex.3 LAB (HashMap)

    /* Keep a count of how many times each digit occurs. So, how many 0s, how many 1s,
    how many 2s...and return this HashMap.*/

    // Goal: Analyse the character frequency only for digits and return this frequency.
    public static HashMap<Character, Integer> countDigits(String input) {

        HashMap<Character,Integer> result = new HashMap<>();
        for(Character c : input.toCharArray()) { // String not iterable, transform to char[]
            if(Character.isDigit(c)) {

                if(result.containsKey(c)) {
                    Integer n = result.get(c) +1;
                    result.put(c,n);

                } else {
                    result.put(c,1);
                }
            }

        }
        return result;
    }


    // Version 2 - If we want to only count how many times any digit occurs in the input.
    public static int countDigitsExercise2(String input){

        int count = 0;
        for (char c : input.toCharArray()){
            if(Character.isDigit(c)){
                count++;
            }
        }
        return count;

    }
}
