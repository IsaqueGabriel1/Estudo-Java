package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		
		lista.add("Ana");
		lista.add("Isaque");
		lista.add("Gabriel");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
	}
}
