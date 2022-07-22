package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Label;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.SystemColor;

public class FacturaVista extends JFrame {

	public JPanel contentPane;
	public JTextField FacturaID;
	public JTextField ClienteID;
	public JTextField cantidad;
	public JTextField total;
	public JTextField fecha;
	public JButton btnGuardar;
	public JButton btnBuscar;
	public JButton Borrar;
	public JButton Actualizar;
	public JLabel lbl_aviso;
	public JLabel avisonumero;
	public JLabel aviso1;
	public JLabel aviso2;
	public JLabel aviso3;
	public JLabel aviso4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacturaVista frame = new FacturaVista();
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
	public FacturaVista() {
		setBackground(Color.WHITE);
		setTitle("Factura\r\n");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 457, 466);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(0, 62, 524, 430);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		lbl_aviso = new JLabel("porfavor llene todos los campos");
		lbl_aviso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbl_aviso.setForeground(Color.RED);
		lbl_aviso.setBounds(111, -25, 208, 70);
		lbl_aviso.setVisible(false);

		aviso4 = new JLabel("Solo numeros");
		aviso4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso4.setForeground(Color.RED);
		aviso4.setBounds(329, 277, 79, 14);
		panel_2.add(aviso4);
		aviso4.setVisible(false);

		aviso2 = new JLabel("Solo numeros");
		aviso2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso2.setForeground(Color.RED);
		aviso2.setBounds(329, 147, 79, 14);
		panel_2.add(aviso2);
		aviso2.setVisible(false);

		aviso1 = new JLabel("Solo numeros");
		aviso1.setForeground(Color.RED);
		aviso1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso1.setBounds(329, 87, 79, 14);
		panel_2.add(aviso1);
		aviso1.setVisible(false);

		avisonumero = new JLabel("solo numeros");
		avisonumero.setFont(new Font("Tahoma", Font.PLAIN, 10));
		avisonumero.setForeground(Color.RED);
		avisonumero.setBounds(329, 31, 79, 14);
		panel_2.add(avisonumero);
		panel_2.add(lbl_aviso);
		avisonumero.setVisible(false);

		Borrar = new JButton("Borrar");
		Borrar.setBackground(Color.WHITE);
		Borrar.setBounds(329, 320, 89, 23);
		panel_2.add(Borrar);

		JLabel Factura_ID = new JLabel("Factura_ID");
		Factura_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Factura_ID.setBounds(41, 31, 79, 14);
		panel_2.add(Factura_ID);

		JLabel Cliente_ID = new JLabel("Cliente_fk");
		Cliente_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cliente_ID.setBounds(41, 87, 79, 14);
		panel_2.add(Cliente_ID);

		JLabel Cantidad = new JLabel("Cantidad");
		Cantidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cantidad.setBounds(41, 147, 79, 14);
		panel_2.add(Cantidad);

		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Total.setBounds(41, 210, 79, 14);
		panel_2.add(Total);

		JLabel Fecha = new JLabel("Fecha");
		Fecha.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Fecha.setBounds(41, 277, 45, 14);
		panel_2.add(Fecha);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(28, 320, 89, 23);
		panel_2.add(btnGuardar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(127, 320, 89, 23);
		panel_2.add(btnBuscar);

		Actualizar = new JButton("Actualizar");
		Actualizar.setBackground(Color.WHITE);
		Actualizar.setBounds(226, 320, 89, 23);
		panel_2.add(Actualizar);

		FacturaID = new JTextField();
		FacturaID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					avisonumero.setVisible(true);

				}
			}
		});
		FacturaID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (FacturaID.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					lbl_aviso.setVisible(false);
				}
			}
		});
		FacturaID.setBackground(Color.WHITE);
		FacturaID.setDropMode(DropMode.INSERT);
		FacturaID.setBounds(111, 28, 206, 20);
		panel_2.add(FacturaID);
		FacturaID.setColumns(10);

		ClienteID = new JTextField();
		ClienteID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					aviso1.setVisible(true);
				}
			}
		});
		ClienteID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (ClienteID.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					lbl_aviso.setVisible(true);
				}
			}
		});
		ClienteID.setBackground(Color.WHITE);
		ClienteID.setColumns(10);
		ClienteID.setBounds(111, 84, 206, 20);
		panel_2.add(ClienteID);

		fecha = new JTextField();
		fecha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					aviso4.setVisible(true);
				}
			}
		});
		fecha.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (fecha.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					aviso4.setVisible(false);
				}
			}
		});
		fecha.setBackground(Color.WHITE);
		fecha.setColumns(10);
		fecha.setBounds(111, 274, 206, 20);
		panel_2.add(fecha);

		cantidad = new JTextField();
		cantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					aviso2.setVisible(true);
				}
			}
		});
		cantidad.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (cantidad.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					lbl_aviso.setVisible(false);
				}
			}
		});
		cantidad.setBackground(Color.WHITE);
		cantidad.setColumns(10);
		cantidad.setBounds(111, 144, 206, 20);
		panel_2.add(cantidad);

		aviso3 = new JLabel("Solo numeros");
		aviso3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		aviso3.setForeground(Color.RED);
		aviso3.setBounds(329, 210, 79, 14);
		panel_2.add(aviso3);
		aviso3.setVisible(false);

		total = new JTextField();
		total.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					aviso3.setVisible(true);
				}
			}
		});
		total.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (total.getText().trim().isEmpty()) {
					lbl_aviso.setVisible(true);
				} else {
					lbl_aviso.setVisible(false);

				}

			}
		});
		total.setBackground(Color.WHITE);
		total.setColumns(10);
		total.setBounds(111, 207, 206, 20);
		panel_2.add(total);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 524, 63);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Factura");
		lblNewLabel.setBounds(10, 11, 149, 52);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 44));
	}

	public void validaciones() {
		if (FacturaID.getText().trim().isEmpty() || ClienteID.getText().trim().isEmpty()
				|| cantidad.getText().trim().isEmpty() || total.getText().trim().isEmpty()
				|| fecha.getText().trim().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos ", "Error",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
