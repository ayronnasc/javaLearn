package bases;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoArrumado {
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>(); // tipo homogeneo
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro"); 
		
		for(String nomes : lista){
			System.out.println(nomes);
		}
	}
}
