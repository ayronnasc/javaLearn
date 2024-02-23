package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<Item>();
	double valorCompra;
	
	public int addItem(Item item, int qtd){
		if(item.qtd >= qtd) {
			
			item.qtd = item.qtd - qtd;
			this.valorCompra = item.produto.preco * qtd;
			
			this.itens.add(item);
			return 1;
		}else if(item.qtd == 0) {
			System.out.println("O estoque Acabou!");
			return 0;
		}else {
			System.out.println("Nao existe estoque o suficiente para sua compra");
			return 0;
		}
	}
	
	
}
