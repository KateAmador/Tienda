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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SalidaVista extends JFrame {

	public JPanel contentPane;
	public JTextField txtIDSalida;
	public JTextField txtID_Producto;
	public JTextField txt_IDFactura;
	public JTextField txtCantidad;
	public JTextField txtValorVenta;
	public JButton btnGuardarS;
	public JButton btnModificarS;
	public JButton btnBuscarS;
	public JButton btnEliminarS;
	public JButton btnLimpiarS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalidaVista frame = new SalidaVista();
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
	public SalidaVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Salida");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(217, 11, 72, 25);
		contentPane.add(lblNewLabel);

		JLabel lblIDSalida = new JLabel("ID_Salida");
		lblIDSalida.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIDSalida.setBounds(75, 75, 119, 25);
		contentPane.add(lblIDSalida);

		txtIDSalida = new JTextField();
		txtIDSalida.addKeyListener(new KeyAdapter() {
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
		txtIDSalida.setBounds(177, 77, 161, 24);
		contentPane.add(txtIDSalida);
		txtIDSalida.setColumns(10);

		txtID_Producto = new JTextField();
		txtID_Producto.addKeyListener(new KeyAdapter() {
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
		txtID_Producto.setColumns(10);
		txtID_Producto.setBounds(177, 123, 161, 24);
		contentPane.add(txtID_Producto);

		JLabel lblIDProducto = new JLabel("ID_Producto");
		lblIDProducto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIDProducto.setBounds(75, 121, 119, 25);
		contentPane.add(lblIDProducto);

		JLabel lblID_Factura = new JLabel("ID_Factura");
		lblID_Factura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblID_Factura.setBounds(75, 170, 119, 25);
		contentPane.add(lblID_Factura);

		txt_IDFactura = new JTextField();
		txt_IDFactura.addKeyListener(new KeyAdapter() {
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
		txt_IDFactura.setColumns(10);
		txt_IDFactura.setBounds(177, 172, 161, 24);
		contentPane.add(txt_IDFactura);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCantidad.setBounds(75, 220, 119, 25);
		contentPane.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
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
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(177, 222, 161, 24);
		contentPane.add(txtCantidad);

		JLabel lblValorVenta = new JLabel("Valor Venta");
		lblValorVenta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorVenta.setBounds(75, 264, 119, 25);
		contentPane.add(lblValorVenta);

		txtValorVenta = new JTextField();
		txtValorVenta.addKeyListener(new KeyAdapter() {
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
		txtValorVenta.setColumns(10);
		txtValorVenta.setBounds(177, 266, 161, 24);
		contentPane.add(txtValorVenta);

		btnGuardarS = new JButton("Guardar");
		btnGuardarS.setBounds(10, 312, 117, 43);
		contentPane.add(btnGuardarS);

		btnModificarS = new JButton("Modificar");
		btnModificarS.setBounds(152, 312, 117, 43);
		contentPane.add(btnModificarS);

		btnBuscarS = new JButton("Buscar");
		btnBuscarS.setBounds(348, 68, 117, 43);
		contentPane.add(btnBuscarS);

		btnEliminarS = new JButton("Eliminar");
		btnEliminarS.setBounds(279, 312, 117, 43);
		contentPane.add(btnEliminarS);

		btnLimpiarS = new JButton("Limpiar");
		btnLimpiarS.setBounds(406, 312, 117, 43);
		contentPane.add(btnLimpiarS);
	}

}
