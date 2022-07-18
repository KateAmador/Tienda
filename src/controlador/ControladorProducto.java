package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasProducto;
import modelo.Producto;
import vistas.ProductoVista;

public class ControladorProducto implements ActionListener {

	private Producto modelo;
	private ConsultasProducto modeloP;
	private ProductoVista frm;

	public ControladorProducto(Producto modelo, ConsultasProducto modeloP, ProductoVista vista) {


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

		frm.setTitle("Producto");
		frm.setLocationRelativeTo(null);
		frm.txtProductoID.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == frm.btnAgregar) {
			modelo.setProductoId(Integer.parseInt(frm.txtProductoID.getText()));
			modelo.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
			modelo.setMarca(frm.txtMarca.getText());
			modelo.setValorVenta(Integer.parseInt(frm.txtValorVenta.getText()));
			modelo.setValorCompra(Integer.parseInt(frm.txtValorCompra.getText()));

			if (modeloP.registrar(modelo)) {
				JOptionPane.showMessageDialog(null, "Ingresado correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al guardar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnModificar) {
			modelo.setProductoId(Integer.parseInt(frm.txtProductoID.getText()));
			modelo.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
			modelo.setMarca(frm.txtMarca.getText());
			modelo.setValorVenta(Integer.parseInt(frm.txtValorVenta.getText()));
			modelo.setValorCompra(Integer.parseInt(frm.txtValorCompra.getText()));
			// modelo.setCustomerID(frm.txt_customerID.getText());

			if (modeloP.modificar(modelo)) {
				JOptionPane.showMessageDialog(null, "Se modifico correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al modificar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnEliminar) {
			modelo.setProductoId(Integer.parseInt(frm.txtProductoID.getText()));

			if (modeloP.eliminar(modelo)) {
				JOptionPane.showMessageDialog(null, "Se elimino correctamente");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error al eliminar");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnBuscar) {
			modelo.setProductoId(Integer.parseInt(frm.txtProductoID.getText()));

			if (modeloP.buscar(modelo)) {

				frm.txtProductoID.setText(String.valueOf(modelo.getProductoId()));
				frm.txtCantidad.setText(String.valueOf(modelo.getCantidad()));
				frm.txtMarca.setText(String.valueOf(modelo.getMarca()));
				frm.txtValorVenta.setText(String.valueOf(modelo.getValorVenta()));
				frm.txtValorCompra.setText(String.valueOf(modelo.getValorCompra()));

			} else {
				JOptionPane.showMessageDialog(null, "No se encontro el registro");
				limpiar();
			}
		}

		if (e.getSource() == frm.btnLimpiar) {
			limpiar();
		}
	}

	public void limpiar() {

		frm.txtProductoID.setText(null);
		frm.txtCantidad.setText(null);
		frm.txtMarca.setText(null);
		frm.txtValorVenta.setText(null);
		frm.txtValorCompra.setText(null);
	}

}
