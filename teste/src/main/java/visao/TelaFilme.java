package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaFilme extends JFrame {

	private JPanel contentPane;
	private JTextField txtFilme;

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
		setBounds(100, 100, 373, 276);
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
	}
}
