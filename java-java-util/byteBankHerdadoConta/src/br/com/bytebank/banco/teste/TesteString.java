package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Box cachorra caramelo"; //object literal
		//String outro = new String("Box cachorra caramelo");
		
		System.out.println(nome);
		
		nome = nome.replace("o", "Z");
		
		System.out.println(nome );
		char c = nome.charAt(3); //char i
		System.out.println(c);

		int pos = nome.indexOf("rio");
		System.out.println(pos);

		String sub = nome.substring(1);
		System.out.println(sub);
		
	}

}
