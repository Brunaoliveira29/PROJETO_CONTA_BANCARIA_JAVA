/*Class extends: ContaEstudantil
 * real: limiteEstudantil
 * REGRA DE NEGOCIO: Solicitar a qualquer tempo ou após os 10 movimentos o uso 
 * do emprestimo estudantil (limitado a R$ 5.000) levando o valor para o saldo.*/


package Banco;

public class ContaEstudantil extends Conta {
	
	private double limiteEstudantil;
	
	public ContaEstudantil(int numeroConta, String cpf, double saldo, boolean ativo) {
		super(numeroConta, cpf, saldo, ativo);
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public void usarEstudantil(double valor) {
		limiteEstudantil -= valor;
	}

}
