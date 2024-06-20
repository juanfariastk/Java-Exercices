package Introducao;

public class Functions {
	public static void main(String[] args) {
		System.out.println(HelloWorld());
		System.out.println(IntroduceUs("Juan"));
	}
	
	public static String HelloWorld() { 
		return "Hello World!";
	}
	
	public static String IntroduceUs(String name) {
		return "Hello " + name + '!';
	}
	
}
