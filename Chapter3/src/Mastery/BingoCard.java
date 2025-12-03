/*

Program: Bingo rules. java        		Date: Nov 26 2025

Purpose: Create a BingoCard application that displays a traditional bingo card with five columns of five unique
numbers.
Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/package Mastery;

import java.util.Random;

public class BingoCard {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] card = new int[5][5]; // 5x5 bingo card

        // Ranges for each column
        int[] minRanges = {1, 16, 31, 46, 61};
        int[] maxRanges = {15, 30, 45, 60, 75};

        // Fill card
        for (int col = 0; col < 5; col++) {
            boolean[] used = new boolean[maxRanges[col] + 1];
            for (int row = 0; row < 5; row++) {
                if (col == 2 && row == 2) { 
                    // Middle space
                    continue;
                }

                int num;
                do {
                    num = rand.nextInt(maxRanges[col] - minRanges[col] + 1) + minRanges[col];
                } while (used[num]);

                used[num] = true;
                card[row][col] = num;
            }
        }

        // Print column headers
        System.out.println(" B   I   N   G   O");

        // Print card rows
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 2 && row == 2) {
                    System.out.print("FREE ");
                } else {
                    System.out.printf("%-4d", card[row][col]);
                }
            }
            System.out.println();
        }
    }
}

/*Screen Dump


 B   I   N   G   O
15  27  34  52  71  
5   22  33  47  64  
1   25  FREE 49  61  
14  21  36  57  62  
7   24  39  51  65 






*/