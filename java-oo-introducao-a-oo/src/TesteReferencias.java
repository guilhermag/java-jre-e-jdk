public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;



        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta);
        System.out.println(primeiraConta);

        segundaConta.saldo += 100;
        System.out.println("Saldo da primeira conta: R$ " + primeiraConta.saldo);
        System.out.println("Saldo da primeira conta: R$ " + segundaConta.saldo);
    }
}
