package modelo;

public class Factura {
	
	private int factura_id;
	private int cliente_fk;
	private String Cantidad;
	private String total;
	private String fecha;
	
	
	public Factura() {
		
	}


	public int getFactura_id() {
		return factura_id;
	}


	public void setFactura_id(int factura_id) {
		this.factura_id = factura_id;
	}


	public int getCliente_fk() {
		return cliente_fk;
	}


	public void setCliente_fk(int cliente_fk) {
		this.cliente_fk = cliente_fk;
	}


	public String getCantidad() {
		return Cantidad;
	}


	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}


	public String getTotal() {
		return total;
	}


	public void setTotal(String total) {
		this.total = total;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}
