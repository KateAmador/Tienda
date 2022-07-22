package modelo;

public class SalidaObjeto {
	int ID_Salida;
	int ID_Producto;
	int ID_Factura;
	int cantidad;
	int Valorventa;
	public int getID_Salida() {
		return ID_Salida;
	}
	public void setID_Salida(int iD_Salida) {
		ID_Salida = iD_Salida;
	}
	public int getID_Producto() {
		return ID_Producto;
	}
	public void setID_Producto(int iD_Producto) {
		ID_Producto = iD_Producto;
	}
	public int getID_Factura() {
		return ID_Factura;
	}
	public void setID_Factura(int iD_Factura) {
		ID_Factura = iD_Factura;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getValorventa() {
		return Valorventa;
	}
	public void setValorventa(int valorventa) {
		Valorventa = valorventa;
	}
	
	

}
