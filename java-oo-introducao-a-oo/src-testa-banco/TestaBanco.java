public class TestaBanco {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        guilherme.nome = "Guilherme Gabriel";
        guilherme.cpf = "000000000000";
        guilherme.profissao = "programador";

        ContaDois contaDoGuilherme = new ContaDois();
        contaDoGuilherme.deposita(500);

        contaDoGuilherme.titular = guilherme;
        System.out.println(contaDoGuilherme.titular);

    }
}
