package com.javafiles;
public class WhileIteration {
	/*
	 * Author @Crystal Owusu
	 */

	public static void forIteration() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("This is the for loop : " + i);
		}
	}

	public static void whileIteration() {
		int i = 0;
		while (i <= 3) {
			System.out.println("This is the while loop: " + i);
			i++;
		}
	}
	public static void doWhileIteration() {
		int i = 1;
		do {
			System.out.println("This is the do while loop: " + i);
			i++;
		} while (i < 4);
	}

	public static void main(String[] args) {
		forIteration();// for loop
		System.out.println("-------------------------");
		whileIteration();// while loop
		System.out.println("-------------------------");
		doWhileIteration();// dowhileloop
		System.out.println("-------------------------");
	}
}


