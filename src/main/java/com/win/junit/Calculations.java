package com.win.junit;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        System.out.println("Enter any number:");
        int firstNum = inputNumber();
        System.out.println("Enter another number:");
        int secondNum = inputNumber();

        printOuts(firstNum, secondNum);
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int addition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int subtraction(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int multiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static double division(int firstNum, int secondNum) {
        return (double) firstNum / (double) secondNum;
    }

    public static int modulos(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }

    public static void printOuts(int firstNum, int secondNum) {
        int additionValue = addition(firstNum, secondNum);
        int subtractionValue = subtraction(firstNum, secondNum);
        int multiplicationValue = multiplication(firstNum, secondNum);
        double divisionValue = division(firstNum, secondNum);
        int moduloValue = modulos(firstNum, secondNum);

        System.out.println(firstNum + " + " + secondNum + " = " + additionValue);
        System.out.println(firstNum + " - " + secondNum + " = " + subtractionValue);
        System.out.println(firstNum + " * " + secondNum + " = " + multiplicationValue);
        System.out.println(firstNum + " / " + secondNum + " = " + divisionValue);
        System.out.println(firstNum + " % " + secondNum + " = " + moduloValue);
    }
}
