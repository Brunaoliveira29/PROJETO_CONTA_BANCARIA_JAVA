/*Class extends: ContaEmpresa
 * real: emprestimoEmpresa
 * (+) pedirEmprestimo (soma no saldo e tira do empresitmo)
 * REGRA DE NEGOCIO: Solicitar a qualquer tempo ou após os 10 movimentos o uso do emprestimo (limitado a R$ 10.000) levando o valor para o saldo. */


package Banco;

public class ContaEmpresa extends Conta{
	
	private double emprestimoEmpresa;

	public ContaEmpresa(int numeroConta, String cpf, double saldo, boolean ativo) {
		super(numeroConta, cpf, saldo, ativo);

	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public void pedirEmprestimo(double valor) {
		emprestimoEmpresa -= valor;
	}
	
}