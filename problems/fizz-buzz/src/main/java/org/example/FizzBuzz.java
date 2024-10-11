package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("args");
    }

    public  String compute(int minNumber,int maxNumber) {
        String result = "";
        while (minNumber <= maxNumber)
            result += buildString(minNumber++);
        return result;
    }

    private static String buildString(int minNumber) {
        if (minNumber % 15 == 0 )
            return "FizzBuzz";

        if (minNumber % 3 == 0)
            return "Fizz";

        if (minNumber % 5 == 0)
            return "Buzz";
        return String.valueOf(minNumber);
    }
}
