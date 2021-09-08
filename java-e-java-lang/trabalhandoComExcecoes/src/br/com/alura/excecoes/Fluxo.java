package br.com.alura.excecoes;
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {	
        	metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao erro) {
			String mensagemString = erro.getMessage();
        	System.out.println("Mensagem de erro " + mensagemString);
        	erro.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    
    private static void metodo1() throws MinhaExcecao  {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");

        throw new MinhaExcecao("deu errado");
        
       //System.out.println("Fim do metodo2");
    }
}