package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasEntrada;
import modelo.entrada;
import vistas.vistaEntrada;

public class controladorEntrada implements ActionListener{
		
		private entrada modelo;
		private ConsultasEntrada modC;
		private vistaEntrada frm;
		
		
		public controladorEntrada (entrada modelo, ConsultasEntrada modC, vistaEntrada vista) {
		
			this.modelo = modelo;
			this.modC = modC;
			this.frm = vista;
			
			this.frm.btnIngresar.addActionListener(this);
			this.frm.btnActualizar.addActionListener(this);
			this.frm.btnBorrar.addActionListener(this);
			this.frm.btnBuscar.addActionListener(this);
			
		}
		
		
		public void iniciar() {
			
			frm.setTitle("Entradas");
			frm.setLocationRelativeTo(null);
frm.txtEntradaID.setVisible(true);
			
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == frm.btnIngresar) {
				
				modelo.setId_Entrada(Integer.parseInt(frm.txtEntradaID.getText()));
				modelo.setId_entrada_producto(Integer.parseInt(frm.txtIdDelProducto.getText()));
				modelo.setCantidad_Entrada(Integer.parseInt(frm.txtCantidad.getText()));
				modelo.setValorcompra_entrada(Integer.parseInt(frm.txtValorDeLaCompra.getText()));
				modelo.setFactura_entrada(frm.txtFactura.getText());
				modelo.setFecha_entrada(Integer.parseInt(frm.txtFecha.getText()));
				
				
				if(modC.registrar(modelo)) {
					
					JOptionPane.showMessageDialog(frm, "Registro guardado");
					limpiar();
				}
				else {
					JOptionPane.showMessageDialog(frm, "error al guardar");
				limpiar();
				}
				
				
			}
			if (e.getSource() == frm.btnActualizar) {
				modelo.setId_Entrada(Integer.parseInt(frm.txtEntradaID.getText()));
				modelo.setId_entrada_producto(Integer.parseInt(frm.txtIdDelProducto.getText()));
				modelo.setCantidad_Entrada(Integer.parseInt(frm.txtCantidad.getText()));
				modelo.setValorcompra_entrada(Integer.parseInt(frm.txtValorDeLaCompra.getText()));
				modelo.setFactura_entrada(frm.txtFactura.getText());
				modelo.setFecha_entrada(Integer.parseInt(frm.txtFecha.getText()));
				

				if (modC.modificar(modelo)) {
					JOptionPane.showMessageDialog(null, "Se modifico correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al modificar");
					limpiar();
				}
			}

			if (e.getSource() == frm.btnBorrar) {
				modelo.setId_Entrada(Integer.parseInt(frm.txtEntradaID.getText()));

				if (modC.eliminar(modelo)) {
					JOptionPane.showMessageDialog(null, "Se elimino correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error al eliminar");
					limpiar();
				}
			}

			if (e.getSource() == frm.btnBuscar) {
				modelo.setId_Entrada(Integer.parseInt(frm.txtEntradaID.getText()));;

				if (modC.buscar(modelo)) {

					
					frm.txtEntradaID.setText(String.valueOf(modelo.getId_Entrada()));
					frm.txtIdDelProducto.setText(String.valueOf(modelo.getId_entrada_producto()));
					frm.txtCantidad.setText(String.valueOf(modelo.getCantidad_Entrada()));
					frm.txtFactura.setText(String.valueOf(modelo.getFactura_entrada()));
					frm.txtFecha.setText(String.valueOf(modelo.getFecha_entrada()));
					frm.txtValorDeLaCompra.setText(String.valueOf(modelo.getValorcompra_entrada()));

				} else {
					JOptionPane.showMessageDialog(null, "No se encontro el registro");
					limpiar();
				}
			}

		}
		
		public void limpiar() {
			frm.txtEntradaID.setText(null);
			frm.txtIdDelProducto.setText(null);
			frm.txtCantidad.setText(null);
			frm.txtValorDeLaCompra.setText(null);
			frm.txtFactura.setText(null);
			frm.txtFecha.setText(null);
		}
}
