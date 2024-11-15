package OrientacaoObjeto.composicao.heranca.desafio;

public class Carro {
	double velocidadeAtual = 0;
	int limiteVelocidade = 250;
	
	
	public void acererar() {
		if(velocidadeAtual < limiteVelocidade) {
			velocidadeAtual += 5;
		}
		
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;
		}else {
			this.velocidadeAtual = 0;
		}
		
	}
}
