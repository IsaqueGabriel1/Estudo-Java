package OrientacaoObjeto.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.motor.ligado = true;
		System.out.println(c.motor.giros());
		
		c.desligar();
		
		System.out.println(c.motor.giros());
		
		c.desligar();
		
		c.ligar();
		
		System.out.println(c.motor.giros());
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giros());
		
		
	}
}
