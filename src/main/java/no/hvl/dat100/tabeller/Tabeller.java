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

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
