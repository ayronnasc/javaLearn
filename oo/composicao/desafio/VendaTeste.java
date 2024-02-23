package oo.composicao.desafio;

public class VendaTeste {
	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Ayron");
		
		Item 	item1 = new Item("Detergente", 10.50, 20);
		Item 	item2 = new Item("Salgado", 2.50, 50);
		Item 	item3 = new Item("Batata", 15.55, 16);
		
		System.out.println(item1.getQtd());
		
		cliente1.comprar(item1, 18);
		cliente1.comprar(item1, 1);
		
		cliente1.getTotalCompra();
		
		cliente1.comprar(item2, 20);
		cliente1.comprar(item2, 10);
		
		cliente1.getTotalCompra();
		
		cliente1.comprar(item3, 7);
		cliente1.comprar(item3, 5);
		
		cliente1.getTotalCompra();
	}
}
