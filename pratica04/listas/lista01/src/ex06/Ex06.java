package ex06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Integer[] vet = new Integer[10];
		String num;
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o número que deseja inserir no vetor: ");
			num = x.nextLine();
			Integer numint = Integer.valueOf(num);
			vet[i] = numint;
		}
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			} else if (vet[i] < menor) {
				menor = vet[i];
			}
		}
		
		System.out.println("Maior número armazenado no vetor: " + maior + ""
				+ "\nMenor número armazenado no vetor: " + menor);
	}

}
