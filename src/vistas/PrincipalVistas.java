package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorProducto;
import controlador.ControladorProductoProveedor;
import controlador.ControladorProveedor;
import controlador.ctrFactura;
import modelo.ConsultaClientes;
import modelo.ConsultasFactura;
import modelo.ConsultasProducto;
import modelo.ConsultasProveedor;
import modelo.Factura;
import modelo.Producto;
import modelo.Proveedor;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalVistas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalVistas frame = new PrincipalVistas();
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
	public PrincipalVistas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 608, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPrincipal = new JLabel("Tienda");
		lblPrincipal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrincipal.setBounds(265, 10, 76, 42);
		contentPane.add(lblPrincipal);

		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Cliente cliente = new Cliente();
				// ConsultaClientes cl = new ConsultaClientes();
				Clientes frm = new Clientes();

				// ControladorCliente ctrl = new ControladorCliente(cliente, cl, frm);
				// ctrl.iniciar();
				frm.setVisible(true);

			}
		});
		btnClientes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnClientes.setBounds(223, 90, 152, 42);
		contentPane.add(btnClientes);

		JButton btnFacturas = new JButton("Facturas");
		btnFacturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Factura ftr = new Factura();
				ConsultasFactura cf = new ConsultasFactura();
				FacturaVista frm = new FacturaVista();

				ctrFactura ctrl = new ctrFactura(ftr, cf, frm);
				ctrl.iniciar();
				frm.setVisible(true);
			}
		});
		btnFacturas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFacturas.setBounds(10, 158, 152, 42);
		contentPane.add(btnFacturas);

		JButton btnCategorias = new JButton("Categorias");
		btnCategorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCategorias.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCategorias.setBounds(10, 225, 152, 42);
		contentPane.add(btnCategorias);

		JButton btnProveedores = new JButton("Proveedores");
		btnProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Proveedor pro = new Proveedor();
				ConsultasProveedor cp = new ConsultasProveedor();
				ProveedorVista frm = new ProveedorVista();

				ControladorProveedor ctrl = new ControladorProveedor(pro, cp, frm);
				ctrl.iniciar();
				frm.setVisible(true);
				// this.setVisible(false);
			}
		});
		btnProveedores.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnProveedores.setBounds(223, 225, 152, 42);
		contentPane.add(btnProveedores);

		JButton btnProductos = new JButton("Productos");
		btnProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Producto pro = new Producto();
				Proveedor proveedor = new Proveedor();
				ConsultasProducto cp = new ConsultasProducto();
				ProductoVista frm = new ProductoVista();

				ControladorProducto ctrl = new ControladorProducto(pro, cp, frm);
				ControladorProductoProveedor ctr = new ControladorProductoProveedor(proveedor, cp, frm);
				ctrl.iniciar();
				frm.setVisible(true);
			}
		});
		btnProductos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnProductos.setBounds(223, 158, 152, 42);
		contentPane.add(btnProductos);

		JButton btnSalidas = new JButton("Salidas");
		btnSalidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Salida salida = new Salida();
				// ConsultaSalida cs = new ConsultaSalida();
				Salida frm = new Salida();

				// ControladorSalida ctrl = new ControladorSalida(salida, cs, frm);
				// ctrl.iniciar();
				frm.setVisible(true);
			}
		});
		btnSalidas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSalidas.setBounds(431, 158, 152, 42);
		contentPane.add(btnSalidas);

		JButton btnEntradas = new JButton("Entradas");
		btnEntradas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Entrada entrada = new Entrada();
				// ConsultasEntrada ce = new ConsultasEntrada();
				vistaEntrada frm = new vistaEntrada();

				// ControladorEntrada ctrl = new ControladorEntrada(entrada, ce, frm);
				// ctrl.iniciar();
				frm.setVisible(true);
			}
		});
		btnEntradas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEntradas.setBounds(431, 225, 152, 42);
		contentPane.add(btnEntradas);
	}

}
