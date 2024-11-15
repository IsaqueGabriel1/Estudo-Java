package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno calango");
		livros.push("O calango");
		livros.push("O drão");
		
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
	}
}
