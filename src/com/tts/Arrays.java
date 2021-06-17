package com.tts;
import java.util.ArrayList;
import java.util.*;


public class Arrays {
    public static void main(String[] args) {
      //use this if you know your array size!
        String[] groceryListArray = new String[5];
        groceryListArray[0] = "eggs";
        groceryListArray[1] = "milk";
        groceryListArray[2] = "bread";
        groceryListArray[3] = "blueberries";
        groceryListArray[4] = "spinach";
        System.out.println("Grocery list = " + groceryListArray);


        //Use this when you don't know what size the array is.
        String[] studentNameArray = {"Hong", "Levi", "China", "Destiny"};
        System.out.println(studentNameArray[0]);
        System.out.println("Array length is: " + studentNameArray.length);

        //This is an ArrayList!
        List<String> list1 = new ArrayList();
        List<Integer> list2 = new LinkedList();
        List<Integer> list3 = new Vector();
        List<String> list4 = new Stack();

        ArrayList<String> fruitInventory = new ArrayList<>();
        // If it was integer then use ArrayList<Integer> fruitInventory = new ArrayList<>();
        fruitInventory.add("Apple");
        fruitInventory.add("Pineapple");
        fruitInventory.add("Watermelon");
        fruitInventory.add("Orange");
        fruitInventory.add("Strawberry");
        fruitInventory.add("Blueberry");
        fruitInventory.add("Peach");
        fruitInventory.add("Plum");
        fruitInventory.add("Grapes");

        fruitInventory.remove(3);
        System.out.println("Fruit Inventory = " + fruitInventory);

        
        //Splitting the elements in an array
        String mySentence = "I really love ice cream!";
        String str[] = mySentence.split(" ");
        List<String> arraySplitsUp = new ArrayList<String>();
    }
}
