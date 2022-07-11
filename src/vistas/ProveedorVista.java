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

public class ProveedorVista extends JFrame {

	private JPanel contentPane;
	private JTextField txtProveedorID;
	private JTextField txtEmpresa;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		txtProveedorID = new JTextField();
		txtProveedorID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtProveedorID.getText().trim().isEmpty()) {
					lblAviso.setVisible(true);
				} else {
					lblAviso.setVisible(false);
				}
			}
		});
		txtProveedorID.setBounds(20, 84, 86, 19);
		contentPane.add(txtProveedorID);
		txtProveedorID.setColumns(10);

		JLabel lblEmpresa = new JLabel("Empresa (*)");
		lblEmpresa.setBounds(20, 122, 86, 13);
		contentPane.add(lblEmpresa);

		txtEmpresa = new JTextField();
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
		lblNombre.setBounds(20, 170, 86, 13);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
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
		txtNombre.setBounds(20, 183, 177, 19);
		contentPane.add(txtNombre);

		JLabel lblApellido = new JLabel("Apellido (*)");
		lblApellido.setBounds(275, 122, 86, 13);
		contentPane.add(lblApellido);

		txtApellido = new JTextField();
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
		txtApellido.setBounds(275, 135, 177, 19);
		contentPane.add(txtApellido);

		JLabel lblTelefono = new JLabel("Telefono (*)");
		lblTelefono.setBounds(275, 170, 86, 13);
		contentPane.add(lblTelefono);

		txtTelefono = new JTextField();
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

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtProveedorID.getText().trim().isEmpty() || txtEmpresa.getText().trim().isEmpty()
						|| txtNombre.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty()
						|| txtTelefono.getText().trim().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Error",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnAgregar.setBounds(20, 236, 85, 21);
		contentPane.add(btnAgregar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(133, 236, 85, 21);
		contentPane.add(btnModificar);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(367, 236, 85, 21);
		contentPane.add(btnLimpiar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(252, 236, 85, 21);
		contentPane.add(btnEliminar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(112, 83, 85, 21);
		contentPane.add(btnBuscar);
	}

}
