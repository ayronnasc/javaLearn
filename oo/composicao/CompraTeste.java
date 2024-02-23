package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Joao pedro";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.35));
		compra1.itens.add(new Item("Caderno", 3, 15.35));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
	}
}
