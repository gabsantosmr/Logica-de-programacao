package aulas;

import java.util.Arrays;

public class Aula9 {

	public static void main(String[] args) {
		
		// Array bidimensional
		
		int[][] valores = new int[2][2];
		valores[0][0] = 0;
		valores[0][1] = 1;
		valores[1][0] = 2;
		valores[1][1] = 3;
		System.out.print(valores[0][0] + " ");
		System.out.println(valores[0][1]);
		System.out.print(valores[1][0] + " ");
		System.out.println(valores[1][1]);
		
		// Laços (enhanced for)
		
		for (int[] valor : valores) {
			  System.out.println(Arrays.toString(valor));
		}
	}
}