public class ContaDois {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Foi depositado um valor de R$ " + valor);
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo -valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, ContaDois destino) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo -valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

}
