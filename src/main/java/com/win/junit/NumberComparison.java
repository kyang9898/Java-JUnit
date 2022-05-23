package com.win.junit;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        int firstNum = inputFirstNumber();
        int secondNum = inputSecondNumber();
        System.out.println(compareNumbers(firstNum, secondNum));
    }

    public static int inputFirstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        return Integer.valueOf(scanner.nextInt());
    }

    public static int inputSecondNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second number: ");
        return Integer.valueOf(scanner.nextInt());
    }

    public static String compareNumbers(int firstNum, int secondNum) {
        if (firstNum == secondNum) {
            return "The numbers are the same.";
        } else if (firstNum < secondNum) {
            return "The first number is less than the second number.";
        } else {
            return "The first number is greater than the second number.";
        }
    }
}
