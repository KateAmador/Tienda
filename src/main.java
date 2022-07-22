
import controlador.ControladorProveedor;
import controlador.ctrFactura;
import modelo.ConsultasFactura;
import modelo.ConsultasProveedor;
import modelo.Factura;
import modelo.Proveedor;
import vistas.FacturaVista;
import vistas.ProveedorVista;

public class main {

	public static void main(String[] args) {

		Proveedor pro = new Proveedor();
		Factura mod = new Factura();
		ConsultasProveedor cp = new ConsultasProveedor();
		ConsultasFactura modC = new ConsultasFactura();
		ProveedorVista frm = new ProveedorVista();
		FacturaVista ft = new FacturaVista();

		ControladorProveedor ctrl = new ControladorProveedor(pro, cp, frm);
		ctrFactura ctr = new ctrFactura(mod, modC, ft);
		// ctr.iniciar();
		ctrl.iniciar();
		// frm.setVisible(true);
		ft.setVisible(true);

	}

}
