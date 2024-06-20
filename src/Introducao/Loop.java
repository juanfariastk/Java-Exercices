package Introducao;

public class Loop {
	public static void main(String[] args) {
		for(int i = 1; i <= 3 ; i++) {
			System.out.println("Simple loop var -> " + i );
		}
		
		int count = 1;
		while(count<=3) {
			System.out.println("While loop var -> " + count);
			count++;
		}
		
		int conditionalCount = 1;
		do {
			System.out.println("Do loop var -> " + conditionalCount);
			conditionalCount++;
		}while(conditionalCount<3);
	}
}
