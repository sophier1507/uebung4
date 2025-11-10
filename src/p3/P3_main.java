package p3;

public class P3_main {

	public static void main(String[] args) {
		boolean x, y;
		x = true;
		y = true;
		System.out.println(!(x!=y && x==y));
		System.out.println(x || true);
		System.out.println(x && false);
		System.out.println((x&&!y) || (!x));
		
		y = false;
		System.out.println(!(x!=y && x==y));
		System.out.println(x || true);
		System.out.println(x && false);
		System.out.println((x&&!y) || (!x));
		
		x = false;
		y = true;
		System.out.println(!(x!=y && x==y));
		System.out.println(x || true);
		System.out.println(x && false);
		System.out.println((x&&!y) || (!x));
		
		y = false;
		System.out.println(!(x!=y && x==y));
		System.out.println(x || true);
		System.out.println(x && false);
		System.out.println((x&&!y) || (!x));
		
	}

}
