package byteBankHerdadoConta;
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		cp.saca(50);

		
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		try {
			cc.saca(150);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Operação indisponível: " + e.getMessage());
		}
		

	}

}
