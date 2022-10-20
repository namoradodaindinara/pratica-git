package ex02;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		String idade = JOptionPane.showInputDialog(null, "Digite sua idade: ");
		
		Integer idadeint = Integer.valueOf(idade);
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idadeint);

	}

}
