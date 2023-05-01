/*Criar a classe Conta: Conta [abstract] 
 * inteiro: numero [numero e o cpf [construtor]]
 * cadeia: cpf
 * real: saldo [alterando o saldo o mesmo não pode ser ajustado por setter. Proteção total]
 * logico: ativo
 * - debito: saldo menos valor informado e colocar o novo  resultado no saldo
 * + credito - void: saldo mais o valor informado e colocar o novo reultado no saldo*/


package Banco;

	abstract class Conta {
	
	private int numeroConta;
	private String cpf;
	double saldo = 0;
	boolean ativo;
	
	public Conta(int numeroConta, String cpf, double saldo, boolean ativo) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		if (numeroConta > 0) {
			this.numeroConta = numeroConta;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

	public void debito (double valor) {
		if (this.ativo) {
			this.saldo -= valor;
		}
	}
	
	public void credito (double valor) {
		if (this.ativo) {
			this.saldo += valor;
		}
	}

	public void correcao(int dia) {
		
	}
	
}
