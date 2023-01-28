package com.sparta.ec.collections;

import java.util.* ;
import com.sparta.ec.safaripark.Person;

public class CollectionsApp3 {
    public static void main(String[] args) {

        String[] names = {"Amy", "Bilal", "Nish", "Dan"};
        Double[] weights = {22.0, 51.5};
        Person[] trainees = {
                new Person("Amy", "Andrews", 32),
                new Person("Bilal", "Builder", 41),
                new Person("Nish", "Mandal", 34),
                new Person("Dan", "Dare", 56),
        };

        for (int i = 0; i < names.length; i++) {
            //System.out.println([i]);
        }

        for (double d : weights) {
            System.out.println(d);
        }

        for (Person p : trainees) {
            System.out.println(p);
        }
        //System.out.println(trainees);

        System.out.println("ArrayList");

        // ArrayList - a more flexible array

        ArrayList<String> name_List = new ArrayList<>();
        int size = name_List.size();
        name_List.add("Amy");
        name_List.add("Bilal");
        name_List.add("1, Cathy");
        int finalSize = name_List.size();

        var traineeList = new ArrayList<Person>();
        traineeList.add(new Person("Amy", "Andrews", 22));

        ArrayList<Double> weightList = new ArrayList<Double>();
        // autoboxing double
        weightList.add(22.0);
        weightList.add(3.7);
        // auto unboxing
        double result = weightList.get(1);

        // can create an ArrayList from an Array

        var immutableTraineesList = Arrays.asList(trainees); // transform arrays into Lists.
//        immutableTraineesList.add(new Person ("Cathy", "French", 25));


        var iTraineeList2 = new ArrayList<Person>(List.of(new Person("Cathy", "French", 23),
                new Person(), new Person()));

        //mutableTraineesList2.add(new Person());
        exercise1();
    }

    /*
    Exercise1 given in class

    Declare an ArrayList of type Integer containing the numbers 1 to 5
    Use ArrayList methods to:
    - Insert the number 7 at index 2
    - Use a Collections static method to reverse the order of elements in the list
    - Remove the element at index 1
    */

    public static void exercise1() {
        System.out.println("============== ArrayList exercise ");
        var myList = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            myList.add(i);
        }

        myList.add(2, 7); // Insert the number 7 at index 2
        Collections.reverse(myList);
        myList.remove(1);

        System.out.println(myList); // output: [5, 3, 7, 2, 1]


        System.out.println("=================== HashSet exercise ");

        var personSet = new HashSet<Person>();
        personSet.add(new Person("Amy","Andrews", 32));
        personSet.add(new Person("Bilal","Builder", 41));
        personSet.add(new Person("Nish","Mandal", 34));

        System.out.println(personSet);


        var cathyIn = personSet.contains( new Person("Cathy", "French", 25));
        System.out.println("Cathy " + (cathyIn ? "IS" : "IS NOT") + " in the list.");

        personSet.add(new Person("Bilal", "Builder", 41));

        personSet.remove(new Person ("Amy", "Andrews", 15));

        // HashMap
        System.out.println("Hash Map");
        var personMap =new HashMap<String, Person>();
        personMap.put("Helen", new Person ("Helen", "Fielding", 45));
        var s = new Person("Sherlock", "Holmes",40);
        personMap.put("Sherlock", s);


        var nobody = personMap.get("Cathy");
        var p = personMap.get("Sherlock");

        var oldHelen = personMap.put("helen",s);
        personMap.put("anotherHolmes", s);

        var keys = personMap.keySet();
        var values = personMap.values();
        var kvPairs = personMap.entrySet();

        System.out.println(keys);
        System.out.println(values);
        System.out.println(kvPairs);


        String input = "The cat in the hat comes back";
        input = input.trim().toLowerCase();

        var countMap = new HashMap<Character, Integer>();
        for (char c : input.toCharArray())
        {
            if (countMap.containsKey(c))
            {
                var currentCount = countMap.get(c);

                countMap.put(c, currentCount + 1);
            }
            else
            {
                countMap.put(c, 1);//
            }
        }
        System.out.println("Map problem"); //
        for (var entry : countMap.entrySet()) {
        }

    }
}


