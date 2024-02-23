package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(3));
		String s = "Boa tarde";
		System.out.println(s.concat(" salve"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("Boa tarde"));
		System.out.println("Frase qualquer".substring(6, 8)); // inclui o 6 e nao o 8
		
	}
}
