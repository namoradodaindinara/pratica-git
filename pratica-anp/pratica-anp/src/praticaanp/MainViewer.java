/**
 * @author Enzo Gabriel da Rocha - Discente do Curso Técnico em Informático IFSC Câmpus Gaspar
 * @data 26/10/2022
 **/

package praticaanp;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainViewer {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtCpf;
	private String select = "";
	private String text = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 117, 271, 115);
		frame.getContentPane().add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(79, 11, 107, 22);

		String[] pronouns = { "", "Sr.", "Sra.", "Srta." };

		for (int i = 0; i < pronouns.length; i++) {
			comboBox.addItem(pronouns[i]);
		}

		frame.getContentPane().add(comboBox);

		JButton btnAdd = new JButton("ADICIONAR");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString().length() == 0 || txtName.getText().length() == 0
						|| txtCpf.getText().length() == 0) {

					JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");

				} else if (txtCpf.getText().length() == 11){
					
					String cpf = txtCpf.getText();
					String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9)
							+ "-" + cpf.substring(9, 11);
					
					if (text.contains(cpfFormatado)) {
						
						JOptionPane.showMessageDialog(null, "Este CPF jpa foi cadastrado. Tente novamente.");
						txtCpf.setText(null);
						txtName.setText(null);
						comboBox.setSelectedIndex(0);

					} else {
						select = String.valueOf(comboBox.getSelectedItem()) + " " + txtName.getText() + " cujo CPF é "
								+ cpfFormatado;

						text += select + "\n";

						textArea.setText(text);
						txtCpf.setText(null);
						txtName.setText(null);
						comboBox.setSelectedIndex(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "CPF inválido. Insira seu CPF com todos os digitos necessários.");
					txtCpf.setText(null);
					txtName.setText(null);
					comboBox.setSelectedIndex(0);
				}

			}
		});
		btnAdd.setBounds(208, 24, 97, 55);
		frame.getContentPane().add(btnAdd);

		JLabel lblNewLabel = new JLabel("Pronomes:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(1, 15, 68, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(23, 44, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(23, 78, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);

		txtName = new JTextField();
		txtName.setBounds(79, 44, 107, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtCpf = new JTextField();
		txtCpf.setBounds(79, 75, 107, 20);
		frame.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);

	}
}
