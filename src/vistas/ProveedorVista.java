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
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ProveedorVista extends JFrame {

	public JPanel contentPane;
	public JTextField txtProveedorId;
	public JTextField txtEmpresa;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtTelefono;
	public JButton btnAgregar;
	public JButton btnBuscar;
	public JButton btnModificar;
	public JButton btnEliminar;
	public JButton btnLimpiar;
	public JLabel lblAvisoNumeros;
	public JLabel lblAvisoNumeros2;
	public JLabel lblAvisoNumeros3;
	public JLabel lblAvisoNumeros4;
	public JLabel lblAvisoNumeros5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProveedorVista frame = new ProveedorVista();
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
	public ProveedorVista() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 492, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAviso = new JLabel("(*) Campos obligatorios");
		lblAviso.setForeground(Color.RED);
		lblAviso.setBounds(275, 87, 173, 13);
		contentPane.add(lblAviso);

		lblAviso.setVisible(false);

		JLabel lblProveedores = new JLabel("PROVEEDORES");
		lblProveedores.setFont(new Font("Roboto", Font.BOLD, 20));
		lblProveedores.setBounds(181, 10, 137, 24);
		contentPane.add(lblProveedores);

		JLabel lblProveedorID = new JLabel("Proveedor ID (*)");
		lblProveedorID.setBounds(20, 71, 86, 13);
		contentPane.add(lblProveedorID);

		txtProveedorId = new JTextField();
		txtProveedorId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char validar = e.getKeyChar();

				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros4.setVisible(true);
				} else {
					lblAvisoNumeros4.setVisible(false);
				}
			}
		});
		txtProveedorId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtProveedorId.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtProveedorId.setBounds(20, 84, 86, 19);
		contentPane.add(txtProveedorId);
		txtProveedorId.setColumns(10);

		JLabel lblEmpresa = new JLabel("Empresa (*)");
		lblEmpresa.setBounds(20, 122, 86, 13);
		contentPane.add(lblEmpresa);

		txtEmpresa = new JTextField();
		txtEmpresa.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				char validar = e.getKeyChar();

				if (Character.isDigit(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros.setVisible(true);
				} else {
					lblAvisoNumeros.setVisible(false);
				}
			}
		});
		txtEmpresa.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEmpresa.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtEmpresa.setColumns(10);
		txtEmpresa.setBounds(20, 135, 177, 19);
		contentPane.add(txtEmpresa);

		JLabel lblNombre = new JLabel("Nombre (*)");
		lblNombre.setBounds(275, 122, 86, 13);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();

				if (Character.isDigit(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros3.setVisible(true);
				} else {
					lblAvisoNumeros3.setVisible(false);
				}
			}
		});
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtNombre.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtNombre.setColumns(10);
		txtNombre.setBounds(275, 135, 177, 19);
		contentPane.add(txtNombre);

		JLabel lblApellido = new JLabel("Apellido (*)");
		lblApellido.setBounds(20, 170, 86, 13);
		contentPane.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();

				if (Character.isDigit(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros2.setVisible(true);
				} else {
					lblAvisoNumeros2.setVisible(false);
				}
			}
		});
		txtApellido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtApellido.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtApellido.setColumns(10);
		txtApellido.setBounds(20, 183, 177, 19);
		contentPane.add(txtApellido);

		JLabel lblTelefono = new JLabel("Telefono (*)");
		lblTelefono.setBounds(275, 170, 86, 13);
		contentPane.add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();

				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros5.setVisible(true);
				} else {
					lblAvisoNumeros5.setVisible(false);
				}
			}
		});
		txtTelefono.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtTelefono.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(275, 183, 177, 19);
		contentPane.add(txtTelefono);

		JSeparator separator = new JSeparator();
		separator.setBounds(20, 222, 428, 2);
		contentPane.add(separator);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(20, 236, 85, 21);
		contentPane.add(btnAgregar);

		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(133, 236, 85, 21);
		contentPane.add(btnModificar);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(367, 236, 85, 21);
		contentPane.add(btnLimpiar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(252, 236, 85, 21);
		contentPane.add(btnEliminar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(112, 83, 85, 21);
		contentPane.add(btnBuscar);

		lblAvisoNumeros = new JLabel("Solo letras");
		lblAvisoNumeros.setForeground(Color.RED);
		lblAvisoNumeros.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros.setBounds(157, 123, 59, 13);
		contentPane.add(lblAvisoNumeros);
		lblAvisoNumeros.setVisible(false);

		lblAvisoNumeros2 = new JLabel("Solo letras");
		lblAvisoNumeros2.setForeground(Color.RED);
		lblAvisoNumeros2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros2.setBounds(157, 171, 59, 13);
		contentPane.add(lblAvisoNumeros2);
		lblAvisoNumeros2.setVisible(false);

		lblAvisoNumeros3 = new JLabel("Solo letras");
		lblAvisoNumeros3.setForeground(Color.RED);
		lblAvisoNumeros3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros3.setBounds(409, 123, 59, 13);
		contentPane.add(lblAvisoNumeros3);
		lblAvisoNumeros3.setVisible(false);

		lblAvisoNumeros4 = new JLabel("Solo numeros");
		lblAvisoNumeros4.setForeground(Color.RED);
		lblAvisoNumeros4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros4.setBounds(20, 61, 59, 13);
		contentPane.add(lblAvisoNumeros4);
		lblAvisoNumeros4.setVisible(false);

		lblAvisoNumeros5 = new JLabel("Solo numeros");
		lblAvisoNumeros5.setForeground(Color.RED);
		lblAvisoNumeros5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros5.setBounds(393, 171, 59, 13);
		contentPane.add(lblAvisoNumeros5);
		lblAvisoNumeros5.setVisible(false);
	}
}