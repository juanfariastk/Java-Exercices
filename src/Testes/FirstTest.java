package Testes;

import java.util.Scanner;

public class FirstTest {
	
	/* Crie um programa, usando uma classe de auxilio, para receber a idade e o nome do usuario. 
	   Deve printar na tela uma mensagem de acordo com a idade recebida.
	   O programa deve finalizar com alguma ação (open flag).
	 */
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String exitConditional;
		Scanner scanner = new Scanner(System.in);
		
		do {
			FirstProgram theChosenProgram = new FirstProgram();
			theChosenProgram.Initialize();
			
			System.out.println("exit? yes or no?");
			exitConditional = scanner.nextLine().strip().toLowerCase();
			
		}while(exitConditional.equals("no"));
	}

}
