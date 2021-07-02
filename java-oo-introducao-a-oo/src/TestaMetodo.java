public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoGuilherme = new Conta();
        contaDoGuilherme.deposita(50);
        System.out.println(contaDoGuilherme.saldo);
        contaDoGuilherme.deposita(50);
        boolean conseguiuRetirar = contaDoGuilherme.saca(67);
        System.out.println(contaDoGuilherme.saldo);

        Conta contaDaBruna = new Conta();
        contaDaBruna.deposita(200);

        contaDaBruna.transfere(100, contaDoGuilherme);
        System.out.println(contaDoGuilherme.saldo);

    }
}
