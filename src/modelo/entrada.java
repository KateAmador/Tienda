package modelo;

public class entrada {

	private int Id_Entrada, Id_entrada_producto, cantidad_Entrada,valorcompra_entrada,fecha_entrada;
	private String factura_entrada;
	public int getId_Entrada() {
		return Id_Entrada;
	}
	public void setId_Entrada(int id_Entrada) {
		Id_Entrada = id_Entrada;
	}
	public int getId_entrada_producto() {
		return Id_entrada_producto;
	}
	public void setId_entrada_producto(int id_entrada_producto) {
		Id_entrada_producto = id_entrada_producto;
	}
	public int getCantidad_Entrada() {
		return cantidad_Entrada;
	}
	public void setCantidad_Entrada(int cantidad_Entrada) {
		this.cantidad_Entrada = cantidad_Entrada;
	}
	public int getValorcompra_entrada() {
		return valorcompra_entrada;
	}
	public void setValorcompra_entrada(int valorcompra_entrada) {
		this.valorcompra_entrada = valorcompra_entrada;
	}
	public int getFecha_entrada() {
		return fecha_entrada;
	}
	public void setFecha_entrada(int fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}
	public String getFactura_entrada() {
		return factura_entrada;
	}
	public void setFactura_entrada(String factura_entrada) {
		this.factura_entrada = factura_entrada;
	}
	

	
}

