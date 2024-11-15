package Colecoes;

import java.util.Scanner;

public class ConjuntoBabuncinha {
	
	public static void main(String[] args) {
		Carrinho c = new Carrinho();
		Scanner entrada = new Scanner(System.in);
		int contador = 0;
		boolean adicionarItem = true;
		
		while(contador < 3) {
			System.out.println("Digite o nome do item");
			c.adicionar(entrada.next());
			
			
			
			contador++;
			
			if(contador == 3) {
				String resp = "";
				System.out.println("Deseja sair do laço?");
				resp = entrada.nextLine();
				
				if(resp == "sim") {
					adicionarItem = true;
				}else {
						adicionarItem = false;
					
				}
				System.out.println(adicionarItem);
				if(adicionarItem != true) {
					contador = 0;
				}
			}
			
		}
		
		c.mostraritens();
		

		
	}
	
}
