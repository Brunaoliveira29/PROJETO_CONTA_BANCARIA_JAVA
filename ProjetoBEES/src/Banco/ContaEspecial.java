/*Class extends: ContaEspecial
 * real: limite
 * (+) usarLimite (soma no saldo e tira do limite)
 * REGRA DE NEGOCIO: Usar o limite do saldo se no momento do movimento 
 * o saldo fica negativo, ajusta no saldo e diminuir no limite. Limite de R$ 1.000 */


package Banco;

public class ContaEspecial extends Conta {
	
	private double limite;

	public ContaEspecial(int numeroConta, String cpf, double saldo, boolean ativo) {
		super(numeroConta, cpf, saldo, ativo);
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double valor) {
		this.limite += valor;
	}
	
	public void usarLimite(double valor) {
		this.limite -= valor;
	}

}
