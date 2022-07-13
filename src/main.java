import controlador.ControladorProveedor;
import modelo.ConsultasProveedor;
import modelo.Proveedor;
import vistas.ProveedorVista;

public class main {

	public static void main(String[] args) {

		Proveedor pro = new Proveedor();
		ConsultasProveedor cp = new ConsultasProveedor();
		ProveedorVista frm = new ProveedorVista();

		ControladorProveedor ctrl = new ControladorProveedor(pro, cp, frm);
		ctrl.iniciar();
		frm.setVisible(true);

	}

}
