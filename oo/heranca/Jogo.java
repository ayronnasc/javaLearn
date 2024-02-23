package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		Heroi heroi = new Heroi();
		
		heroi.x = 10;
		heroi.y = 10;
		
		Monstro monstro = new Monstro();
		
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println( " \n Heroi tem vida : "+ heroi.vida);
		System.out.println(" Monstro tem vida : "+monstro.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println( "\n Heroi tem vida : "+ heroi.vida);
		System.out.println(" Monstro tem vida : "+monstro.vida);

		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.SUL);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println( "\n Heroi tem vida : "+ heroi.vida);
		System.out.println(" Monstro tem vida : "+monstro.vida);
		
	}
}
