package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientesVista extends JFrame {

	public JPanel contentPane;
	public JTextField txtID_Cliente;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtDocumento;
	public JTextField txtTelefono;
	public JButton btnBuscarC;
	public JButton btnGuardarC;
	public JButton btnModificarC;
	public JButton btnEliminarC;
	public JButton btnLimpiarC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientesVista frame = new ClientesVista();
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
	public ClientesVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CLIENTES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(226, 11, 109, 43);
		contentPane.add(lblNewLabel);

		JLabel lblID_Cliente = new JLabel("ID_Cliente");
		lblID_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblID_Cliente.setBounds(50, 73, 89, 17);
		contentPane.add(lblID_Cliente);

		txtID_Cliente = new JTextField();
		txtID_Cliente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "Por favor ingrese solo numeros");
				}
			}
		});
		txtID_Cliente.setBounds(156, 73, 143, 20);
		contentPane.add(txtID_Cliente);
		txtID_Cliente.setColumns(10);

		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isDigit(validar)) {

					getToolkit().beep();
					e.consume();

					JOptionPane.showMessageDialog(rootPane, "Por favor ingrese solo letras");
				}

			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(156, 114, 143, 20);
		contentPane.add(txtNombre);

		JLabel lblNombre = new JLabel(" Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(50, 114, 89, 17);
		contentPane.add(lblNombre);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellido.setBounds(50, 156, 89, 17);
		contentPane.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isDigit(validar)) {

					getToolkit().beep();
					e.consume();

					JOptionPane.showMessageDialog(rootPane, "Por favor ingrese solo letras");
				}
			}
		});
		txtApellido.setColumns(10);
		txtApellido.setBounds(156, 156, 143, 20);
		contentPane.add(txtApellido);

		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDocumento.setBounds(50, 204, 89, 17);
		contentPane.add(lblDocumento);

		txtDocumento = new JTextField();
		txtDocumento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "Por favor ingrese solo numeros");
				}
			}
		});
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(156, 204, 143, 20);
		contentPane.add(txtDocumento);

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(50, 246, 89, 17);
		contentPane.add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "Por favor ingrese solo numeros");
				}
			}
		});
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(156, 246, 143, 20);
		contentPane.add(txtTelefono);

		btnModificarC = new JButton("Modificar");
		btnModificarC.setBounds(178, 310, 117, 43);
		contentPane.add(btnModificarC);

		btnBuscarC = new JButton("Buscar");
		btnBuscarC.setBounds(309, 69, 117, 29);
		contentPane.add(btnBuscarC);

		btnEliminarC = new JButton("Eliminar");
		btnEliminarC.setBounds(316, 310, 117, 43);
		contentPane.add(btnEliminarC);

		btnLimpiarC = new JButton("Limpiar");
		btnLimpiarC.setBounds(443, 310, 117, 43);
		contentPane.add(btnLimpiarC);

		btnGuardarC = new JButton("Guardar");
		btnGuardarC.setBounds(50, 320, 89, 23);
		contentPane.add(btnGuardarC);
	}
}
