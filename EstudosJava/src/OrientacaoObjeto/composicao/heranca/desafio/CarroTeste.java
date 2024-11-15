package OrientacaoObjeto.composicao.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Ferrari f = new Ferrari(250);
		Civic c = new Civic(100);
		c.acererar();
		System.out.println("Velocidade maxima ferrari " + f.LIMITE_VELOCIDADE);
		System.out.println("Velocidade maxima civic " + c.LIMITE_VELOCIDADE);
		System.out.println(c.velocidadeAtual);
		
		f.acererar();
		f.toString()
;		
		
		
	}
}
