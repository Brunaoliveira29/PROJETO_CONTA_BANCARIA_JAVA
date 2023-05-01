/*REGRAS:
 * 10 MOVIMENTOS - DEBITO OU CREDITO
 * SALDO ZERO É POSSIVEL
 * NENHUMA CONTA PODE FICA NEGATIVA DEPOIS DOS POSSIVEIS 10 MOVIMENTOS
 * O BANCO DEVER TER UM NOME
 * O BANCO DEVER TER UM SLOGAN */


package Banco;

import java.util.Scanner;

public class TestaConta {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Conta pouponcaConta = new ContaPoupanca(1215, "389.707.435.276-26", 4000, true, 20);
		
		Conta correnteConta = new ContaCorrente(1214, "389.707.435.276-26", 5000, true);
		
		Conta especialConta = new ContaEspecial(1216, "389.707.435.276-26", 100, true);
		
		Conta empresaConta = new ContaEmpresa(1217, "389.707.435.276-26", 30000, true);
		
		Conta estudantilConta = new ContaEstudantil(1218, "389.707.435.276-26", 2000, true);
		
		int op, dia, mov = 10;
		char movi = 0, cont = 's';
		double valor;

		
		menu1();
		op = input.nextInt();
		
		switch (op) {
		case 1:
			if (pouponcaConta.ativo) {
				while (cont == 's') {
					if (mov != 0) {
						if (pouponcaConta.saldo >= 0) {
							System.out.println("Informe o dia do aniversario da poupança: ");
							dia = input.nextInt();
							pouponcaConta.correcao(dia);
							
							menu2(pouponcaConta.saldo, "CONTA POUPONÇA");
							movi = input.next().charAt(movi);
							System.out.println("VALOR DO MOVIMENTO: R$ ");
							valor = input.nextDouble();
							
							if (movi == 'd') {
								pouponcaConta.debito(valor);
								
							if (movi == 'c') {
								pouponcaConta.credito(valor);
							}
								
							mov -=1;
							System.out.println("CONTINUAR S/N: ");
								cont = input.next().charAt(movi);
								
								
								} else { 
									System.out.println("CONTA NEGATIVA");
									
									break;
							}
							
						} else {
							System.out.println("LIMITE DAS 10 MOVIMENTAÇÕES REALIZADAS");
						}
						
					}
					
				}
			} else {
				System.out.println("CONTA DESATIVIDA");

			}
			
			break;
			
			case 2:
				if (correnteConta.ativo){
					while (cont == 's') {
						if(mov != 0) {
							if(correnteConta.saldo >= 0){
			                  
							menu2(correnteConta.saldo, "CONTA CORRENTE");
							movi = input.next().charAt(movi);
							System.out.println("VALOR DO MOVIMENTO: R$ ");
							valor = input.nextDouble();
							
							if (movi == 'd') {
			                    correnteConta.debito(valor);
			                  }
			                
							if (movi == 'c') {
			                    correnteConta.credito(valor);
			                  }
			                  mov -= 1;
			                  System.out.println("CONTINUAR S/N: ");
			                  cont = input.next().charAt(0);
			                  
			                } else {
			                  System.out.println("CONTA NEGATIVA");
			                  break; 
			                }
			              }
						
			              else {
			            	  System.out.println("LIMITE DAS 10 MOVIMENTAÇÕES REALIZADAS");
			                
			            	 break;
			              }
					}
				}	
		}
	}

	public static void menu1() {
		System.out.println("****BEM VINDO AO BANCO VIVO SEM DINHEIRO****");
		System.out.println("   ****VAMOS FAZER JUNTOS ACONTECER!****");
		System.out.println("");
		System.out.println("-------------- MENU -------------");
		System.out.println("");
		System.out.println("        1- CONTA POUPANÇA        ");
		System.out.println("    	2- CONTA CORRENTE        ");
		System.out.println("    	3- CONTA ESPECIAL        ");
		System.out.println("    	4- CONTA EMPRESA         ");
		System.out.println("    	5- CONTA ESTUDANTIL      ");
		System.out.println("    	6- SAIR                  ");
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.printf("SELECIONE A OPERAÇÃO DESEJADA:_   ");
		System.out.println("");
	}

	public static void menu2(double saldo, String banco) {
		System.out.println("**** BEM VINDO AO BANCO VIVO SEM DINHEIRO ****");
		System.out.println("**** VAMOS FAZER JUNTOS ACONTECER! ****");
		System.out.println("");
		System.out.println("---------------CONTA-------------");
		System.out.println("");
		System.out.println(" SALDO ATUAL: R$ " +saldo +     "");
		System.out.println("");
		System.out.println(" MOVIMENTO D-Débito ou C-Crédito:_ ");
		System.out.println("");
		System.out.println(" VALOR DO MOVIMENTO: R$_          ");
		System.out.println("");
		System.out.println(" CONTINUAR S/N:                   ");
		System.out.println("----------------------------------");
		System.out.println("");
		
	}

}
