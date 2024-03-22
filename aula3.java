package teste;

import java.util.Scanner;

public class aula3 {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		int idade = entrada1.nextInt();
		entrada1.close();
		System.out.println( idade < 60 ? "Você é Jovem" : "Você é Idoso");
	}
}