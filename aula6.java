package aulas;

import java.util.Scanner;

public class aula6 {

	public static void main(String[] args) {
		System.out.print("Digite um valor: ");
		Scanner entrada = new Scanner (System.in);
		int valor = entrada.nextInt();
		entrada.close();
		switch (valor) {
		case 20:
			System.out.println("Valor igual a 20");
		break;
		case 21:
			System.out.println("Valor igual a 21");
		break;
		default:
			System.out.println("Valor diferente de 20 e 21");
		}
		// Laços
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Olá!");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

}