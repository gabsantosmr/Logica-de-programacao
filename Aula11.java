package aulas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Aula11 {

	public static void main(String[] args) {
		//HashSet
		var itens = new HashSet<Integer>();
		itens.add(10);
		itens.add(20);
		itens.add(30);
		itens.remove(10);
		System.out.println(itens);
		System.out.println(itens.size());
		
		//HashMap
		var map = new HashMap<Integer, String>();
		map.put(10, "Mateus");
		map.put(20, "Carlos");
		map.put(30, "Joana");
		map.remove(30);
		System.out.println(map);
		System.out.println(map.get(20));

		//coleções imutáveis
		List<Integer> lista = List.of(10, 20, 30);
		Set<Integer> conjunto = Set.of(10, 20, 30);
		Map<Integer, String> mapa = Map.of(10, "Mateus", 20, "Carlos", 30, "Joana");
		System.out.println(lista);
		System.out.println(conjunto);
		System.out.println(mapa);
		
		//ForEach
		var each = List.of(10, 20, 30);
		each.forEach(valor -> System.out.println(valor));
		
		//split
		var texto = "olá mundo!";
		String[] partesDoTexto = texto.split(" ");
		System.out.println(partesDoTexto[0]);
		System.out.println(partesDoTexto[1]);
		var texto2 = "olá mu ndo !";
		String[] partesDoTexto2 = texto2.split(" ");
		System.out.println(partesDoTexto2[0]);
		System.out.println(partesDoTexto2[1]);
		System.out.println(partesDoTexto2[3]);
		
		//join
		var mensagem = String.join(" ", "olá", "mundo");
		System.out.println(mensagem);
		String[] partesDoTexto3 = mensagem.split(" ");
		mensagem = String.join(" ", partesDoTexto3);
		System.out.println(mensagem);
		
		//string.length
		var txt = "olá, mundo!";
		System.out.println(txt.length());
	}
}