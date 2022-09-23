package basic.grammar;

public class StringApp {
	
	public static void main(String[] args) {
		
		// Character vs String
		System.out.println("Hello World"); // String은 "" 
		System.out.println('H'); // Character ''
		System.out.println("H");
		
		System.out.println("Hello "
				+ "World");
		
		// new line
		System.out.println("Hello \nWorld"); // \n은 개행 문자
		
		// escape = 문자를 일시적으로 해방시키는 것을 뜻하는 문법.
		System.out.println("Hello \"World\""); // Hello "World", \를 붙여주면 따옴표도 문자열로 인식해 출력
	}
}