package com.va.assign1;
import java.util.Scanner;
/*
 * Author: Dhruvin
 * Date: 09/19/2026
 * Description: Creating objects for each tasks and calls their methods to get the results.
 */
public class DriverMain {
	public static void main(String[] args) {
		// scanner objext
		Scanner input = new Scanner(System.in);
		System.out.println("Task A");
		A_Calculator a = new A_Calculator();
		a.Showgrades(input); //calling the method
		System.out.println("___________________________________");
		
		
		System.out.println("Task B");
		B_mile_to_kilo b = new B_mile_to_kilo();
		b.convert(input);
		System.out.println("___________________________________");
		
		
		System.out.println("Task C");
		C_litres_to_gallons c = new C_litres_to_gallons();
		c.convert_2(input);
		System.out.println("___________________________________");
		
		
		System.out.println("Task D");
		D_cad_to_usd d = new D_cad_to_usd();
		d.convert_3(input);
		input.close();
	}

}
