package javaAula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float num1, num2, num3, maior;

		Scanner numbers = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		num1 = numbers.nextFloat();
		System.out.println("Digite um valor: ");
		num2 = numbers.nextFloat();
		System.out.println("Digite um valor: ");
		num3 = numbers.nextFloat();

		maior = num1;

		if (maior < num2)
			maior = num2;
		if (maior < num3)
			maior = num3;

		System.out.println("O maior número digitado é: " + maior);

	}

}
