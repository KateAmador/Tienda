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
		setBounds(100, 100, 537, 480);

		

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlLtHighlight);
		panel_2.setBounds(0, 0, 521, 441);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		Borrar = new JButton("Borrar");
		Borrar.setBackground(Color.WHITE);
		Borrar.setBounds(358, 399, 89, 23);
		panel_2.add(Borrar);
		
		JLabel Factura_ID = new JLabel("Factura_ID");
		Factura_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Factura_ID.setBounds(61, 112, 79, 14);
		panel_2.add(Factura_ID);
		
		JLabel Cliente_ID = new JLabel("Cliente_fk");
		Cliente_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cliente_ID.setBounds(61, 168, 79, 14);
		panel_2.add(Cliente_ID);
		
		JLabel Cantidad = new JLabel("Cantidad");
		Cantidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cantidad.setBounds(61, 228, 79, 14);
		panel_2.add(Cantidad);
		
		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Total.setBounds(61, 291, 79, 14);
		panel_2.add(Total);
		
		JLabel Fecha = new JLabel("Fecha");
		Fecha.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Fecha.setBounds(61, 358, 79, 14);
		panel_2.add(Fecha);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(61, 399, 89, 23);
		panel_2.add(btnGuardar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(259, 399, 89, 23);
		panel_2.add(btnBuscar);
		
		Actualizar = new JButton("Actualizar");
		Actualizar.setBackground(Color.WHITE);
		Actualizar.setBounds(160, 399, 89, 23);
		panel_2.add(Actualizar);
		
		FacturaID = new JTextField();
		FacturaID.setBackground(Color.WHITE);
		FacturaID.setDropMode(DropMode.INSERT);
		FacturaID.setBounds(150, 109, 206, 20);
		panel_2.add(FacturaID);
		FacturaID.setColumns(10);

		ClienteID = new JTextField();
		ClienteID.setBackground(Color.WHITE);
		ClienteID.setColumns(10);
		ClienteID.setBounds(150, 165, 206, 20);
		panel_2.add(ClienteID);
		
		total = new JTextField();
		total.setBackground(Color.WHITE);
		total.setColumns(10);
		total.setBounds(150, 288, 206, 20);
		panel_2.add(total);
		
		fecha = new JTextField();
		fecha.setBackground(Color.WHITE);
		fecha.setColumns(10);
		fecha.setBounds(150, 355, 206, 20);
		panel_2.add(fecha);
		
		cantidad = new JTextField();
		cantidad.setBackground(Color.WHITE);
		cantidad.setColumns(10);
		cantidad.setBounds(150, 225, 206, 20);
		panel_2.add(cantidad);
		
		JLabel Factura = new JLabel("Factura");
		Factura.setFont(new Font("Tahoma", Font.PLAIN, 37));
		Factura.setBounds(10, 25, 188, 33);
		panel_2.add(Factura);
		
		
	}	
	
	}
