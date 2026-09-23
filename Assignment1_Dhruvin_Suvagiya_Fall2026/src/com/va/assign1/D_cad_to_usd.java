package com.va.assign1;

import java.util.Scanner;
/*
 * Author: Dhruvin
 * Date: 09/19/2026
 * Description: Takes  input for CAD then converts it to USD using the exchange rate.
 */
public class D_cad_to_usd {
	public void convert_3(Scanner input)
	{
		// Method for converting CAD to USD
		System.out.println("Enter the CAD: ");
		double cad = input.nextDouble();
		double usd = cad * 0.71;
		System.out.println(cad + " CAD  = " + usd + " USD");
	}
}
