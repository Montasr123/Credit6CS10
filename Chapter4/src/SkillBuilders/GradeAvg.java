/*

Program: Bingo rules. java        		Date: Dec 1 2025

Purpose:Create a GradeAvg application that prompts the user for five grades and then displays the average of the
grades
Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/
package SkillBuilders;

import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for five grades
        System.out.print("Enter grade 1: ");
        int grade1 = input.nextInt();

        System.out.print("Enter grade 2: ");
        int grade2 = input.nextInt();

        System.out.print("Enter grade 3: ");
        int grade3 = input.nextInt();

        System.out.print("Enter grade 4: ");
        int grade4 = input.nextInt();

        System.out.print("Enter grade 5: ");
        int grade5 = input.nextInt();

        // Calculate the average using real division
        double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;

        // Display the average
        System.out.println("The average of the grades is: " + average);

        input.close();
    }
}


/*Screen Dump


Enter grade 1: 4
Enter grade 2: 5
Enter grade 3: 7
Enter grade 4: 09
Enter grade 5: 87
The average of the grades is: 22.4






*/