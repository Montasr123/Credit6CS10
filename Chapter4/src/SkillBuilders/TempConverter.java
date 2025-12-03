/*

Program: Bingo rules. java        		Date: Dec 3 2025

Purpose:Create a TempConverter application that converts a Fahrenheit temperature to the corresponding Celsius
temperature. 

Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/
package SkillBuilders;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert to Celsius using the formula C = 5/9 * (F - 32)
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
/*Screen Dump


Enter temperature in Fahrenheit: 23
Temperature in Celsius: -5.0







*/