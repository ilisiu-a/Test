package tema;

public class Tema1 {
	public void interschimbare(int a, int b) {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("interschimbare");
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public static void metoda() {
		byte x = 100;
		x = (byte) (x + 60);
		System.out.println(x);

	}

	public static void relational(int x, int y, int z) {
		System.out.println(x < y);
		System.out.println(x <= y);
		System.out.println(x > z);
		System.out.println(x >= z);
	}

	public static void incdecr(int a) {
		int x = 5 + a++;
		int y = 5 + ++a;
		System.out.println("y=" + x);
		System.out.println("k=" + y);
	}

	public static void logical(int x) {
		boolean y = (x >= 5) | (++x <= 6);// | -> evalueaza oricum ambele expresii , || -> daca prima este TRUE nu trece
											// la a doua...
		System.out.println("valoarea expresiei -> " + y);
		System.out.println(x);
	}

	public static void temperature(int temp) {
		if (temp >= 100) {
			System.out.println("FIERBE APA");
		} else if (temp < 50 && temp != 0) {
			System.out.println("APA SE INCALZESTE");
		} else if (temp == 0) {
			System.out.println("TEMPERATURA ESTE 0");
		} else {
			System.out.println("NU FIERBE APA");
		}
	}

	public static void exswitch(int grade) {
		switch (grade) {
		default:
			System.out.println("NOTA INVALIDA");
			break;
		case 10:
			System.out.println("EXCELENT");
			break;
		case 9:
			break;
		case 7:
			System.out.println("BINE");
			break;
		case 5:
			System.out.println("AI TRECUT");
			break;
		case 4:
			System.out.println("DATA VIITOARE");
			break;

		}
		System.out.println("NOTA TA ESTE : " + grade);
	}

	public static void nume(int x) {

	}

	public static void main(String[] args) {
		/* short t = (short) 1912123; System.out.println(t); */
		// interschimbare(4,54);
		// metoda();
		// incdecr(12);
		// relational(5,10,5);
		// logical(35);
		// temperature(10);
		// exswitch(5);
	}

}
