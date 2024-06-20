package Testes;

import java.util.Scanner;

public class FirstProgram {

	Scanner scanner;
	
	public FirstProgram() {
		scanner = new Scanner(System.in);
	}
	
	public void Initialize() {
		System.out.println("What's your name?");
		String userName = scanner.nextLine();
		
		System.out.println("How old are u?");
		int userAge = scanner.nextInt();
		
		FinalMessage(userName, userAge);
	}
	
	public static String ActionByAge(int age) {
		if(age>=40) {
			return "too old!" ;
		} else if(age<40 && age>20) {
			return "acceptable..";
		} else {
			return "too young!";
		}
	}
	
	public static void FinalMessage(String name, int age) {
		System.out.println("Hi user: " + name + ", " + " you're " + ActionByAge(age));
	}
}
