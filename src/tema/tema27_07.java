package tema;

public class tema27_07 {
//c3ex.3

	public static Tema1 tm1;

	public static void prime(int nr) {
		boolean pr = false;
		if (nr >= 0) {
			for (int i = 2; i < nr; i++)
				if (nr % i == 0)
					pr = true;
		} else
			for (int j = nr + 1; j < -2; j++)
				if (nr % j == 0)
					pr = true;
		if (pr == true)
			System.out.println("Numarul " + nr + " NU este prim ");
		else
			System.out.println("Numarul " + nr + " este prim");
	}

//c3ex.4
	public static int digitsSum(int nr) {
		int s = 0;
		while (nr != 0) {
			s += nr % 10;
			nr = nr / 10;
		}
		return s;
	}

//c3ex.5
	public static void fibonacci(int nr) {
		int x = 1, y = 1, z;
		System.out.print("Primele " + nr + " elemente ale sirului Fibonacii sunt : ");
		if (nr == 1)
			System.out.println("1");
		else
			System.out.print("1,1,");
		for (int i = 2; i < nr; i++) {
			z = x + y;
			System.out.print(z + ",");
			x = y;
			y = z;
		}
		System.out.println();
	}

	// c3ex.6
	public static void palindrom(int nr) {
		int nrp = nr % 10, nr2 = nr;
		nr2 = nr2 / 10;
		while (nr2 != 0) {
			nrp = nrp * 10 + nr2 % 10;
			nr2 = nr2 / 10;
		}
		if (nrp == nr)
			System.out.println("Numarul " + nr + " este palindrom");
		else
			System.out.println("Numarul " + nr + " NU este palindrom");
	}

//c3ex.7
	public static boolean zecedouazeci(int[] x) {
		for (int i = 1; i < x.length; i++)
			if ((x[i] == 10 && x[i + 1] == 10) || (x[i - 1] == 10 && x[i] == 10))
				return true;
			else if ((x[i] == 20 && x[i + 1] == 20) || (x[i - 1] == 20 && x[i] == 20))
				return true;
		return false;
	}

	// c3ex.8

	public static void imparPar(int[] x) {
		int sp = 0, si = 0;
		for (int i = 0; i < x.length; i++)
			if (x[i] % 2 == 0)
				sp += 1;
			else
				si += 1;
		System.out.println("In sirul dat sunt " + sp + " elemente pare si " + si + " elemnte impare");
	}

	// c3ex.9

	public static void interval(int[] x, int a, int b) {
		System.out.print("Elementele din sirul dat cuprinse in intervalul (" + a + "," + b + ") sunt : ");
		for (int i = a - 1; i <= b - 1; i++)
			System.out.print(x[i] + " ");
		System.out.println();
	}

	// c3ex10

	public static int prMiUl(int[] x) {
		int max = x[0];
		if (max < x[x.length - 1])
			max = x[x.length - 1];
		else if (max < x[(x.length) / 2])
			max = x[(x.length) / 2];

		return max;

	}

	// c3s10ex.3
	public static void ordonare(int[] x) {
		int a;
		do {
			a = 0;
			for (int i = 1; i < x.length; i++) {
				if (x[i] < x[i - 1]) {
					int aux = x[i];
					x[i] = x[i - 1];
					x[i - 1] = aux;
					a = 1;
				}
			}
		} while (a == 1);
	}

	public static boolean duplicate(int[] x) {
		ordonare(x);
		for (int i = 0; i < x.length - 1; i++)
			if (x[i] == x[i + 1])
				return true;
		return false;
	}

	// c3s10ex.4
	public static void dupRem(int[] x) {
		int k = 0;
		int[] y = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			boolean OK = false;
			for (int j = i + 1; j < x.length; j++)
				if (x[i] == x[j])
					OK = true;
			if (OK == false) {
				y[k] = x[i];
				k++;
			}

		}
		System.out.print("Sirul fara duplicate este : ");
		for (int i = 0; i < k; i++)
			System.out.print(y[i] + " ");
		System.out.println();
	}

	// c3s10ex.5
	public static void top2Max(int[] x) {
		ordonare(x);
		System.out.println("Top 2 elemente maxime din sir sunt : " + x[x.length - 1] + " si " + x[x.length - 2]);
	}

	public static void kElem(int[] x, int k) {
		ordonare(x);
		System.out.println("Cel mai mic al-" + k + "-lea element din sir este : " + x[k - 1]);
		System.out.println("Cel mai mare al-" + k + "-lea element din sir este : " + x[x.length - k - 1]);
	}

	public static void main(String[] args) {
		int nr = 11, k = 2;
		int[] x = { 95, 79, 21, 30, 21, 95, 79 };

		prime(nr);// apel c3ex.3
		System.out.println("Suma cifrelor numarului " + nr + " este " + digitsSum(nr));// apelc3 ex.4
		fibonacci(nr);// apel c3ex.5
		palindrom(nr);// apel c3ex.6
		if (zecedouazeci(x) == true)// apel c3ex.7
			System.out.println("contine un element 10 sau 20 unul langa celalalt");
		else
			System.out.println("NU contine un element 10 sau 20 unul langa celalalt");
		imparPar(x);// apel c3ex.8
		interval(x, 2, 5);// apel c3ex.9
		System.out.println("Elementul maxim dintre primul elemnt, cel din mijloc si ultimul elemnt al sirului este : "
				+ prMiUl(x));
		if (duplicate(x) == true)// apel c3s10ex3
			System.out.println("Exista duplicate");
		else
			System.out.println("NU exista duplicate");
		dupRem(x);// apel c3s10ex.4
		top2Max(x);// apel c3s10ex.5
		kElem(x, k);
	}

}
