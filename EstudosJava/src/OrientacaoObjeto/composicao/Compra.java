package OrientacaoObjeto.composicao;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens = new ArrayList<Item>();
	
	
	 double obterValorTotal() {
		double valorTotal = 0;
		for(Item item :  itens) {
			valorTotal += item.quantidade * item.produto.preco;
		}
		
		return valorTotal;
	}
}
