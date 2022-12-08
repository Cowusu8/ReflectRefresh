package com.javafiles;

import java.util.Scanner;

public class Find_Hypotenuse {

	public static void main(String[] args) {
		double a; // first declare variables
		double b;
		double c;

		Scanner sc = new Scanner(System.in); // add scanner statement to get input from user
		System.out.println("Enter side a: "); //ask the user a question
		a = sc.nextDouble(); // include this to store the users answer
		System.out.println("Enter side b: ");
		b = sc.nextDouble();
		c = Math.sqrt((a * a) + (b * b));
		System.out.println("The hypotenuse is:  " + c);

		sc.close();
	}

}
