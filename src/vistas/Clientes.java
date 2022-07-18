package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtID_Cliente;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDocumento;
	private JTextField txtTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
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
		txtID_Cliente.setBounds(156, 73, 143, 20);
		contentPane.add(txtID_Cliente);
		txtID_Cliente.setColumns(10);
		
		txtNombre = new JTextField();
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
		txtApellido.setColumns(10);
		txtApellido.setBounds(156, 156, 143, 20);
		contentPane.add(txtApellido);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDocumento.setBounds(50, 204, 89, 17);
		contentPane.add(lblDocumento);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(156, 204, 143, 20);
		contentPane.add(txtDocumento);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefono.setBounds(50, 246, 89, 17);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(156, 246, 143, 20);
		contentPane.add(txtTelefono);
		
		JButton btnGuardarC = new JButton("Guardar");
		btnGuardarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarC.setBounds(60, 310, 117, 43);
		contentPane.add(btnGuardarC);
		
		JButton btnModificarC = new JButton("Modificar");
		btnModificarC.setBounds(203, 310, 117, 43);
		contentPane.add(btnModificarC);
		
		JButton btnBuscarC = new JButton("Buscar");
		btnBuscarC.setBounds(372, 310, 117, 43);
		contentPane.add(btnBuscarC);
	}
}
