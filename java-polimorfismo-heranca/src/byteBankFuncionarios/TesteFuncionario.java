package byteBankFuncionarios;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente guilherme = new Gerente();
        Autenticavel bruna = new Gerente();

        guilherme.setNome("Guilherme Gabriel");
        guilherme.setCpf("00000000000");
        guilherme.setSalario(3000);

        System.out.println(guilherme.getNome());
        System.out.println(guilherme.getBonificacao());

    }
}
