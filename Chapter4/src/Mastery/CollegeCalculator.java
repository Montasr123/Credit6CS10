/*

Program: Bingo rules. java        		Date: Dec 3 2025

Purpose:Create a CollegeCalculator application that
prompts the user for the amount of each expense and offset cost.

Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/package Mastery;

import java.util.Scanner;

public class CollegeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for expenses
        System.out.print("Enter tuition cost: ");
        double tuition = input.nextDouble();

        System.out.print("Enter rent cost (for the year): ");
        double rent = input.nextDouble();

        System.out.print("Enter textbook cost: ");
        double books = input.nextDouble();

        System.out.print("Enter food cost (for the year): ");
        double food = input.nextDouble();

        System.out.print("Enter transportation cost: ");
        double transport = input.nextDouble();

        // Prompt for offsets
        System.out.print("Enter scholarship amount: ");
        double scholarship = input.nextDouble();

        System.out.print("Enter bursary amount: ");
        double bursary = input.nextDouble();

        // Total calculation
        double expenses = tuition + rent + books + food + transport;
        double offsets = scholarship + bursary;
        double totalNeeded = expenses - offsets;

        // Display
        System.out.println("\nTotal amount needed for the school year: $" + totalNeeded);
    }
}

/*Screen Dump


Enter tuition cost: 12000
Enter rent cost (for the year): 500
Enter textbook cost: 200
Enter food cost (for the year): 3000
Enter transportation cost: 400
Enter scholarship amount: 700
Enter bursary amount: 400

Total amount needed for the school year: $15000.0







*/
