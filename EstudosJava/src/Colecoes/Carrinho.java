package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class Carrinho {

	Set carrinho = new HashSet();
	
	
	public void adicionar(String item) {
		if(item != null) {
			carrinho.add(item);
		}else {
			System.out.println("Item nulo, não adicionado");
		}
		
	}
	
	public void remover(String item) {
		if(pesquisarItem(item)) {
			carrinho.remove(item);
		}else {
			System.out.println("O item '" + item + "' Não existe no carrinho!");
		}
		
	}
	
	public boolean pesquisarItem(String item) {
		return carrinho.contains(item);
	}
	
	public void mostraritens() {
		System.out.println(carrinho);
	}
	
}
