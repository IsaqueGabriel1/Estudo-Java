package OrientacaoObjeto.composicao.heranca.desafio;

public class Carro {
	double velocidadeAtual = 0;
	final int LIMITE_VELOCIDADE;
	
	Carro(int limite_velocidade){
		this.LIMITE_VELOCIDADE = limite_velocidade;
	}
	
	public void acererar() {
		if(velocidadeAtual < LIMITE_VELOCIDADE) {
			velocidadeAtual += 5;
		}
		toString();
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}else {
			this.velocidadeAtual = 0; 
		}
		toString();
	}
	
	public String toString() {
		return "velocidade atual é " +this.velocidadeAtual+"KM/h";
	}
}
