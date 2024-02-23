package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;



public class DesafioMap {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		Consumer<String> print = Utilitarios::mostrar;
		Consumer<Integer> printInt = Utilitarios::mostrarInt;
		 
	 
		
		Function<Integer, String> toS = n -> {
				return Integer.toBinaryString(n);
			};
		Function<String, Integer> toIn = n -> {
			return Integer.parseInt(n, 2);
			
		};
			
 		UnaryOperator<String> invert = s -> {
 			
 				List<Character> values = new ArrayList<>();
 			
 				for (int i = 0; i < s.length(); i++) {
					
 					Character fim;
 					
 					if(i == 0 && s.charAt(i) != s.charAt(s.length() - 1)){
 						fim = s.charAt(s.length() - 1);
 						values.add(fim);
 						continue;
 					}
 					
 					if(i == (s.length() - 1) && s.charAt(i) != s.charAt(0)) 
 					{
 						fim = s.charAt(0);
 						values.add(fim);
 						continue;
 					}
 					else fim = s.charAt(i);
 					values.add(fim);
 					
				}
 		
 				String _values = "";
 				
 				for(int i = 0 ; i < (s.length()) ; i++) {
 					_values += values.get(i);
 				}
 				
 				
 				return _values;
 			};
		
		/*
		 * 1.numero para string binaria... 6 => 110
		 * 2.Reverter para a string  "110" => "011"
		 * 3.converter de volta para inteiro => "011" => 3
		 * */
		System.out.println("numero para string binaria... \n");
		nums.stream()
		.map(toS)
		.forEach(print);
		
		System.out.println(" \n Reverter para a string... ");
		nums.stream()
		.map(toS)
		.map(invert)
		.forEach(print);
		
		
		System.out.println(" \n Converter de volta para inteiro... ");
		nums.stream()
		.map(toS)
		.map(invert)
		.map(toIn)
		.forEach(printInt);
		
		System.out.println(" \n Converter de volta para O inicio ... ");
		nums.stream()
		.forEach(printInt);
	}
}
