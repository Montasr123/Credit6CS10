/*

Program: Bingo rules. java        		Date: Dec 3 2025

Purpose:Create a PizzaCost application that prompts the user for the size of a pizza and then displays the cost
of making the pizza

Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/package Mastery;

import java.util.Scanner;

public class PizzaCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        final double LABOUR = 0.75;
        final double RENT = 1.00;

        // Ask user for pizza size
        System.out.print("Enter the pizza diameter in inches: ");
        double diameter = input.nextDouble();

        // Materials cost formula
        double materials = 0.05 * diameter * diameter;

        // Total cost
        double totalCost = LABOUR + RENT + materials;

        // Display result
        System.out.println("The cost of making the pizza is: $" + totalCost);
    }
}

/*Screen Dump


Enter the pizza diameter in inches: 12
The cost of making the pizza is: $8.950000000000001







*/
