package OrientacaoObjeto.composicao.heranca.desafio;

public class Ferrari extends Carro{
	
	@Override 
	public void acererar() {
		if(velocidadeAtual < limiteVelocidade) {
			velocidadeAtual += 15;
		}
		
	}
}
