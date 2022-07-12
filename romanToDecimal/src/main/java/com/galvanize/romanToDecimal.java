package com.galvanize;

public class romanToDecimal {
    /*
       create a method or function convert roman numerals to decimal numbers

       I -> 1
       V -> 5
       X -> 10
       L -> 50
       C -> 100
       D -> 500
       M -> 1000

       numbers are formed by combining symbols together and adding the values
       generally symbols placed in order of value starting with the largest values

       when smaller values precede larger values
       the smaller values are subtracted from the larger values
       and the result is added to the total

       ex.
       I -> 1
       V -> 5
       IV -> 5-1 -> 4 (subtract smaller)
       MMVI -> 1000 + 1000 + 5 + 1 -> 2006 (only addition)

       MCMXLIV -> 1000 + (1000 - 100) + (50 - 10) + (5 - 1) -> 1944 (addition & subtraction)
     */

    public static void main(String[] args) {
        System.out.println(romanToDecimalMethod("I")); //1
        System.out.println(romanToDecimalMethod("V")); //5
        System.out.println(romanToDecimalMethod("IV")); //4
        System.out.println(romanToDecimalMethod("MMVI")); //2006
        System.out.println(romanToDecimalMethod("MCMXLIV")); //1944
    }

    private static int convertNumeral(String currentNumeral) {
        if (currentNumeral.equals("I")) {
            return 1;
        } else if (currentNumeral.equals("V")) {
            return 5;
        } else if (currentNumeral.equals("X")) {
            return 10;
        } else if (currentNumeral.equals("L")) {
            return 50;
        } else if (currentNumeral.equals("C")) {
            return 100;
        } else if (currentNumeral.equals("D")) {
            return 500;
        } else if (currentNumeral.equals("D")) {
            return 500;
        } else if (currentNumeral.equals("M")) {
            return 1000;
        }
        return 0;
    }

    private static int romanToDecimalMethod(String numeral) {
        String[] numerals = numeral.split("");
        int result = 0;
        int previousNumber = 0;

        for (int i = 0; i < numerals.length; i++) {
            String currentNumeral = numerals[i];

            int currentNumber = convertNumeral(currentNumeral);

            if (previousNumber == 0) {
                result += currentNumber;
            } else if (currentNumber > previousNumber) {
                result += (currentNumber - (previousNumber * 2));
            } else {
                result += currentNumber;
            }

            previousNumber = currentNumber;
        }

        return result;
    }
}
