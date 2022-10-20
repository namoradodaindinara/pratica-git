package ex04;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String num = JOptionPane.showInputDialog(null, "Digite um número: ");
			Integer numint = Integer.valueOf(num);
			JOptionPane.showMessageDialog(null, "Número digitado: " + numint);
		}

	}

}
