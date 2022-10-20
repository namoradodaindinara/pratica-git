/**
 * @author Enzo Gabriel da Rocha - Discente do Curso Técnico em Informático IFSC Câmpus Gaspar
 * @data 19/10/2022
 **/

package pratica02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 196, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome = new JTextField();
		txtNome.setBounds(65, 27, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtN1 = new JTextField();
		txtN1.setBounds(65, 58, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);

		txtN2 = new JTextField();
		txtN2.setBounds(65, 89, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);

		txtN3 = new JTextField();
		txtN3.setBounds(65, 120, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(9, 30, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(9, 61, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nosta 2:");
		lblNewLabel_2.setBounds(9, 92, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(9, 123, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();

				String n1 = txtN1.getText();
				String n2 = txtN2.getText();
				String n3 = txtN1.getText();

				if (n1.isEmpty() || n2.isEmpty() || n3.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Campo vazio. Tente novamente.");
				} else {
					Double nota1 = Double.valueOf(n1);
					Double nota2 = Double.valueOf(n2);
					Double nota3 = Double.valueOf(n3);

					if ((nota1 > 10 || nota1 < 0) || (nota2 > 10 || nota2 < 0) || (nota3 > 10 || nota3 < 0)) {
						JOptionPane.showMessageDialog(null, "Notas inválidas. Por favor, digite valores corretos.");
					} else {
						double media = (nota1 + nota2 + nota3) / 3;

						JOptionPane.showMessageDialog(null, "Média de " + nome + ": " + Math.round(media));

						if (media < 6) {
							JOptionPane.showMessageDialog(null, "ALUNO REPROVADO");
						} else {
							JOptionPane.showMessageDialog(null, "ALUNO APROVADO");
						}
					}

				}

			}
		});
		btnCalc.setBounds(44, 167, 89, 23);
		contentPane.add(btnCalc);
	}

}
