package bases;

import java.util.HashSet;
import java.util.Set;

public class Collections {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add("Salve");
		conjunto.add(1);
		conjunto.add('S'); // char -> character
		
		System.out.println("Tamanho eh  " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); // true ou false
		
		System.out.println(conjunto.contains("Salve")); // true ou false
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);
		
		System.out.println(conjunto); // altera o conteudo do conjunto
		
		conjunto.retainAll(nums); // vai reter apenas o que ha em comum em conjunto e nums
		
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
