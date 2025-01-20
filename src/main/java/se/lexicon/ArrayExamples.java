package se.lexicon;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        // Declaration
        // dataType[] arrayName;
        int[] numbers;
        String[] names;

        // Initialization
        // arrayName = new dataType[size];
        numbers = new int[3];  // [ 0 , 0  ,  0 ] size = 3
        names = new String[5]; // [ null , null , null , null , null ] // size = 5

        // Initialization with Specific values
        int[] newNumbers = new int[]{2, 4, 6, 8};

        // Shortened Syntax
        int[] newNumbers2 = {2, 4, 6, 8};

        // Empty array
        char[] letters = new char[0]; // []

        System.out.println("-------------");
        int[] numbers2 = {-2, 50, 8, 1};
        System.out.println(findMaxNumber(numbers2)); // 50
        System.out.println("-------------");

    }


    public static void ex1() {

        String[] names = new String[3]; // [null, null, null]

        // Print the length of the array
        System.out.println(names.length); // Output: 3

        // Assign values to specific positions in the array
        names[0] = "Fredrik";  // ["Fredrik", null, null]
        names[names.length - 1] = "Jonas"; // ["Fredrik", null, "Jonas"]

        // Access and print elements of the array
        System.out.println(names[0]); // Fredrik
        System.out.println(names[1]); // null
        System.out.println(names[names.length - 1]); // Jonas

        // Uncommenting the following line to see throwing an Exception
        //System.out.println(names[3]); // Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    }

    // Iterating through the array
    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7}; // 5

        // Iterating through the array using an index-based for loop
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                numbers[i] = 200;
            }
            System.out.println("Index[" + i + "] = " + numbers[i]);
        }

        System.out.println("-------------------");

        // Iterating through the array using an enhanced for loop (for-each loop)
        for (int number : numbers) {
            if (number == 5) {
                number = 5000; //
            }
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers)); // Output: [ 5  , 2  , 200  , 4  , 7 ]


        // Use enhanced for loops when:
        // - You only need to read elements (index access is not required).
        // - Cleaner and more readable code is preferred.
        // - No need to modify elements or work with their indexes.

        // Use basic (traditional) for loops when:
        // - You need access to the index of each element.
        // - You need to modify elements directly in the array.
        // - You need more control over the iteration process (e.g., custom step size, reverse iteration).
        // - You are working with multi-dimensional arrays or complex iteration logic.
    }


    // Array Expansion
    public static void ex3() {
        // Original array with fixed size
        int[] originalArray = {5, 2, 3, 4, 7}; // size = 5

        // Printing the original array
        for (int num : originalArray) {
            System.out.println(num);
        }
        int newElement = 9;

        // Create a new array with a larger size
        int[] newArray = new int[originalArray.length + 1]; // [0, 0, 0, 0, 0, 0] size = 6
        // Copy elements from the original array to the new array.
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i]; // [5, 2, 3, 4, 7, 0]
        }

        //  Add a new element to the end of the new created array
        newArray[newArray.length - 1] = newElement; // [5, 2, 3, 4, 7, 9]
    }

    /*
     * Question:
     * Write a program that finds the maximum number in a given array of integers.
     */
    public static int findMaxNumber(int[] numbers) { // [2,5,8,1]
        // *** validate the param ***
        if (numbers == null){
            throw new IllegalArgumentException("Array should not be null.");
        }
        if (numbers.length == 0){
            throw new IllegalArgumentException("Array should not be empty.");
        }

        // Step1: initialize a variable to store the maximum value found. and set the first element of the array
        int maxNumber = numbers[0]; // 2
        // Step2: iterate through the array to find the max value.
        for (int i = 1; i < numbers.length; i++) {
            // Step3: Compare each element with the current max number
            if (numbers[i] > maxNumber) {
                // Step4: update the max number
                maxNumber = numbers[i];
            }
        }

        // return the max number
        return maxNumber;
    }

}
