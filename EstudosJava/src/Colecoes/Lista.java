package Colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista =new ArrayList<Usuario>();
		
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Isaque"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Cavalo"));
		
		//acessa o item pelo indice
		System.out.println(lista.get(3).nome);
		
		
		System.out.println(lista.contains(u1));
		for(Usuario u: lista) {
			System.out.println(u.nome.replaceAll("[A a]", ""));
		}
	}
}
