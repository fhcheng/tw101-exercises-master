package com.thoughtworks.tw101.introductory_programming_exercises;

public class TriangleExercises {
    public static void main(String[] args) {
        drawAnAsterisk();
        drawAHorizontalLine(8);
        drawAVerticalLine(3);
        drawARightTriangle(3);
    }

//    Easiest exercise ever
//    Print one asterisk to the console.
//    Example: *
    private static void drawAnAsterisk() {
        System.out.println("Draw an asterisk:");
        System.out.println("*");
        System.out.println();
    }

//    Draw a horizontal line
//    Given a number n, print n asterisks on one line.
//    Example when n=8:  ********
    private static void drawAHorizontalLine(int n) {
        System.out.println("Draw a horizontal line:");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }

//    Draw a vertical line
//    Given a number n, print n lines, each with one asterisks
//    Example when n=3:
//            *
//            *
//            *
    private static void drawAVerticalLine(int n) {
        System.out.println("Draw a vertical line:");
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println("");
    }

//    Draw a right triangle
//    Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
//    Example when n=3:
//            *
//            **
//            ***
    private static void drawARightTriangle(int n) {
        System.out.println("Draw a right triangle:");
        int numAsterisks = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < numAsterisks; j++) {
                System.out.print("*");
            }
            numAsterisks++;
            System.out.println("");
        }
    }
}
