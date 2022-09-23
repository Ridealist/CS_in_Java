package basic.grammar;

public class Datatype {
	public static void main (String[] args) {
		System.out.println(6); // Number
		System.out.println("six"); // String
		System.out.println("6"); // String 6
		
		System.out.println('H'); // Char 문자
		System.out.println("H"); // String 문자열
		
		System.out.println("1111".length()); // 4
//		System.out.pringln(1111.length()) // 1111은 숫자로 length() 메소드 없음
//		System.out.println("6"*"6");
		System.out.println("6" + "6");
	}
}