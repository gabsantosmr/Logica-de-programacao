package aulas;

public class Aula7 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		int a = 0;
		while (a < 10) {
			System.out.println(a);
			a++;
		}
		int b = 0;
		do {
			System.out.println(b);
			b++;
		} while (b < 10);
		int c = 0;
		while (c < 20) {
		   if (c > 10) {
		      break;
		   }
		   System.out.println(c);
		   c++;
		}
		int d = 0;
		while (d < 20) {
		    if (d > 10) {
		       a++;  
		       continue;
		    }
		    System.out.println(d);
		    d++;
		}
		int e = 0;
		externo: while (e < 20) {
			  while (e > 10) {
				break externo;
			  }
			}

	}
}