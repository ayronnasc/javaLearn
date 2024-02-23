package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>(); // uma compra tem muitos items
	
	double getValorTotal(){
		double total = 0;
		
		for(Item item : itens){
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
