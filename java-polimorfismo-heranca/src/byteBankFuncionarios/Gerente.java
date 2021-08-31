package byteBankFuncionarios;

public class Gerente extends Funcionario implements Autenticavel{


    public double getBonificacao() {
        return super.getSalario();
    }

    private  int senha;
    private AutenticadorByteBank autenticador;

    public Gerente() {
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