public class TestaFatorial {
    public static void main(String[] args) {
        for (int contador = 10; contador>0; contador--) {
            int numero = contador;
            int multiplicacao = 1;
            while(numero > 0){
                multiplicacao = numero * multiplicacao;
                numero--;
            }
            System.out.println("O fatorial de " + contador + "! é : " + multiplicacao);
        }
    }
}
