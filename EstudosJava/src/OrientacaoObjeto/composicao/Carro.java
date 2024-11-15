package OrientacaoObjeto.composicao;

public class Carro {
	Motor motor;;
	
	Carro(){
		motor = new Motor(this);
	}
	
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		if(motor.ligado) {
			motor.ligado = false;
			motor.fatorInjecao = 1;
		}else {
			System.out.println("O carro já está desligado");
		}
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
