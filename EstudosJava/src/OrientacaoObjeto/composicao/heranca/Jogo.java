package OrientacaoObjeto.composicao.heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 = new Monstro();
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 = new Heroi();
		j2.x = 10;
		j2.y = 11;
		
		j2.moedaOuro = 30;
		j2.comprarEspada();
		
		j1.atacar(j2);
		
		j2.atacar(j1);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}