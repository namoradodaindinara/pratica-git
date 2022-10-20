package ex05;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		Integer[] vet = new Integer[10];
		String num;
		
		for (int i = 0; i < vet.length; i++) {
			num = JOptionPane.showInputDialog("Digite um número a ser armazenado no vetor: ");
			Integer numint = Integer.valueOf(num);
			vet[i] = numint;
		}
		
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			} else if (vet[i] < menor){
				menor = vet[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior número armazenado no vetor: " + maior + ""
				+ "\nMenor número armazenado no vetor: " + menor);

	}

}
