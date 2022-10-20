package ex06;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			lista.add(JOptionPane.showInputDialog(null, "Digite um elemento para a lista: "));
		}
		
		JOptionPane.showMessageDialog(null, "Elementos da lista: " + lista);
	}

}
