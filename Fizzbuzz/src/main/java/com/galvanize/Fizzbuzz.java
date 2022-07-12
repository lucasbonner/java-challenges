package com.galvanize;

public class Fizzbuzz {
    /*
    Create a single method or function that accepts an integer, and returns a string,
    with the following acceptance criteria.

        - If the number is divisable by 3, return the string “Fizz”
        - If the number is divisable by 5, return the string “Buzz”
        - If the number is divisable by both 3 and 5, return the string “FizzBuzz”
        - Otherwise, return the number as a string
     */

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3)); //"Fizz"
        System.out.println(fizzBuzz(5)); //"Buzz);"
        System.out.println(fizzBuzz(9)); //"Fizz");
        System.out.println(fizzBuzz(15)); //"FizzBuzz");
        System.out.println(fizzBuzz(1)); //"1");
    }

    private static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(num);
        }
    }
}
