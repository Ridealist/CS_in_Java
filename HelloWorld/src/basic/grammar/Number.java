package basic.grammar;

public class Number {
	
	public static void main(String[] args) {
		// Operator
		System.out.println(6 + 2); // 8
		System.out.println(6 - 2);
		System.out.println(6 * 2);
		System.out.println(6 / 2);
		
		int i = 6 / 2;
		System.out.println(((Object)i).getClass().getSimpleName());
		
		// https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html Math 클래스 링크
		System.out.println(Math.PI); // Math class
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.ceil(Math.PI));
	}
}