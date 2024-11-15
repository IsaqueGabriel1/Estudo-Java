package Arrys;

public class Usuario {
	String nome;
	String email;
	
	
	
	public boolean equals(Object obj) {
		
		
		if(obj instanceof Usuario) {
			Usuario outro = (Usuario) obj;
			
			boolean nomeIgual = outro.nome.equals(nome);
			boolean emailIgual = outro.email.equals(email);
			
			return nomeIgual && emailIgual;
		}
		return false;
		
	}
}
