package javaAula2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float idade;
		boolean resposta;

		System.out.println("Insira a sua idade");
		idade = leia.nextFloat();


		if(idade >= 10 && idade <= 14) {
			System.out.println("10-14 infatil");
		}
		else if(idade >=15 && idade <=17) {
			System.out.println("10-14 juvenil");
		}else if(idade >=18 && idade <= 25){
			System.out.println("18-15 adulto");
		}else {
			System.out.println("tente novamente");
		}
		

	}

}