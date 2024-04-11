package aulas;

import java.util.Scanner;

public class aula5 {

	public static void main(String[] args) {
		System.out.print("Digite sua idade: ");
		Scanner entrada = new Scanner (System.in);
		int A = entrada.nextInt();
		entrada.close();
		if (A < 18){
			System.out.println("Você é menor de idade");
		} else {
			System.out.println("Você é maior de idade");
		}
	}

}
