package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaFilme extends JFrame {

	private JPanel contentPane;
	private JTextField txtFilme;
	private JTextField txtDiretor;
	private JTextField txtGenero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFilme frame = new TelaFilme();
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
	public TelaFilme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFilme = new JLabel("Filme: ");
		lblFilme.setBounds(63, 37, 46, 14);
		contentPane.add(lblFilme);
		
		txtFilme = new JTextField();
		txtFilme.setBounds(119, 34, 86, 20);
		contentPane.add(txtFilme);
		txtFilme.setColumns(10);
		
		JLabel lblDiretor = new JLabel("Diretor: ");
		lblDiretor.setBounds(63, 82, 46, 14);
		contentPane.add(lblDiretor);
		
		txtDiretor = new JTextField();
		txtDiretor.setBounds(119, 79, 86, 20);
		contentPane.add(txtDiretor);
		txtDiretor.setColumns(10);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(119, 133, 86, 20);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);
		
		JLabel lblGenero = new JLabel("Gênero:");
		lblGenero.setBounds(63, 136, 46, 14);
		contentPane.add(lblGenero);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(100, 190, 89, 23);
		contentPane.add(btnNewButton);
	}
}
