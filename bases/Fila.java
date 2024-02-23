package bases;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		
		fila.add("Ana"); // se erro, lanca uma exessao
		fila.offer("Bia");// se erro retorna false
		fila.offer("Carlos");
		fila.offer("Rafaela");
		
		// fila.size()
		// fila.clear()
		// fila.isEmpty()
		
		System.out.println(fila.poll()); // chama o primeiro elemento e ja o remove
		System.out.println(fila.poll());
	}
	
}
