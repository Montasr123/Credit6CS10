/*

Program: Bingo rules. java        		Date: Nov 26 2025

Purpose:Create a Rectangle application that displays a rectangle of asterisks (*). 
Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/package Mastery;

public class Rectangle {
    public static void main(String[] args) {
        int width = 15;
        int height = 7;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*Screen Dump









*/