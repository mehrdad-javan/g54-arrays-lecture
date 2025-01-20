package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayExamplesTest {

    // Example scenarios to test findMaxNumber
    // An array with positive numbers
    // An array with negative numbers
    // An array with a mix of + nad - numbers
    // An array wit a duplicate element
    // An empty array
    // and add more use cases ad needed...

    // An array with positive numbers

    @Test
    @DisplayName("Find the maximum number in an array of positive numbers")
    void findMaxNumberWithPositiveNumbers() {
        // Scenario
        int[] numbers = {1, 8, 70, 4};
        // Expected
        int expected = 70;
        // Actual
        int actual = ArrayExamples.findMaxNumber(numbers); // 70
        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    // Commonly used assertion methods include:
    // - `assertEquals(expected, actual)`: Verifies that the expected and actual values are equal.
    // - `assertNotEquals(expected, actual)`: Ensures the expected and actual values are not equal.
    // - `assertTrue(condition)`: Validates that the given condition is true.
    // - `assertFalse(condition)`: Validates that the given condition is false.
    // - `assertThrows(exceptionClass, executable)`: Checks that a specific exception is thrown when executing code.
    // - `assertNull(object)`: Ensures that the provided object is null.
    // - `assertNotNull(object)`: Ensures that the provided object is not null.


    /*
    Generate a Junit 5 test case for a method findMaxNumber that handles an array with negative numbers and validate the result please.-
    Here is an Example that handles an array with positive numbers abd validate the result.
    Example1:
    @Test
    @DisplayName("Find the maximum number in an array of positive numbers")
    void findMaxNumberWithPositiveNumbers() {
        // Scenario
        int[] numbers = {1, 8, 70, 4};
        // Expected
        int expected = 70;
        // Actual
        int actual = ArrayExamples.findMaxNumber(numbers); // 70
        // Verify the result
        Assertions.assertEquals(expected, actual);
    }
     */

    @Test
    @DisplayName("Find the maximum number in an array of negative numbers")
    void findMaxNumberWithNegativeNumbers() {
        // Scenario
        int[] numbers = {-10, -20, -3, -40};
        // Expected
        int expected = -3;
        // Actual
        int actual = ArrayExamples.findMaxNumber(numbers); // -3
        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    // add more test cases as needed...

}
