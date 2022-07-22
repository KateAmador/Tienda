package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasProveedor;
import modelo.Proveedor;
import vistas.ProveedorVista;

public class ControladorProveedor implements ActionListener {

	private Proveedor modelo;
	private ConsultasProveedor modeloP;
	private ProveedorVista frm;

	public ControladorProveedor(Proveedor modelo, ConsultasProveedor modeloP, ProveedorVista vista) {

		this.modelo = modelo;
		this.modeloP = modeloP;
		this.frm = vista;

		this.frm.btnAgregar.addActionListener(this);
		this.frm.btnModificar.addActionListener(this);
		this.frm.btnEliminar.addActionListener(this);
		this.frm.btnBuscar.addActionListener(this);
		this.frm.btnLimpiar.addActionListener(this);

	}

	public void iniciar() {

		frm.setTitle("Proveedor");
		frm.setLocationRelativeTo(null);
		frm.txtProveedorId.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == frm.btnAgregar) {

			if (validarCamposVacios(true)) {
				mensajeCamposVacios();
			} else {
				modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));
				modelo.setEmpresa(frm.txtEmpresa.getText());
				modelo.setNombre(frm.txtNombre.getText());
				modelo.setApellido(frm.txtApellido.getText());
				modelo.setTelefono(frm.txtTelefono.getText());

				if (modeloP.registrar(modelo)) {
					JOptionPane.showMessageDialog(null, "Ingresado correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al guardar");
				}
			}
		}

		if (e.getSource() == frm.btnModificar) {

			if (validarCamposVacios(true)) {
				mensajeCamposVacios();
			} else {
				modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));
				modelo.setEmpresa(frm.txtEmpresa.getText());
				modelo.setNombre(frm.txtNombre.getText());
				modelo.setApellido(frm.txtApellido.getText());
				modelo.setTelefono(frm.txtTelefono.getText());

				if (modeloP.modificar(modelo)) {
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al modificar");
				}
			}
		}

		if (e.getSource() == frm.btnEliminar) {
			modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));

			if (modeloP.eliminar(modelo)) {
				JOptionPane.showMessageDialog(null, "Se elimino correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
			}
		}

		if (e.getSource() == frm.btnBuscar) {
			modelo.setProveedorId(Integer.parseInt(frm.txtProveedorId.getText()));

			if (modeloP.buscar(modelo)) {

				frm.txtProveedorId.setText(String.valueOf(modelo.getProveedorId()));
				frm.txtEmpresa.setText(String.valueOf(modelo.getEmpresa()));
				frm.txtNombre.setText(String.valueOf(modelo.getNombre()));
				frm.txtApellido.setText(String.valueOf(modelo.getApellido()));
				frm.txtTelefono.setText(String.valueOf(modelo.getTelefono()));

			} else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro");
			}
		}

		if (e.getSource() == frm.btnLimpiar) {
			limpiar();
		}
	}

	public void limpiar() {

		frm.txtProveedorId.setText(null);
		frm.txtEmpresa.setText(null);
		frm.txtNombre.setText(null);
		frm.txtApellido.setText(null);
		frm.txtTelefono.setText(null);
	}

	public boolean validarCamposVacios(boolean dato) {
		if (frm.txtProveedorId.getText().trim().isEmpty() || frm.txtEmpresa.getText().trim().isEmpty()
				|| frm.txtNombre.getText().trim().isEmpty() || frm.txtApellido.getText().trim().isEmpty()
				|| frm.txtTelefono.getText().trim().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void mensajeCamposVacios() {
		JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
	}

}
