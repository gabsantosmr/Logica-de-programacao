package aulas;

import java.util.Scanner;

public class Atividadewhile {

	public static void main(String[] args) {
		int X = 1;
		while  (X >= 1 && X <= 1000) {
		Scanner entrada = new Scanner (System.in);
		X = entrada.nextInt();
		entrada.close();
			int A = 1;
			while (A <= X) {
				System.out.println(A);
				A += 2;
			}
		}
	}
}