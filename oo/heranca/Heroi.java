package oo.heranca;

public class Heroi extends Jogador{ // heranca, reuso 
	
	boolean atacar(Jogador oponente) {
		super.atacar(oponente);
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		
		return ataque1 || ataque2;
	}
}
