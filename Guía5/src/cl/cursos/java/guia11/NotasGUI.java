package cl.cursos.java.guia11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotasGUI {

	private JFrame frame;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JLabel lblPromedio;
	private JTextField promedioText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
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
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblIngresarNota = new JLabel("Ingresar Nota 1");
		lblIngresarNota.setBounds(45, 33, 86, 14);
		frame.getContentPane().add(lblIngresarNota);

		nota1 = new JTextField();
		nota1.setBounds(195, 30, 86, 20);
		frame.getContentPane().add(nota1);
		nota1.setColumns(10);

		JLabel lblIngreseNota = new JLabel("Ingresar Nota 2");
		lblIngreseNota.setBounds(45, 75, 86, 14);
		frame.getContentPane().add(lblIngreseNota);

		nota2 = new JTextField();
		nota2.setBounds(195, 72, 86, 20);
		frame.getContentPane().add(nota2);
		nota2.setColumns(10);

		JLabel lblIngresarNota_1 = new JLabel("Ingresar Nota 3");
		lblIngresarNota_1.setBounds(45, 128, 86, 14);
		frame.getContentPane().add(lblIngresarNota_1);

		nota3 = new JTextField();
		nota3.setBounds(195, 125, 86, 20);
		frame.getContentPane().add(nota3);
		nota3.setColumns(10);

		JButton btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int promedio = (Integer.parseInt(nota1.getText()) + Integer.parseInt(nota2.getText())
						+ Integer.parseInt(nota3.getText())) / 3;

				System.out.println(promedio);
				promedioText.setText("" + promedio);

			}
		});
		btnCalcularPromedio.setBounds(152, 177, 129, 23);
		frame.getContentPane().add(btnCalcularPromedio);

		lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(45, 219, 86, 14);
		frame.getContentPane().add(lblPromedio);

		promedioText = new JTextField();
		promedioText.setBounds(195, 216, 86, 20);
		frame.getContentPane().add(promedioText);
		promedioText.setColumns(10);
	}
}
