package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		
		// referencia de metodo
		Consumer<String> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java", "Lua", "JS\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python", "Lisp", "Perl", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 0, 2).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("\nC", "PHP", "Kotlin");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print); -> sem ordenacao
		
		//Stream.iterate(0, n -> n + 1).forEach(println); -> com ordenacao
	}
}
