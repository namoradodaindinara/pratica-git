package ex07;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota do aluno: ");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota do aluno: ");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota do aluno: ");
		
		Double n1 = Double.valueOf(nota1);
		Double n2 = Double.valueOf(nota2);
		Double n3 = Double.valueOf(nota3);
		
		Double media = (n1 + n2 + n3) / 3;
		
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "MÉDIA: " + Math.round(media) + "\nSITUAÇÃO: Aprovado.");
		} else if (media >= 4 && media < 6) {
			JOptionPane.showMessageDialog(null, "MÉDIA: " + Math.round(media) + "\nSITUAÇÃO: Recuperação.");
		} else if (media < 4) {
			JOptionPane.showMessageDialog(null, "MÉDIA: " + Math.round(media) + "\nSITUAÇÃO: Reprovado.");
		}

	}

}
