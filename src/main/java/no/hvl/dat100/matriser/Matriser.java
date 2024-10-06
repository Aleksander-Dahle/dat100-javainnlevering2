package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] row : matrise) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		StringBuilder toString = new StringBuilder();
		for (int[] row : matrise) {
			for (int element : row) {
				toString.append(element).append(" ");
			}
			toString.append("\n");
		}
		return toString.toString();

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] newMaterix = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				newMaterix[i][j] = matrise[i][j] * tall;
			}
		}
		return newMaterix;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a == b) {
			return true;
		}

		if (a == null || b == null || a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;

	}

	
}
