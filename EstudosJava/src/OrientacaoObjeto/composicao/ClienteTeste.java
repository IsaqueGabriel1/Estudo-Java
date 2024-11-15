package OrientacaoObjeto.composicao;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Isaque");
		
		Compra compra1 = new Compra();
		
		Produto p1 = new Produto(10.0,"Teste1");
		Item item1 = new Item(p1,10);
		
		Produto p2 = new Produto(10.0,"Teste2");
		Item item2 = new Item(p2,50);
		
		Produto p3 = new Produto(10.0,"Teste3");
		Item item3 = new Item(p3,20);
		
		compra1.itens.add(item1);
		compra1.itens.add(item2);
		compra1.itens.add(item3);
		
		Compra compra2 = new Compra();
		
		Produto p1_2 = new Produto(10.0,"Teste1 compra2");
		Item item1_2 = new Item(p1_2,10);
		
		Produto p2_2 = new Produto(10.0,"Teste2");
		Item item2_2 = new Item(p2_2,50);
		
		Produto p3_2 = new Produto(10.0,"Teste3");
		Item item3_2 = new Item(p3_2,20);
		
		compra2.itens.add(item1_2);
		compra2.itens.add(item2_2);
		compra2.itens.add(item3_2);
		
		
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		
		cliente1.mostrarItemCompra(0);
		System.out.println();
		cliente1.mostrarItemCompra(1);
		
		cliente1.obterValorTotal(1);
		
		
		cliente1.obterValorTotalCompras();
	
		
		
		
	}
}
