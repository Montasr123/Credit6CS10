/*

Program: Bingo rules. java        		Date: Dec 3 2025

Purpose:Create a CircleCircumference application that calculates and displays the circumference of a circle
Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/
package SkillBuilders;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constant for PI
        final double PI = 3.14159;

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate the circumference: C = 2πr
        double circumference = 2 * PI * radius;

        // Display the result
        System.out.println("The circumference of the circle is: " + circumference);
    }
}

/*Screen Dump



Enter the radius of the circle: 21
The circumference of the circle is: 131.94678






*/