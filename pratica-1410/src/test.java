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

public class test {

	private JFrame frame;
	ArrayList<String> itens = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 377, 208);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(91, 11, 107, 22);

		String[] pokemons = { "", "Charmander", "Bulbassauro", "Squirtle", "Pikachu" };

		for (int i = 0; i < pokemons.length; i++) {
			comboBox.addItem(pokemons[i]);
		}

		frame.getContentPane().add(comboBox);

		JTextArea textArea = new JTextArea();

		JButton btnAdd = new JButton("ADICIONAR");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String select = String.valueOf(comboBox.getSelectedItem());

				if (select.length() == 0) {
					JOptionPane.showMessageDialog(null, "Adicione um valor");
				} else {
					itens.add(comboBox.getSelectedItem().toString());

					for (int i = 0; i < itens.size(); i++) {
						textArea.setText(itens.toString());
					}
				}

			}
		});
		btnAdd.setBounds(208, 11, 124, 23);
		frame.getContentPane().add(btnAdd);

		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(31, 15, 68, 14);
		frame.getContentPane().add(lblNewLabel);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 271, 115);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(textArea);

	}
}
