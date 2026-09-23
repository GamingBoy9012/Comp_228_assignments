package com.va.assign1;
import java.util.Scanner;
/*
 * Author: Dhruvin
 * Date: 09/19/2026
 * Description: Asks user for marks for 4 subjects, calculates the average, and displays the corresponding grade from A to F.
 */
public class A_Calculator {
	//metjod for calculating average
	public double average(double mark1,double mark2, double mark3, double mark4)
	{
		return (mark1 + mark2 + mark3 + mark4)/3 ;
	}
	
	//method for getting the Grade according based on the average
	public String grade(double average) //using string cause the return datatyoe will be string 
	{
		if (average >= 80) { return "A"; }
		else if (average >= 70) { return "B"; }
		else if (average >= 60) { return "C"; }
		else if (average >= 50) { return "D"; }
		else { return "F"; }
	}
	
	public void Showgrades(Scanner input) {
		System.out.println("Enter marks for 4 subjects: ");
		double mark1 = input.nextDouble();
		double mark2 = input.nextDouble();
		double mark3 = input.nextDouble();
		double mark4 = input.nextDouble();
		double average = average(mark1, mark2, mark3, mark4);
		System.out.println("Grade: " + grade(average));
    }
	
}