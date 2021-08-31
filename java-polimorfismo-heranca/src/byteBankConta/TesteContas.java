package byteBankConta;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.00);
        System.out.println("CC " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);
        System.out.println("CP " + cp.getSaldo());

        cc.transfere(10, cp);
        System.out.println("CC " + cc.getSaldo());
        System.out.println("CP " + cp.getSaldo());
    }
}
