/*Class extends: ContaPoupanca
 * inteiro: diaAniversarioPoupanca
 * (+) correcao (soma no saldo)
 * REGRA DE NEGOCIO: Comparar se a data informada pelo usuario é a mesma data do dia do aniversário, 
 * se for corrigir o valor em 0,05%  saldo = (saldo * 0.05)+saldo*/


package Banco;

public class ContaPoupanca extends Conta {
	
	private int diaAniversarioPoupanca;
	
	
	public ContaPoupanca(int numeroConta, String cpf, double saldo, boolean ativo, int diaAniversarioPoupanca) {
		
		super(numeroConta, cpf, saldo, ativo);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
		
	}


	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}


	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	public void correcao(int diaAniversarioPoupanca) {
	   
		if(this.diaAniversarioPoupanca == diaAniversarioPoupanca) {
	      
		      saldo = (Double) ((saldo * 0.05) + saldo);
		   
		}else {
	      
	    	System.out.println("INVÁLIDO");
	    }
	}
}
