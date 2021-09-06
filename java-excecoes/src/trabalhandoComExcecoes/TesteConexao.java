package trabalhandoComExcecoes;


public class TesteConexao {
	
	public static void main(String[] args) {
		Conexao conexao = null;
		
		try {
			conexao = new Conexao();
			conexao.leDados();
		} catch(IllegalStateException erro) {
			System.out.println("Deu erro na conexão.");
		//} finally { conexao.fecha(); }
		}
	}	
}
