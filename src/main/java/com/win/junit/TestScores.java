package com.win.junit;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        int grade = gradeInput();
        System.out.println(testGrade(grade));
    }

    public static int gradeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade scores between 0-100: ");
        return Integer.valueOf(scanner.nextInt());
    }

    public static String testGrade(int score) {
        if (score < 60 && score > 0) {
            return "You made an F... You failed!";
        } else if (score >= 60 && score < 70) {
            return "You made a D!";
        } else if (score >= 70 && score < 80) {
            return "You made a C!";
        } else if (score >= 80 && score < 90) {
            return "You made a B!";
        } else if (score >= 90 && score <= 100) {
            return "Great Job! You passed and made an A!";
        } else {
            return "How did you get over 100?!";
        }
    }
}
