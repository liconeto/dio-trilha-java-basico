package contaBancaria;

import java.util.Scanner;

public class Main {

	public static void main (String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        String letras = "..:: Iniciando o Caixa Eletrônico DIO-Bank ::..";
        for (int l = 0; l < letras.length(); l++) {
        	char letra = letras.charAt(l);
        	Thread.sleep(75);
        	System.out.print(""+ letra);	
		}
        
        
        System.out.println(" Vamos abrir sua conta para isso informe os dados abaixo!");
        
        System.out.println(" Informe a agencia:");
        String agencia = scanner.next();
        
        System.out.println(" Informe a conta");
        String numeroConta = scanner.next();
        
        System.out.println(" Informe o titular");
        String titular = scanner.next();
        
        System.out.println(" Informe a conta");
        double saldo = scanner.nextDouble();
        
        Conta clienteConta = new Conta(agencia, numeroConta, titular, saldo);
        
        System.out.println("  Escolha uma opção abaixo:");
        System.out.println("	1 = Consultar Saldo");
        System.out.println("	2 = Consultar cheque Especial");
        System.out.println("	3 = Depositar dinheiro");
        System.out.println("	4 = Sacar dinheiro");
        System.out.println("	5 = Pagar boleto");
        System.out.println("	6 = Verificar se a conta está usando cheque Especial");
        System.out.println("	0 = encerrar");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: imprimir o saldo.
                    System.out.println("Saldo atual :"+saldo);
                    break;
                case 2:
                    // TODO: Imprimir limite do cheque especial.
                    System.out.println("Saldo atual :"+saldo);
                    System.out.println("Saldo do cheque especial :"+ chequeEspecial);
                    System.out.println("Saldo atual: "+ saldo + "+ cheque especial: "+ chequeEspecial + " = "+ (saldo + chequeEspecial));
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                	Double depositado = scanner.nextDouble();
                    System.out.println("Saldo atual :"+saldo);
                    break;
                case 4:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    Double sacar = scanner.nextDouble();
                    if(sacar > (saldo + chequeEspecial)) {
                    	System.out.println("Salo insulficiente");
                    } else if (sacar > saldo && sacar < (saldo + chequeEspecial)) {
                    	System.out.println("Para realizar esse saque você precisará usar o cheque especial!");
                    	System.out.println("Deseja continuar? 1 = SIM | 0 = Não");
                    	String usaCheque = scanner.next();
                    	double saldoTotal;
                    	switch (usaCheque) {
						case "S":
							System.out.println("Saque realizado com sucesso !");
							saldoTotal = saldo + chequeEspecial;
							saldoTotal = (sacar - saldo ) - chequeEspecial;
							System.out.println(" "+ saldoTotal);							
							break;
						case "s":
							System.out.println("Saque realizado com sucesso !");
							saldoTotal = saldo + chequeEspecial;
							saldoTotal = (sacar - saldo ) - chequeEspecial;
							System.out.println(" "+ saldoTotal);							
							break;

						default:
		                    System.out.println("Opção inválida. Tente novamente.");
						}
                    }
                    saldo = saldo - sacar;
                    System.out.println("Saldo atual :"+saldo);
                    break;
                case 5:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                	System.out.println("Digite o código do Boleto");
                    int codigoBoleto = scanner.nextInt();
                    
                    System.out.println("Digite o valor do boleto");
                	Double valorBoleto = scanner.nextDouble();
                	
                    System.out.println("Saldo atual :"+saldo);
                    break;
                case 6:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Saldo atual :"+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

}
