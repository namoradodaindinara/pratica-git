package ex01;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Nome: " + nome);

	}

}
