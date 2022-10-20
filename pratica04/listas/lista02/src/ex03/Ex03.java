package ex03;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		String precolitro = JOptionPane.showInputDialog(null, "Digite o preço do litro: ");
		String qtdlitro = JOptionPane.showInputDialog(null, "Digite a quantidade de litros: ");
		
		Double precolitrod = Double.valueOf(precolitro);
		Double qtdlitrod = Double.valueOf(qtdlitro);
		
		Double totalpagamento = qtdlitrod * precolitrod;
		
		JOptionPane.showMessageDialog(null, "Total do pagamento: R$" + totalpagamento);

	}

}
