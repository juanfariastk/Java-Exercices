package Introducao;

public class DataTypes {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int firstPrimitiveInt = 1;
		double firstPrimitiveDouble = 4.8;
		char firstPrimitiveChar = 'a';
		String firstString = "aaaaaaa";
		boolean firstPrimitiveBoolean = false;
		
		System.out.println(firstPrimitiveInt + "\n" + ((Object) firstPrimitiveInt).getClass().getName());
	}
}
