public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(001, 9998);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente guilherme = new Cliente();
        guilherme.setNome("Guilherme Gabriel");
        conta.setTitular(guilherme);

        System.out.println(conta.getTitular().getNome());
    }
}
