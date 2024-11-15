package OrientacaoObjeto.composicao.heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 = new Monstro(10, 10);
		
		Heroi j2 = new Heroi(10, 11);
	
		
		j2.moedaOuro = 30;
		j2.comprarEspada();
		
		j1.atacar(j2);
		
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}
