package OrientacaoObjeto.composicao.heranca;

public class Heroi extends Jogador{
	double danoBase = 10;
	double moedaOuro = 50;
	Espada espada = new Espada();
	
	
	
	
	boolean comprarEspada() {
		if(moedaOuro > 10) {
			this.danoBase += espada.dano;
			return true;
		}
		
		return false;
	}
	
	
	boolean atacar(Jogador oponente){
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= danoBase;
		}else if(deltaX == 1 && deltaY == 0){
			oponente.vida -= danoBase;
		}else {
			return false;
		}
		return true;
	}
	
	
}
