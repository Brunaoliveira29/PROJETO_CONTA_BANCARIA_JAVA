/*Class extends: ContaCorrente
 * inteiro: contadorTalao
 * (+) pediTalao - [não é no saldo]
 * REGRA DE NEGOCIO: Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja solicitar cheque, 
 * limitando em apenas 3 cheques. Cada talão debita a conta em R$ 30.00.*/

package Banco;

public class ContaCorrente extends Conta {
	
	
	private int contadorTalao;

	public ContaCorrente(int numeroConta, String cpf, double saldo, boolean ativo) {
		super(numeroConta, cpf, saldo, ativo);
		

	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}

	public void pedirTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
}