package p2;

public class P2_main {

	public static void main(String[] args) {
		int a = 3, b = 5, c = 6;
		int intResult;
		double x = 1.5, y = 2.3;
		double doubleResult;
		
		intResult = c - a * 3; // -3 int
		System.out.println(intResult);
		intResult = c / b; // 1 int
		System.out.println(intResult);
		intResult = a + b / c; // 3 int
		System.out.println(intResult);
		doubleResult = c / b; // 1 int wird zu 1.0 double
		System.out.println(doubleResult);
		doubleResult = x + a / b; // 1.5 double
		System.out.println(doubleResult);
		doubleResult = x + y * b; // 13.0 double
		System.out.println(doubleResult);

	}

}
