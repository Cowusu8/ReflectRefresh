package com.javafiles;
import java.util.Scanner;
/*
 * Author @Crystal Owusu
 */

public class string {

	public static void main(String[] args) {
		String greeting = "hello world";
		System.out.println(greeting);

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );

			String palindrome = "I was seen"; // it counts the spaces

			int len = palindrome.length(); // Using the length method
			System.out.println("String Length is : " + len);

			String string1 = "saw I was ";
			System.out.println("Dot " + string1 + "Crystal");

			Scanner scan = new Scanner(System.in);
			System.out.println("What is you name? ");
			String name = scan.nextLine();
			System.out.println("What is you age? ");
			String age = scan.nextLine();
			System.out.println("My name is " + name + " and I am proudly " + age + "years old.");
			

		}

	}




