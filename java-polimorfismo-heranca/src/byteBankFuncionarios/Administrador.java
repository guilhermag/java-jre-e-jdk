package byteBankFuncionarios;

public class Administrador extends Funcionario implements Autenticavel {

    private  int senha;
    private AutenticadorByteBank autenticador;

    public Administrador() {
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

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }
}
