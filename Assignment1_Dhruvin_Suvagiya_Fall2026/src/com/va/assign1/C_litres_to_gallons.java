package com.va.assign1;
import java.util.Scanner;
/*
 * Author: Dhruvin
 * Date: 09/19/2026
 * Description: Takes input for liters from the user and converts it to gallons.
 */
public class C_litres_to_gallons {
	// Method for converting liters intogallons
	public void convert_2(Scanner input)
	{
		System.out.println("Enter the Liters: ");
		double liters = input.nextDouble();
		double gallons = liters * 0.264172;
		System.out.println(liters + " Liters  = " + gallons + " gallons");
	}
}
