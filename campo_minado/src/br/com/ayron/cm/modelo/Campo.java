package br.com.ayron.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.ayron.cm.excecao.ExplosaoException;

public class Campo {
	
	private final int X;
	private final int Y;
	
	private boolean minado  = false;
	private boolean aberto  = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	 Campo(int X, int Y) // para setar localizacao;
	 {
		 this.X = X;
		 this.Y = Y;
	 }
	 
	 boolean addVizinho(Campo vizinho) 
	 {
		 boolean xdif = X != vizinho.X;
		 boolean ydif = Y != vizinho.Y;
		 boolean diag = xdif && ydif;
		 
		 int deltaX = Math.abs(X - vizinho.X);
		 int deltaY = Math.abs(Y - vizinho.Y);
		 int deltaGeral = deltaX + deltaY; 
		 
		 // cenarios de vizinhos possiveis
		 
		 if(deltaGeral == 1 && !diag) 
		 {
			vizinhos.add(vizinho); 
			return true;
		 }
		 else if (deltaGeral == 2 && diag) 
		 {
			 vizinhos.add(vizinho); 
			 return true;
		 }
		 else { return false;}
	 }
	 
	 void alternarMarcacao()
	 {
		 if(!aberto)
		 {
			 marcado = !marcado;// recebendo seu oposto ocorre alternancia
			 
		 }
	 }
	 
	 boolean abrir()
	 {
		 // recursividade sera usada, chamando o metodo abrir dentro dele mesmo
		if(!aberto && !marcado) 
		{
			aberto = true;
			if(minado) // o jogo acaba, porque o campo esta minado 
			{
				throw new ExplosaoException(); // mudanca de fluxo, para o fluxo de explosao
			}
			if(vizinhancaSegura()) 
			{
				vizinhos.forEach(v -> v.abrir()); // ocorrera a recursividade, chamando o metodo abrir para cada vizinho, ate que haja perigo
			}
			return true;
		}else{
			return false;
		}
	 }
	 
	 boolean vizinhancaSegura() 
	 {
		 return vizinhos.stream().noneMatch(v -> v.minado);
	 }
	 
	 public boolean isMarcado() 
	 {
		 return marcado;
	 }
	 
	 void minar() { minado = true; }
	 
	 public boolean isAberto() 
	 {
		 return aberto;
	 }
	 
	 public boolean isFechado() 
	 {
		 return !isAberto();
		 
	 }

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}
	
	boolean objetivoAlcancado() 
	{ // para um campo especifico
		boolean desvendado = !minado && aberto;
		boolean protegido  = minado && marcado;
		return desvendado || protegido;
	}
	
	long minasNaVizinhanca() 
	{
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	public boolean isMinado() {
		return minado;
	}

	void reiniciar() 
	{
		aberto = false;
		minado = false; 
		marcado = false;
	}
	
	public String toString() 
	{
		if(marcado) { return "X"; }
		else if (aberto && minado) {return "*";}
		else if (aberto && minasNaVizinhanca() > 0) 
		{
			return Long.toString(minasNaVizinhanca());
		}
		else if (aberto) 
		{
			return " ";
		}
		else 
		{ // fechado, nao foi aberto
			return "?";
		}
	}
	
}
