package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Maps {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Mercedez ", "Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
		
		System.out.println("\n\nUsando Composicao ... ");
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(Utilitarios.primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
		
	}
}
