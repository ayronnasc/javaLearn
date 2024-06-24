package br.com.ayron.cm.modelo;

import java.util.ArrayList;
import java.util.List;

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
	 
}
