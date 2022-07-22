package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.ClientesObjeto;
import Modelo.ConsultaClientes;
import Modelo.ConsultaSalida;
import Vista.ClientesVista;

public class ControladorClientes implements ActionListener {

	private ClientesObjeto Modelo;
	private ConsultaClientes ModeloC;
	private ClientesVista frm;

	public ControladorClientes(ClientesObjeto Modelo, ConsultaClientes ModeloC, ClientesVista frm) {

		this.Modelo = Modelo;
		this.ModeloC = ModeloC;
		this.frm = frm;

		this.frm.btnBuscarC.addActionListener(this);
		this.frm.btnGuardarC.addActionListener(this);
		this.frm.btnModificarC.addActionListener(this);
		this.frm.btnEliminarC.addActionListener(this);
		this.frm.btnLimpiarC.addActionListener(this);

	}

	public void iniciar() {

		frm.setTitle("Cliente");
		frm.setLocationRelativeTo(null);
		frm.txtID_Cliente.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == frm.btnGuardarC) {
			Modelo.setId_Cliente(Integer.parseInt(frm.txtID_Cliente.getText()));
			Modelo.setNombre(frm.txtNombre.getText());
			Modelo.setApellido(frm.txtApellido.getText());
			Modelo.setDocumento(frm.txtDocumento.getText());
			Modelo.setTelefono(frm.txtTelefono.getText());

			if (ModeloC.registrar(Modelo)) {
				JOptionPane.showMessageDialog(null, "Ingresado correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnModificarC) {
			Modelo.setId_Cliente(Integer.parseInt(frm.txtID_Cliente.getText()));
			Modelo.setNombre(frm.txtNombre.getText());
			Modelo.setApellido(frm.txtApellido.getText());
			Modelo.setDocumento(frm.txtDocumento.getText());
			Modelo.setTelefono(frm.txtTelefono.getText());
			// modelo.setCustomerID(frm.txt_customerID.getText());

			if (ModeloC.modificar(Modelo)) {
				JOptionPane.showMessageDialog(null, "Se modifico correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al modificar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnEliminarC) {
			Modelo.setId_Cliente(Integer.parseInt(frm.txtID_Cliente.getText()));

			if (ModeloC.eliminar(Modelo)) {
				JOptionPane.showMessageDialog(null, "Se elimino correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnBuscarC) {
			Modelo.setId_Cliente(Integer.parseInt(frm.txtID_Cliente.getText()));

			if (ModeloC.buscar(Modelo)) {

				frm.txtID_Cliente.setText(String.valueOf(Modelo.getId_Cliente()));
				frm.txtNombre.setText(String.valueOf(Modelo.getNombre()));
				frm.txtApellido.setText(String.valueOf(Modelo.getApellido()));
				frm.txtDocumento.setText(String.valueOf(Modelo.getDocumento()));
				frm.txtTelefono.setText(String.valueOf(Modelo.getTelefono()));

			} else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnLimpiarC) {
			limpiar();
		}
	}

	public void limpiar() {

		frm.txtID_Cliente.setText(null);
		frm.txtNombre.setText(null);
		frm.txtApellido.setText(null);
		frm.txtDocumento.setText(null);
		frm.txtTelefono.setText(null);
	}

}
