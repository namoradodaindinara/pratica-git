package ex10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String nomealuno, n1, n2, n3;
		
		System.out.println("Digite o nome do aluno: ");
		nomealuno = x.nextLine();
		System.out.println("Digite a primeira nota do aluno: ");
		n1 = x.nextLine();
		System.out.println("Digite a segunda nota do aluno: ");
		n2 = x.nextLine();
		System.out.println("Digite a terceira nota do aluno: ");
		n3 = x.nextLine();
		
		calcMedia(nomealuno, n1, n2, n3);
	}
	
	public static void calcMedia(String nome, String nota1, String nota2, String nota3) {
		Double nota1d = Double.valueOf(nota1);
		Double nota2d = Double.valueOf(nota2);
		Double nota3d = Double.valueOf(nota3);
		
		Double media = (nota1d + nota2d + nota3d) / 3;
		
		System.out.println("Nome do aluno: " + nome);
		
		if (media >= 6 ) {
			System.out.println("MÉDIA: " + Math.round(media) + "\nSITUAÇÃO: Aprovado");
		} else if (media >= 4 && media < 6) {
			System.out.println("MÉDIA: " + Math.round(media) + "\nSITUAÇÃO: Recuperação");
		} else if (media < 4) {
			System.out.println("MÉDIA: " + Math.round(media) + "\nSITUAÇÃO: Reprovado");
		}
	}

}
