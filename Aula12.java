import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		//enums
		enum DiaDaSemana {
			Segunda, Terça, Quarta, Quinta, Sexta, Sabado, Domingo
		}
		var dia = DiaDaSemana.Segunda;
		System.out.println(dia);
		
		//Scanner.hasNext() e Scanner.next()
		var texto = "olá m u n d o!";
		try (Scanner scanner = new Scanner(texto)) {
			scanner.useDelimiter(" ");
			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		}
	}
}