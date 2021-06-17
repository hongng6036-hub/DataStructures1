package com.tts;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList animalList = new LinkedList();
        animalList.add("koala");
        animalList.add("frog");
        animalList.add("mongoose");
        animalList.add("buffalo");
        animalList.add("chicken");
        animalList.add("dog");
        animalList.add("bird");

        System.out.println(animalList);

        animalList.removeLast();
        System.out.println(animalList);

        animalList.removeFirst();
        System.out.println(animalList);

        System.out.println(animalList.get(2));

        //This replaces the position 3 output to be emu.
        animalList.set(3, "emu");
        System.out.println(animalList);
    }
}
