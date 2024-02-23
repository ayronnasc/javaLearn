package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome; 
	ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	public int comprar(Item itens, int qtd) {
		if(qtd <= 0) {
			System.out.println("Eh necessario ter uma quantidade valida!");
			return 0;
		}
		
		Compra compra = new Compra();
		
		if(compra.addItem(itens, qtd) == 1) compras.add(compra);
		else return 0;
		
		System.out.println(compra.valorCompra);
		
		return 1;
	}
	
	public void getTotalCompra() {
		double total = 0;
		
		
		for(Compra compra : compras) {
			
			total += compra.valorCompra;
			
		}
		
		System.out.println("\nO valor total de\nsuas compras foi : R$ " + total + "\n");
	}


}
