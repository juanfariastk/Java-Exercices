package Introducao;

import java.util.Scanner;

public class Conditonals {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are u?");
		int userAge = scanner.nextInt();
		
		if(userAge >= 30 ) {
			System.out.println("You have only 20 years to live...");
		} else {
			System.out.println("Soo.... don't return here!");
		}
		
		/*
		switch(userAge){
			case 30 : 
				System.out.println("You have only 20 years to live...");
				break;
			case 20 :
				System.out.println("You have only 25 years to live...");
				break;
			//optional
			default:
				System.out.println("Soo... don't return here!");
		
		}
		*/
		
		String caseResult = (userAge>=30) ? "You have only 20 years to live..." : "Soo.. don't return here!" ;
		System.out.println(caseResult);
	}
}
