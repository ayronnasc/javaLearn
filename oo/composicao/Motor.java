package oo.composicao;

public class Motor {
	
	Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1; // por padrao ao motor ligar
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros(){
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
