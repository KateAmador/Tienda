package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
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
		setBounds(100, 100, 388, 531);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 202, 241));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(16, 64, 136));
		panel.setBounds(0, 0, 379, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura");
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setBounds(10, 11, 220, 60);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 44));
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 80, 379, 427);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		Borrar = new JButton("Borrar");
		Borrar.setBounds(252, 342, 89, 23);
		panel_2.add(Borrar);
		
		FacturaID = new JTextField();
		FacturaID.setBackground(Color.WHITE);
		FacturaID.setDropMode(DropMode.INSERT);
		FacturaID.setBorder(null);
		FacturaID.setBounds(99, 36, 206, 20);
		panel_2.add(FacturaID);
		FacturaID.setColumns(10);
		
		ClienteID = new JTextField();
		ClienteID.setBackground(Color.WHITE);
		ClienteID.setBorder(null);
		ClienteID.setColumns(10);
		ClienteID.setBounds(99, 92, 206, 20);
		panel_2.add(ClienteID);
		
		cantidad = new JTextField();
		cantidad.setBackground(Color.WHITE);
		cantidad.setBorder(null);
		cantidad.setColumns(10);
		cantidad.setBounds(99, 152, 206, 20);
		panel_2.add(cantidad);
		
		total = new JTextField();
		total.setBackground(Color.WHITE);
		total.setBorder(null);
		total.setColumns(10);
		total.setBounds(99, 215, 206, 20);
		panel_2.add(total);
		
		fecha = new JTextField();
		fecha.setBackground(Color.WHITE);
		fecha.setBorder(null);
		fecha.setColumns(10);
		fecha.setBounds(99, 282, 206, 20);
		panel_2.add(fecha);
		
		JLabel Factura_ID = new JLabel("Factura_ID");
		Factura_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Factura_ID.setBounds(10, 39, 79, 14);
		panel_2.add(Factura_ID);
		
		JLabel Cliente_ID = new JLabel("Cliente_fk");
		Cliente_ID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cliente_ID.setBounds(10, 95, 79, 14);
		panel_2.add(Cliente_ID);
		
		JLabel Cantidad = new JLabel("Cantidad");
		Cantidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Cantidad.setBounds(10, 155, 79, 14);
		panel_2.add(Cantidad);
		
		JLabel Total = new JLabel("Total");
		Total.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Total.setBounds(10, 218, 79, 14);
		panel_2.add(Total);
		
		JLabel Fecha = new JLabel("Fecha");
		Fecha.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 11));
		Fecha.setBounds(10, 285, 79, 14);
		panel_2.add(Fecha);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(99, 57, 206, 2);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(99, 114, 206, 2);
		panel_2.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(99, 175, 206, 2);
		panel_2.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(99, 238, 206, 2);
		panel_2.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(99, 303, 206, 2);
		panel_2.add(separator_4);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBorder(null);
		btnGuardar.setBounds(30, 342, 89, 23);
		panel_2.add(btnGuardar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBorder(null);
		btnBuscar.setBounds(148, 342, 89, 23);
		panel_2.add(btnBuscar);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Diego\\Downloads\\Vista\\Tienda\\estilos para jpane sup\\recorte1.PNG"));
		lblNewLabel_1.setBounds(0, 100, 698, 327);
		panel_2.add(lblNewLabel_1);
	}	
}
