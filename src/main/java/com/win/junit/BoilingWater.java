package com.win.junit;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        int numberInput = inputNumber();
        System.out.println(isBoiling(numberInput));
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than 212: ");
        return scanner.nextInt();
    }

    public static String isBoiling(int number) {
        if (number > 212) {
            return "Water is boiling!";
        } else if (number == 212) {
            return "The water is starting to boil";
        } else {
            return "Water is not boiling yet";
        }
    }
}
