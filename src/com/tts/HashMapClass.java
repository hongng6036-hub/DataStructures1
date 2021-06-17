package com.tts;
import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();

        //Add people to list using .put
        person.put("Joe", 28);
        person.put("David", 32);
        person.put("Emily", 24);
        person.put("Bob", 41);
        person.put("Daniel", 60);

        //To remove people?
        person.remove(0);

        //get key from position
        person.get(0);

        System.out.println("HashMap person = " + person);
    }
}
