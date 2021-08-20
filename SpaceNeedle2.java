// CSE 142 Homework 2 (Space Needle) solution
// Author: Marty Stepp
//
// This program prints a figure that looks like the Seattle Space Needle.
// It uses for loops for patterns, and static methods for structure/redundancy.
//
// PLEASE DO NOT DISTRIBUTE!
//
public class SpaceNeedle2 {
    public static final int SIZE = 4;   // controls figure size

    public static void main(String[] args) {
        drawAntenna();
        drawTop1();
        drawTop2();
        drawAntenna();
        drawStem();
        drawTop1();
    }

    // draws antenna on top of needle
    public static void drawAntenna() {
        for (int line = 1; line <= SIZE; line++) {
            for (int j = 1; j <= SIZE * 3; j++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    // draws widening top part of needle observation area
    public static void drawTop1() {
        for (int line = 1; line <= SIZE; line++) {
            int spaces = -3 * line + (3 * SIZE);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            int colons = 3 * (line - 1);
            for (int j = 1; j <= colons; j++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int j = 1; j <= colons; j++) {
                System.out.print(":");
            }
            System.out.println("\\__");
        }

        drawLine();
    }

    // draws a line of quote marks at center/bottom of figure
    public static void drawLine() {
        System.out.print("|");
        for (int i = 1; i <= 6 * SIZE; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    // draws narrowing bottom part of observation area
    public static void drawTop2() {
        for (int line = 1; line <= SIZE; line++) {
            int spaces = 2 * (line - 1);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            int slashes = -2 * line + (3 * SIZE + 1);
            for (int j = 1; j <= slashes; j++) {
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }

    // draws long thin stem of space needle
    public static void drawStem() {
        int spaces = 2 * SIZE + 1;

        for (int line = 1; line <= SIZE * SIZE; line++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int bars = 1; SIZE > bars; bars += SIZE) {
                System.out.print("|");
            }
            int percents = SIZE - 2;
            for (int j = 1; j <= percents; j++) {
                System.out.print("%");
            }
            System.out.print("||");
            for (int j = 1; j <= percents; j++) {
                System.out.print("%");
            }
            for (int bars = 1; SIZE > bars; bars += SIZE) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
