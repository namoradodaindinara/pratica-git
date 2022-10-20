package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String nome, idade;
		
		System.out.println("Digite seu nome: ");
		nome = x.nextLine();
		System.out.println("Digite sua idade: ");
		idade = x.nextLine();
		
		Integer idadeint = Integer.valueOf(idade);
		
		System.out.println("Nome: " + nome + "\nIdade: " + idadeint);
	}

}
