package atividades;

import java.util.Scanner;

public class CaixaEletronico {
	
	static Scanner lerDados = new Scanner(System.in);
	static float saldo = 0;
	
	public static void depositar() {
		float num1;
		System.out.println("Digite o valor de deposito: ");
		num1 = lerDados.nextFloat();
		if (num1 < 0) {
			System.err.println("essa funcao nao pode ser realizada!");
		}
		else {
			saldo += num1;	
		}
		
	}
	
	public static void sacar() {
		float num1 = 0;
		
		System.out.println("digite o valor para Sacar: ");
		num1 = lerDados.nextFloat();

		if (saldo < num1) {
			System.err.println("Voce nao tem esse dinheiro para Sacar!!");
		}
		else {
			saldo -= num1;
			System.out.printf("O valor sacado %.2f\n", num1);
		}
		
	}
	
 	public static int menu() {
		int num = 0;
		do {
			System.out.println("+================================+");
			System.out.println(". escolha uma das opcoes abaixo: . ");
			System.out.println(". [1]-Consultar saldo            .");
			System.out.println(". [2]-Sacar                      .");
			System.out.println(". [3]-Depositar                  .");
			System.out.println(". [4]-Sair do sistema            .");
			System.out.println("+================================+");
			num=lerDados.nextInt();	
		} while ((num != 1) && (num != 2) && (num != 3) && (num != 4));
		
		return num;
	}

	public static void main(String[] args) {
		int opcacao;
		
		do {
			opcacao = menu();
			switch(opcacao) {
				case 1 -> System.out.printf("saldo total %.2f\n", saldo);
				case 2 -> sacar();
				case 3 -> depositar();
				case 4 -> {
					System.err.println("+=============+");
					System.err.println(".  saindo...  .");
					System.err.println("+=============+");
				}
				default -> System.err.println("Código de menu inválido");
			}
		} while(opcacao != 4);
	}

}
