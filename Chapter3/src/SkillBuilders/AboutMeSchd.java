/*

Program: Bingo rules. java        		Date: Nov 26 2025

Purpose:Modify the AboutMe application to include your class schedule, the days of the week that your class meets,
and the start and end time of each class. Include code to properly align 
Author: Montasr Mohamed
School: CHHS
Course: Computer Science 10
 

*/


package SkillBuilders;

public class AboutMeSchd {

	public static void main(String[] args) {
		// TODO Auic class AboutMeSchedule 
		   
		        // Personal info
		        System.out.println("First Name: Montasr S.");
		        System.out.println("Instructor: Mr. Abdulla");
		        System.out.println("School: Crescent Heights High School");
		        System.out.println("\"Go Cowboys!\"");
		        System.out.println();

		        // Schedule header
		        System.out.printf("%-15s %15s %15s%n", "Day", "Start Time", "End Time");
		        System.out.println("-----------------------------------------------------");

		        // Class schedule (same each weekday)
		        System.out.printf("%-15s %15s %15s%n", "Computing Sci", "08:55 AM", "10:25 AM");
		        System.out.printf("%-15s %15s %15s%n", "CALM / PE", "10:28 AM", "11:58 AM");
		        System.out.printf("%-15s %15s %15s%n", "ELA 10-1 AP", "12:34 PM", "02:04 PM");
		        System.out.printf("%-15s %15s %15s%n", "Science 10", "02:07 PM", "03:37 PM");
		    }
		

	}
        

/*Screen Dump	


First Name: Montasr S.
Instructor: Mr. Abdulla
School: Crescent Heights High School
"Go Cowboys!"

Day                  Start Time        End Time
-----------------------------------------------------
Computing Sci          08:55 AM        10:25 AM
CALM / PE              10:28 AM        11:58 AM
ELA 10-1 AP            12:34 PM        02:04 PM
Science 10             02:07 PM        03:37 PM





*/