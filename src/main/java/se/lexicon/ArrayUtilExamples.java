package se.lexicon;

import java.util.Arrays;

public class ArrayUtilExamples {

    public static void main(String[] args) {

        // Create an array of names to demonstrate sorting
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};

        Arrays.sort(names); // sorts the name array in acceding order (alphabetical order)
        System.out.println(Arrays.toString(names)); // converts array to a read able string
        // F: 70
        // J: 74
        // e: 101

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER); // sorts the array in case-insensitive order
        System.out.println(Arrays.toString(names)); // converts array to a readable string
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER.reversed()); // sorts the array in case-insensitive **reverse order**
        System.out.println(Arrays.toString(names)); // converts array to a readable string


        int[] numbers = {10, 20, 30, 40};
        int[] newCreatedArray = Arrays.copyOf(numbers, numbers.length + 1); // [10, 20, 30, 40, 0]

        newCreatedArray[newCreatedArray.length-1] = 50000;

        System.out.println(Arrays.toString(newCreatedArray));

        // System.arraycopy(...);



    }
}
