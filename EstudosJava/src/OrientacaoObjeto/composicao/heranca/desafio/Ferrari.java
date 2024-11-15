package OrientacaoObjeto.composicao.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(int limite_velocidade){
		super(limite_velocidade);
	}
	
	//teste
	@Override 
	public void acererar() {
		if(velocidadeAtual < this.LIMITE_VELOCIDADE) {
			velocidadeAtual += 15;
		}
		this.toString();
	}
	
	@Override 
	public void frear() {
		if(velocidadeAtual < this.LIMITE_VELOCIDADE) {
			velocidadeAtual += 15;
		}
		//chamando o toString da super classe
		toString();
	}
	
	
}
