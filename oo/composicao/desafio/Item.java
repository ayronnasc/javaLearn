package oo.composicao.desafio;

public class Item {
	
	int qtd;
	Produto produto;
	
	Item(String nome, Double preco, int qtd){
		this.produto = new Produto(nome, preco);
		this.qtd 	 =  qtd;
	}
	
	public int getQtd(){ return this.qtd; }
	
	
	
}
