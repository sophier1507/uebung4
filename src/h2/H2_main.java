package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x = true, y = false, a = false, b = true, c = true;
		int input = 11;
		x = input >= 10;
		y = (input == 11) || (input == 1);
		a = x && y;
		b = x || (x != y);
		c = !y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		}

}
