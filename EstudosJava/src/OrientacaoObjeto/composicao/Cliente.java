package OrientacaoObjeto.composicao;

import java.util.ArrayList;

public class Cliente {
	String nome;
 
	ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	
	void mostrarItemCompra(int numeroCompra) {
		for(Item item : compras.get(numeroCompra).itens) {
			System.out.println(item.produto.nome + " Preco: " + item.produto.preco + " Quantidade:" + item.quantidade);
		}
	}
	
	
	void obterValorTotal(int numeroCompra) {
		double valorTotal = 0;
		
		for(Item item : compras.get(numeroCompra).itens) {
			valorTotal += item.quantidade * item.produto.preco;
		}
		
		System.out.println("O valor total é: " + valorTotal);
	}
	
	
	void obterValorTotalCompras() {
		for(Compra c : compras) {
			System.out.println(c.obterValorTotal());
		}
		
		
	}
	
}
