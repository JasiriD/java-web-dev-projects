package org.example;

import java.util.HashMap;

public class letterChecker {
    //Class that returns HashMap
    public static HashMap<Character, Integer> returnResults(String testString){
        //Creating a new empty hashmap
        HashMap<Character, Integer> letters = new HashMap<>();

        //For loop interating initial string
        for(char c : testString.toCharArray()){
            //If the letter has not been seen yet, make a new key/value pair
            //With new letter and number initialized at 1
            if(letters.containsKey(c) == false){
                letters.put(c,1);
            }
            //If letter has been seen, add 1 to value
            else if(letters.containsKey(c)){
                letters.put(c, letters.get(c) + 1);
            }
        }
        return letters;
    }
}
