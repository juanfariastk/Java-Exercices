package Introducao;

import java.util.Scanner;

public class ReadAndMath {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose the first number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Choose the second number: ");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Sum of numbers: " + (firstNumber+secondNumber)+ 'a');
		System.out.println("Product of numbers: " + firstNumber*secondNumber);
	}
}
