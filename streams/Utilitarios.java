package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	public final static	UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static	UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public final static	String grito(String n){ return n + "!!! ";}
	public final static void mostrar(String n) {
		System.out.println(" " + n  +"  ");
	}
	public final static void mostrarInt(int n) {
		System.out.println(" " + n  +"  ");
	}
}
