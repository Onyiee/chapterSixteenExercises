package com.ExerciseSixteenFourteen;
//16.14 (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
//        of each letter rather than of each word. For example, the string "HELLO THERE" contains
//        two Hs, three
//        Es, two Ls, one O, one T and one R. Display the results.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingLetters {
    public static void main(String[] args) {
        Map <Character, Integer> wordCount = new HashMap<>();

        System.out.println("Enter a string: ");

        Scanner input = new Scanner(System.in);
        String word = input.next();

        for (int counter = 0; counter < word.length(); counter++){
            if (wordCount.containsKey(word.charAt(counter)) ){
                int count = wordCount.get(word.charAt(counter));
                wordCount.put(word.charAt(counter),count+1);
            }else {
                wordCount.put(word.charAt(counter),1);
            }
        }
        for (Character c: wordCount.keySet()){
            System.out.println(c + " occurred " + wordCount.get(c));
        }
    }
}
