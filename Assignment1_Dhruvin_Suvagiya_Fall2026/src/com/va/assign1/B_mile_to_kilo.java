package com.va.assign1;
import java.util.Scanner;
/*
 * Author: Dhruvin
 * Date: 09/19/2026
 * Description: Takes input for miles from the user then converts it to kilometers.
 */
public class B_mile_to_kilo {
	// Method for converting miles into kilometeres
	
	public void convert(Scanner input) 
	{
		
		System.out.println("Enter the miles: ");
		double miles = input.nextDouble();
		double kilometers = miles*1.60934;
		System.out.println(miles + " Miles =" + kilometers + " Kilometers");
	}
}
