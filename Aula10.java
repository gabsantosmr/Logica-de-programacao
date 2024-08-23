package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Aula10 {

	public static void main(String[] args) {
		//ordenação de array
		int[] a = new int[] {7, 2};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		//ordenação inversa de array
		Integer[] b = new Integer[] { 2, 7 };
		Arrays.sort(b, Comparator.reverseOrder());
		System.out.println(Arrays.toString(b));

		//ArrayList
		var itens = new ArrayList<Integer>();
		itens.add(10);
		itens.add(20);
		itens.add(30);
		itens.remove(1);
		System.out.println(itens);
		System.out.println(itens.get(1));
	}

}
