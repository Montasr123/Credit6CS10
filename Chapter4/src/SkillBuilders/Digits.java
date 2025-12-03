/*

Program: Bingo rules. java        		Date: Dec 1 2025

Purpose:Create a Digits application that prompts the user for a two-digit number and then displays the ones-place
and tens-place digits.

Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/
package SkillBuilders;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for a two-digit number
        System.out.print("Enter a two-digit number: ");
        int number = input.nextInt();

        // Extract tens and ones digits
        int tens = number / 10;   // integer division gives tens place
        int ones = number % 10;   // modulo gives ones place

        // Display the results
        System.out.println("Tens place: " + tens);
        System.out.println("Ones place: " + ones);

        input.close();
    }
}
/*Screen Dump


Enter a two-digit number: 34
Tens place: 3
Ones place: 4





*/