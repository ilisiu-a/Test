package tema;

public class WhileLoop {
	public static void test() {
		int x = 20;
		while (x > 1) {
			System.out.print("x= " + x + " ");
			x--;
		}
	}

	public static void test2() {
		int x = 1;
		do {
			System.out.print("x:" + x + " ");
			x++;

		} while (x < 20);
	}

	public static void test3() {
		for (int x = 1; x <= 20; x++) {
			System.out.print(x + " ");
		}
	}

	public static void mmr(int a, int b) {
		if (a > b)
			System.out.println(a + " este mai mare ca " + b);
		else
			System.out.println(b + " este mai mare ca " + a);

	}

	public static void parImp(int a) {
		if (a % 2 == 0)
			System.out.println(a + " este par");
		else
			System.out.println(a + " este impar ");

	}

	public static void anBisect(int an) {
		if ((an % 4 == 0 && an % 100 != 0) || an % 400 == 0)
			System.out.println("bisect");
		else
			System.out.println("nu este bisect");
	}

	public static void fizzy(int x) {
		if (x % 3 == 0 && x % 5 == 0)
			System.out.println("fizzbuzz");
		else if (x % 5 == 0)
			System.out.println("buzz");
		else if (x % 3 == 0)
			System.out.println("fizz");
		else
			System.out.println("NU fizz / Nu buzz");

	}

	public static int factit(int x) {
		int res = 1;
		while (x != 0) {
			res *= x;
			x--;
		}
		return res;
	}

	public static int factrec(int x) {
		if (x == 0)
			return 1;
		return x * factrec(x - 1);
	}

	public static void main(String[] args) {
		/*
		 * test(); System.out.print("\n"); test2(); System.out.print("\n"); test3();
		 * System.out.print("\n"); mmr(10, 12); parImp(6); anBisect(2000);
		 * 
		 * fizzy(15);
		 */
		System.out.println("iteratie : " + factit(10));
		System.out.println("recursivitate : " + factrec(10));
	}
}
