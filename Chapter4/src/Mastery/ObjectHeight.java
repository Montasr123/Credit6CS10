/*

Program: Bingo rules. java        		Date: Dec 3 2025

Purpose:The height of an object at any given time dropped from a starting height of 100 meters is given by the
equation h=100–4.9*t2 where t is the time in seconds 

Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/package Mastery;

import java.util.Scanner;

public class ObjectHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter time in seconds (less than 4.5): ");
        double t = input.nextDouble();

        // Calculate height: h = 100 - 4.9 * t^2
        double height = 100 - 4.9 * (t * t);

        // Display result
        System.out.println("Height of the object at time " + t + " seconds: " + height + " meters");
    }
}


/*Screen Dump


Enter time in seconds (less than 4.5): 2
Height of the object at time 2.0 seconds: 80.4 meters







*/
