package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome : ");
		String nome  = entrada.nextLine(); // Requisicao da entrada ocorre aqui
		
		
		
		System.out.println("Digite sua Idade : ");
		int idade = entrada.nextInt();
		
		System.out.println("\n\nNome = " + nome + "\n sua idade eh : " + idade);
		
		entrada.close();
	}
}
