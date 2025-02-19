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
		 
		
		Carro carroOne = new Carro();
		
		String letras = " ..::  Iniciando o Sistema DIO-Car 3000  ::.. ";
		String boasVindas = " ..:: Estou pronto, Dirija com segurança! ::.. ";
        
		carregandoTexto(letras);
        System.out.println(" ");
        carregandoTexto(boasVindas);   
        System.out.println(" ");
        carroLigado(carroOne.isStatusCarro());
        System.out.println("O cambio está : "+ carroOne.getCambio() + " velocidade: "+carroOne.getVelocidade());

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
			System.out.println(ANSI_RED+"Desligado!"+ANSI_RESET);
		}else {
			System.out.println(ANSI_BLUE+"Ligado!"+ANSI_RESET);
		}
	}

}
