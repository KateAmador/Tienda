package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import modelo.ConsultasFactura;
import modelo.Factura;
import vistas.FacturaVista;

public class ctrFactura implements ActionListener {

	private Factura mod;
	private ConsultasFactura modC;
	private FacturaVista frm;


	public ctrFactura(Factura mod, ConsultasFactura modC, FacturaVista frm) {

		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		this.frm.btnGuardar.addActionListener(this);
		this.frm.btnBuscar.addActionListener(this);
		this.frm.Borrar.addActionListener(this);
	

	}

	public void iniciar() {
		frm.setTitle("Factura");
		frm.setLocationRelativeTo(null);
		frm.FacturaID.setVisible(true);
		//frm.ClienteID.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == frm.btnGuardar) {
			
			mod.setFactura_id(Integer.parseInt(frm.FacturaID.getText()));
			mod.setCliente_fk(Integer.parseInt(frm.ClienteID.getText()));
			mod.setCantidad(frm.cantidad.getText());
			mod.setTotal(frm.total.getText());
			mod.setFecha(frm.fecha.getText());
			
			if (modC.Guardar(mod)) {
				JOptionPane.showMessageDialog(null, "Registro Guardado");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error no se pudo guardar registros");

			}
		}
		if (e.getSource() == frm.btnBuscar) {
			mod.setFactura_id(Integer.parseInt(frm.FacturaID.getText()));
			mod.setCliente_fk(Integer.parseInt(frm.ClienteID.getText()));
			
			if (modC.Buscar(mod)) {
				
				frm.FacturaID.setText(String.valueOf(mod.getFactura_id()));
				frm.ClienteID.setText(String.valueOf(mod.getCliente_fk()));
				frm.cantidad.setText(mod.getCantidad());
				frm.total.setText(mod.getTotal());
				frm.fecha.setText(mod.getFecha());
				
				
				
			} else {
				JOptionPane.showMessageDialog(null, "Error no se Encontro el registro");

			}
		}
		if (e.getSource() == frm.Borrar) {
			mod.setFactura_id(Integer.parseInt(frm.FacturaID.getText()));
			
		
			if (modC.Borrar(mod)) {

				JOptionPane.showMessageDialog(null, "Registro Borrado");
				limpiar();
			} else {
				JOptionPane.showMessageDialog(null, "Error no se pudo Borrar registros");

			}
		}
			
	}
	public void limpiar() {
		frm.FacturaID.setText(null);
		frm.ClienteID.setText(null);
		frm.cantidad.setText(null);
		frm.fecha.setText(null);
		frm.total.setText(null);
	}

}
