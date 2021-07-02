public class TestaSomatoria {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 0;
        while(contador <= 10) {
            System.out.println("Esse é o contador: " + contador);
            numero = numero + contador;
            System.out.println("Essa é a somatória: " + numero);
            contador++;
        }
    }
}
