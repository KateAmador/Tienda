package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultaSalida;
import modelo.SalidaObjeto;
import vistas.SalidaVista;

public class ControladorSalida implements ActionListener {

	private SalidaObjeto modelo;
	private ConsultaSalida modeloP;
	private SalidaVista frm;

	public ControladorSalida(SalidaObjeto modelo, ConsultaSalida modeloP, SalidaVista vista) {

		this.modelo = modelo;
		this.modeloP = modeloP;
		this.frm = vista;

		this.frm.btnGuardarS.addActionListener(this);
		this.frm.btnModificarS.addActionListener(this);
		this.frm.btnEliminarS.addActionListener(this);
		this.frm.btnBuscarS.addActionListener(this);
		this.frm.btnLimpiarS.addActionListener(this);

	}

	public void iniciar() {

		frm.setTitle("Proveedor");
		frm.setLocationRelativeTo(null);
		frm.txtIDSalida.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == frm.btnGuardarS) {

			if (validarCamposVacios(true)) {
				mensajeCamposVacios();
			} else {
				modelo.setID_Salida(Integer.parseInt(frm.txtIDSalida.getText()));
				modelo.setID_Producto(Integer.parseInt(frm.txtID_Producto.getText()));
				modelo.setID_Factura(Integer.parseInt(frm.txtID_Producto.getText()));
				modelo.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
				modelo.setValorventa(Integer.parseInt(frm.txtValorVenta.getText()));
				

				if (modeloP.registrar(modelo)) {
					JOptionPane.showMessageDialog(null, "Ingresado correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al guardar");
				}
			}
		}

		if (e.getSource() == frm.btnModificarS) {

			if (validarCamposVacios(true)) {
				mensajeCamposVacios();
			} else {
				modelo.setID_Salida(Integer.parseInt(frm.txtIDSalida.getText()));
				modelo.setID_Producto(Integer.parseInt(frm.txtID_Producto.getText()));
				modelo.setID_Factura(Integer.parseInt(frm.txt_IDFactura.getText()));
				modelo.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
				modelo.setValorventa(Integer.parseInt(frm.txtValorVenta.getText()));

				if (modeloP.modificar(modelo)) {
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al modificar");
				}
			}
		}

		if (e.getSource() == frm.btnEliminarS) {
			modelo.setID_Salida(Integer.parseInt(frm.txtIDSalida.getText()));

			if (modeloP.eliminar(modelo)) {
				JOptionPane.showMessageDialog(null, "Se elimino correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
			}
		}

		if (e.getSource() == frm.btnBuscarS) {
			modelo.setID_Salida(Integer.parseInt(frm.txtIDSalida.getText()));

			if (modeloP.buscar(modelo)) {

				frm.txtIDSalida.setText(String.valueOf(modelo.getID_Salida()));
				frm.txtID_Producto.setText(String.valueOf(modelo.getID_Producto()));
				frm.txt_IDFactura.setText(String.valueOf(modelo.getID_Factura()));
				frm.txtCantidad.setText(String.valueOf(modelo.getCantidad()));
				frm.txtValorVenta.setText(String.valueOf(modelo.getValorventa()));

			} else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro");
			}
		}

		if (e.getSource() == frm.btnLimpiarS) {
			limpiar();
		}
	}

	public void limpiar() {

		frm.txtIDSalida.setText(null);
		frm.txtID_Producto.setText(null);
		frm.txt_IDFactura.setText(null);
		frm.txtCantidad.setText(null);
		frm.txtValorVenta.setText(null);
	}

	public boolean validarCamposVacios(boolean dato) {
		if (frm.txtIDSalida.getText().trim().isEmpty() || frm.txtID_Producto.getText().trim().isEmpty()
				|| frm.txt_IDFactura.getText().trim().isEmpty() || frm.txtCantidad.getText().trim().isEmpty()
				|| frm.txtValorVenta.getText().trim().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void mensajeCamposVacios() {
		JOptionPane.showMessageDialog(null, "Llenar todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
	}

}