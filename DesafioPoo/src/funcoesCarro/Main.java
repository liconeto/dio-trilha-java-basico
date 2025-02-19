package funcoesCarro;

import java.util.Scanner;
import java.io.*;

public class Main {
	
 
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_ROXO = "\u001B[35m";
	public static final String ANSI_CIANO = "\u001B[36m";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;
		String ligaCarro ;
		
		Carro carroOne = new Carro();
		
		while (continuar) {
		
			String letras = " ..::  Iniciando o Sistema DIO-Car 3000  ::.. ";
			String boasVindas = " ..:: Estou pronto, Dirija com segurança! ::.. ";
        
			carregandoTexto(letras);
	        System.out.println(" ");
	        carregandoTexto(boasVindas);
	        
	        do {
		        System.out.println(" ");
		        System.out.print("O motor do carro está :");
		        carroLigado(carroOne.isStatusCarro());
		        System.out.println(" e o cambio está : "+ ANSI_CIANO + carroOne.getCambio() + ANSI_RESET + " velocidade: "+carroOne.getVelocidade());
	        
		        System.out.println("Deseja ligar o carro ? | S = Sim , N = Não");
		        ligaCarro = scanner.next();
		        
		        switch (ligaCarro) {
		        	case "S":
		        		
		        		break;
		        	case "N":
		        		
		        		break;
	        		default:
	        			System.out.println("Opção inválida. Tente novamente.");
		        }
		        
	        
	        	System.out.println("Opção escolhida! : "+ ligaCarro);
	        	
	        } while( ligaCarro == "N");
	        
	        

		}
	}
	
	public static void carregandoTexto(String texto) throws InterruptedException {
		for (int l = 0; l < texto.length(); l++) {
        	char letra = texto.charAt(l);
        	Thread.sleep(80);
        	System.out.print(ANSI_GREEN + letra + ANSI_RESET);	
		}
	}
	
	public static void carroLigado(boolean isCarro) {
		if(isCarro == false) {
			System.out.print(ANSI_RED+"Desligado!"+ANSI_RESET);
		}else {
			System.out.print(ANSI_BLUE+"Ligado!"+ANSI_RESET);
		}
	}


}
