package javaAula3;

import java.util.Scanner;

public class Exercicio2 {
	
	public static Scanner Leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero, contador,pares = 0,impares = 0;
		
		
		for( contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite um número: ");
			numero = Leia.nextInt();
			if(numero % 2 == 0) {
				pares++;
			}
			if(numero % 2 == 1) {
				impares++;
			}
		}
		System.out.println("\nTotal numeros pares é :" + pares);
		System.out.println("\nTotal numeros impares é :" + impares);
	}

}
