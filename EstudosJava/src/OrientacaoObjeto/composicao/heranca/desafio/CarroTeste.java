package OrientacaoObjeto.composicao.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		Civic c = new Civic();
		c.acererar();
		System.out.println(c.velocidadeAtual);
		f.acererar();
		
		System.out.println(f.velocidadeAtual);
		
		
	}
}
