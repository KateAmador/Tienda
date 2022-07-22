package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ProductoVista extends JFrame {

	public JPanel contentPane;
	public JTextField txtProductoID;
	public JTextField txtCantidad;
	public JTextField txtMarca;
	public JTextField txtValorVenta;
	public JTextField txtValorCompra;
	public JLabel lblAvisoNumeros;
	public JLabel lblAvisoNumeros2;
	public JLabel lblAvisoNumeros3;
	public JButton btnAgregar;
	public JButton btnBuscar;
	public JButton btnModificar;
	public JButton btnEliminar;
	public JButton btnLimpiar;
	public JButton btnBuscarCategoria;
	public JButton btnBuscarProveedor;
	public JTextField txtCategoria;
	public JTextField txtProveedor;
	public JLabel lblAvisoNumeros4;
	public JLabel lblAvisoNumeros5;
	public JLabel lblAvisoNumeros6;
	public JLabel lblAviso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductoVista frame = new ProductoVista();
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
	public ProductoVista() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 491, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblAviso = new JLabel("(*) Campos Obligatorios");
		lblAviso.setForeground(Color.RED);
		lblAviso.setBounds(266, 77, 179, 13);
		contentPane.add(lblAviso);
		lblAviso.setVisible(false);

		lblAvisoNumeros2 = new JLabel("Solo numeros");
		lblAvisoNumeros2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros2.setForeground(Color.RED);
		lblAvisoNumeros2.setBounds(160, 266, 96, 13);
		contentPane.add(lblAvisoNumeros2);
		lblAvisoNumeros2.setVisible(false);

		lblAvisoNumeros3 = new JLabel("Solo numeros");
		lblAvisoNumeros3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros3.setForeground(Color.RED);
		lblAvisoNumeros3.setBounds(397, 266, 114, 13);
		contentPane.add(lblAvisoNumeros3);
		lblAvisoNumeros3.setVisible(false);

		lblAvisoNumeros = new JLabel("Solo numeros");
		lblAvisoNumeros.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros.setForeground(Color.RED);
		lblAvisoNumeros.setBounds(398, 136, 126, 13);
		contentPane.add(lblAvisoNumeros);
		lblAvisoNumeros.setVisible(false);

		JLabel lblProductoId = new JLabel("Producto ID (*)");
		lblProductoId.setBounds(28, 74, 110, 19);
		contentPane.add(lblProductoId);

		txtProductoID = new JTextField();
		txtProductoID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();

				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros6.setVisible(true);
				} else {
					lblAvisoNumeros6.setVisible(false);
				}
			}
		});
		txtProductoID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				if (txtProductoID.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtProductoID.setBounds(28, 93, 85, 19);
		contentPane.add(txtProductoID);
		txtProductoID.setColumns(10);

		JLabel lblCantidad = new JLabel("Cantidad (*)");
		lblCantidad.setBounds(266, 132, 110, 19);
		contentPane.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();

				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros.setVisible(true);
				} else {
					lblAvisoNumeros.setVisible(false);
				}
			}
		});
		txtCantidad.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtCantidad.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(266, 151, 179, 19);
		contentPane.add(txtCantidad);

		JLabel lblMarca = new JLabel("Marca (*)");
		lblMarca.setBounds(266, 199, 110, 19);
		contentPane.add(lblMarca);

		txtMarca = new JTextField();
		txtMarca.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtMarca.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtMarca.setColumns(10);
		txtMarca.setBounds(266, 218, 179, 19);
		contentPane.add(txtMarca);

		JLabel lblValorVenta = new JLabel("Valor Venta (*)");
		lblValorVenta.setBounds(28, 263, 110, 19);
		contentPane.add(lblValorVenta);

		txtValorVenta = new JTextField();
		txtValorVenta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();

				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros2.setVisible(true);
				} else {
					lblAvisoNumeros2.setVisible(false);
				}
			}
		});
		txtValorVenta.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				if (txtValorVenta.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtValorVenta.setColumns(10);
		txtValorVenta.setBounds(28, 282, 179, 19);
		contentPane.add(txtValorVenta);

		JLabel lblProductoCate = new JLabel("Categoria (*)");
		lblProductoCate.setBounds(28, 130, 110, 19);
		contentPane.add(lblProductoCate);

		JLabel lblProductoPro = new JLabel("Proveedor (*)");
		lblProductoPro.setBounds(28, 197, 110, 19);
		contentPane.add(lblProductoPro);

		txtValorCompra = new JTextField();
		txtValorCompra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();

				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					lblAvisoNumeros3.setVisible(true);
				} else {
					lblAvisoNumeros3.setVisible(false);
				}
			}
		});
		txtValorCompra.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtValorCompra.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtValorCompra.setColumns(10);
		txtValorCompra.setBounds(266, 282, 179, 19);
		contentPane.add(txtValorCompra);

		JLabel lblValorCompra = new JLabel("Valor Compra (*)");
		lblValorCompra.setBounds(266, 263, 110, 19);
		contentPane.add(lblValorCompra);

		JLabel lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel.setBounds(184, 10, 123, 38);
		contentPane.add(lblNewLabel);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(28, 341, 85, 21);
		contentPane.add(btnAgregar);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(122, 92, 85, 21);
		contentPane.add(btnBuscar);

		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(140, 341, 85, 21);
		contentPane.add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(251, 341, 85, 21);
		contentPane.add(btnEliminar);

		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(361, 341, 85, 21);
		contentPane.add(btnLimpiar);

		JSeparator separator = new JSeparator();
		separator.setBounds(28, 322, 415, 2);
		contentPane.add(separator);

		txtCategoria = new JTextField();
		txtCategoria.addKeyListener(new KeyAdapter() {
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
		txtCategoria.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtCategoria.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});

		txtCategoria.setColumns(10);
		txtCategoria.setBounds(28, 152, 85, 19);
		contentPane.add(txtCategoria);

		btnBuscarCategoria = new JButton("Buscar");
		btnBuscarCategoria.setBounds(122, 151, 85, 21);
		contentPane.add(btnBuscarCategoria);

		txtProveedor = new JTextField();
		txtProveedor.addKeyListener(new KeyAdapter() {
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
		txtProveedor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtProveedor.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtProveedor.setColumns(10);
		txtProveedor.setBounds(28, 219, 85, 19);
		contentPane.add(txtProveedor);

		btnBuscarProveedor = new JButton("Buscar");
		btnBuscarProveedor.setBounds(122, 218, 85, 21);
		contentPane.add(btnBuscarProveedor);

		lblAvisoNumeros4 = new JLabel("Solo numeros");
		lblAvisoNumeros4.setForeground(Color.RED);
		lblAvisoNumeros4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros4.setBounds(28, 181, 110, 19);
		contentPane.add(lblAvisoNumeros4);
		lblAvisoNumeros4.setVisible(false);

		lblAvisoNumeros5 = new JLabel("Solo numeros");
		lblAvisoNumeros5.setForeground(Color.RED);
		lblAvisoNumeros5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros5.setBounds(28, 123, 110, 13);
		contentPane.add(lblAvisoNumeros5);
		lblAvisoNumeros5.setVisible(false);

		lblAvisoNumeros6 = new JLabel("Solo numeros");
		lblAvisoNumeros6.setForeground(Color.RED);
		lblAvisoNumeros6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAvisoNumeros6.setBounds(28, 59, 110, 19);
		contentPane.add(lblAvisoNumeros6);
		lblAvisoNumeros6.setVisible(false);
	}
}