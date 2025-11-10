package h3;

public class H3_main {

	public static void main(String[] args) {
		float celsiusFloat = 14.2f, fahrenheitFloat = 9;
		double celsiusDouble = 14.2f, fahrenheitDouble = 7;
		
		fahrenheitFloat = celsiusFloat * 9/5 + 32;
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
		
		System.out.println(fahrenheitFloat);
		System.out.println(fahrenheitDouble);

	}

}
