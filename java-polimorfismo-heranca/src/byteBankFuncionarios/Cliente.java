package byteBankFuncionarios;

public class Cliente implements Autenticavel {

    private  int senha;
    private AutenticadorByteBank autenticador;

    public Cliente() {
        this.autenticador = new AutenticadorByteBank();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
