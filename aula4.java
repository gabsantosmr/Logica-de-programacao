package teste;

import java.util.Scanner;

public class aula4 {
	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in); //scanner é um objeto, entreda1 é uma variável que recebe new Scanner(System.in)
		System.out.print("digite o primeiro valor:");
		double a = entrada1.nextInt(); //variável do tipo double que ecebe o valor inteiro digitado 
		System.out.print("agora, digite o segundo valor:");
		double b = entrada1.nextInt();
		System.out.print("agora, o terceiro:");
		double c = entrada1.nextInt();
		System.out.print("e o quarto:");
		double d = entrada1.nextInt();
		entrada1.close(); //encerra o scanner
		double r = (a+b)*c/(d-3);
		System.out.println("O valor da expressão (a+b)*c/(d-3) é " + r + ".");
	}
}