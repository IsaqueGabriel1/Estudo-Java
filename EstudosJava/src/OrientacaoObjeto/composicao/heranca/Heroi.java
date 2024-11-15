package OrientacaoObjeto.composicao.heranca;

public class Heroi extends Jogador{
	double danoBase = 10;
	double moedaOuro = 50;
	//heroi tem uma espada com dano 40
	Espada espada = new Espada(40);
	
	Heroi(int x, int y){	
		//Para construir um heroi, deve ser passado as posições
		super(x, y);
	}
	
	//só compra Espada se tiver 10 ou mais moedas de ouro
	boolean comprarEspada() {
		if(moedaOuro > 10) {
			//dano base + dano da espada = 40
			this.danoBase += espada.dano;
			return true;
		}
		
		return false;
	}
	
	@Override
	boolean atacar(Jogador oponente){
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		
		if(deltaX == 0 && deltaY == 1) {
			//corrigindo um erro que a classe jogador tem
			//exemplo de Sobrescrita
			if(oponente.vida > 0) {
				oponente.vida -= danoBase;
			}else {
				oponente.vida = 0;
			}
			
		}else if(deltaX == 1 && deltaY == 0){
			if(oponente.vida > 0) {
				oponente.vida -= danoBase;
			}else {
				oponente.vida = 0;
			}
		}else {
			return false;
		}
		return true;
	}
	
	
}
