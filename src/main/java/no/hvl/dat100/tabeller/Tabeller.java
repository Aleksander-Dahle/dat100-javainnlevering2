package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		if (tabell.length == 0) {
			System.out.println("Array is empty");
		} else {
			for (int i = 0; i < tabell.length; i++) {
				System.out.println(tabell[i]);
			}
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder toString = new StringBuilder("[");

		for (int i = 0; i < tabell.length; i++) {
			toString.append(tabell[i]);

			if (i < tabell.length - 1) {
				toString.append(",");
			}
		}

		toString.append("]");

		return toString.toString();

	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];

		}
		return sum;

	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {

				return true;

			}

		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}

		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversed = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			reversed[i] = tabell[tabell.length - 1 - i];
		}

		return reversed;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if (tabell.length <= 1) {
			return true;
		}

		int prev = tabell[0];

		for (int e : tabell) {

			if (e < prev) {
				return false;
			}
			prev = e;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] newTab = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			newTab[i] = tabell1[i];
		}
		

		for (int i = 0; i < tabell2.length; i++) {
			newTab[tabell1.length + i] = tabell2[i];
		}

		return newTab;

	}
}
