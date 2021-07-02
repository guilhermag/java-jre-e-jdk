public class TestaContaSemCliente {

    public static void main(String[] args) {
        ContaDois contaDaBruna = new ContaDois();
        contaDaBruna.deposita(1000);
        System.out.println(contaDaBruna.getSaldo());

        //contaDaBruna.titular = new Cliente();
        System.out.println(contaDaBruna.titular);

        contaDaBruna.titular.nome = "Bruna";
        System.out.println(contaDaBruna.titular.nome);

    }
}
