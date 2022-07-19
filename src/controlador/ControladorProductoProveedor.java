package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasProducto;
import modelo.Producto;
import modelo.Proveedor;
import vistas.ProductoVista;

public class ControladorProductoProveedor implements ActionListener {

	private Proveedor modelo;
	private ConsultasProducto modeloP;
	private ProductoVista frm;

	public ControladorProductoProveedor(Proveedor modelo, ConsultasProducto modeloP, ProductoVista vista) {

		this.modelo = modelo;
		this.modeloP = modeloP;
		this.frm = vista;

		this.frm.btnBuscarProveedor.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == frm.btnBuscarProveedor) {
			modelo.setProveedorId(Integer.parseInt(frm.txtProveedor.getText()));

			if (modeloP.buscarProveedor(modelo)) {

				frm.txtProductoID.setText(String.valueOf(modelo.getProveedorId()));

			} else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro");
				// limpiar();
			}
		}

	}
}