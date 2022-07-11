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

public class ProductoVista extends JFrame {

	private JPanel contentPane;
	private JTextField txtProductoID;
	private JTextField txtCantidad;
	private JTextField txtMarca;
	private JTextField txtValorVenta;
	private JTextField txtValorCompra;
	private JComboBox comboCategoria;
	private JComboBox comboProveedor;
	private JLabel lblAvisoNumeros;
	private JLabel lblAvisoNumeros2;
	private JLabel lblAvisoNumeros3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAviso = new JLabel("(*) Campos Obligatorios");
		lblAviso.setForeground(Color.RED);
		lblAviso.setBounds(28, 58, 179, 13);
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

		comboCategoria = new JComboBox();
		comboCategoria.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (comboCategoria.equals("")) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		comboCategoria.setBounds(28, 149, 179, 21);
		contentPane.add(comboCategoria);

		JLabel lblProductoCate = new JLabel("Categoria (*)");
		lblProductoCate.setBounds(28, 130, 110, 19);
		contentPane.add(lblProductoCate);

		JLabel lblProductoPro = new JLabel("Proveedor (*)");
		lblProductoPro.setBounds(28, 197, 110, 19);
		contentPane.add(lblProductoPro);

		comboProveedor = new JComboBox();
		comboProveedor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (comboProveedor.equals("")) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		comboProveedor.setBounds(28, 216, 179, 21);
		contentPane.add(comboProveedor);

		txtValorCompra = new JTextField();
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

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				validarCampoNumerico();

				if (txtProductoID.getText().trim().isEmpty() || comboCategoria.equals("") || comboProveedor.equals("")
						|| txtCantidad.getText().trim().isEmpty() || txtMarca.getText().trim().isEmpty()
						|| txtValorVenta.getText().trim().isEmpty() || txtValorCompra.getText().trim().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Error",
							JOptionPane.WARNING_MESSAGE);

					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}

		});
		btnAgregar.setBounds(28, 341, 85, 21);
		contentPane.add(btnAgregar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(122, 92, 85, 21);
		contentPane.add(btnBuscar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(140, 341, 85, 21);
		contentPane.add(btnModificar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(251, 341, 85, 21);
		contentPane.add(btnEliminar);

		JButton btnNewButton_3_1 = new JButton("Limpiar");
		btnNewButton_3_1.setBounds(361, 341, 85, 21);
		contentPane.add(btnNewButton_3_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(28, 322, 415, 2);
		contentPane.add(separator);

	}

	public static boolean validarNumeros(String datos) {
		return datos.matches("[0-9]*");
	}

	/*
	 * public static boolean validarCaracteres(String datos) { return
	 * datos.matches("[a-zA-z]"); }
	 */

	public void validarCampoNumerico() {
		if (validarNumeros(txtCantidad.getText().trim())) {
			lblAvisoNumeros.setVisible(false);
		} else {
			lblAvisoNumeros.setVisible(true);
		}

		if (validarNumeros(txtValorVenta.getText().trim())) {
			lblAvisoNumeros2.setVisible(false);
		} else {
			lblAvisoNumeros2.setVisible(true);
		}

		if (validarNumeros(txtValorCompra.getText().trim())) {
			lblAvisoNumeros3.setVisible(false);
		} else {
			lblAvisoNumeros3.setVisible(true);
		}

	}

}

/*
 * public void ValidarCampoCaracteres() { if
 * (validarNumeros(txtCantidad.getText().trim()) ||
 * validarNumeros(txtValorVenta.getText().trim()) ||
 * validarNumeros(txtValorCompra.getText().trim())) {
 * lblAvisoNumeros.setVisible(false); lblAvisoNumeros2.setVisible(false);
 * lblAvisoNumeros3.setVisible(false); } else {
 * lblAvisoNumeros.setVisible(true); lblAvisoNumeros2.setVisible(true);
 * lblAvisoNumeros3.setVisible(true); } }
 */
