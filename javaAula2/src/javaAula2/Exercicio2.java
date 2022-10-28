package javaAula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int auxiliar;

		System.out.println("Digite um número: ");
		numero1 = leia.nextInt();

		System.out.println("Digite um número: ");
		numero2 = leia.nextInt();

		System.out.println("Digite um número: ");
		numero3 = leia.nextInt();

		System.out.println(numero1);

		if (numero1 > numero2) {
			auxiliar = numero1;
			numero1 = numero2;
			numero2 = auxiliar;
		}

		if (numero2 > numero3) {
			auxiliar = numero2;
			numero2 = numero3;
			numero3 = auxiliar;

		}

		if (numero1 > numero2) {
			auxiliar = numero1;
			numero1 = numero2;
			numero2 = auxiliar;
		}
		System.out.println("Ordem crescente: " + numero1 + numero2 + numero3);

	}

}
