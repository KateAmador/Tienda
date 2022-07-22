package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.Conexion;
import util.Conexion;

public class ConsultasEntrada extends Conexion{

	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;

	Conexion conexion = new Conexion();

	public ConsultasEntrada() {

	}

	public boolean registrar(entrada entrada) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"INSERT INTO entradas(id_entrada, id_producto_entrada, cantidad_entrada, factura_entrada, fecha_entrada,ValorCompra_entrada) VALUES (?, ?, ?, ?, ?, ?)");

			stm.setInt(1, entrada.getId_Entrada());
			stm.setInt(2, entrada.getId_entrada_producto());
			stm.setInt(3, entrada.getCantidad_Entrada());
			stm.setString(4, entrada.getFactura_entrada());
			stm.setInt(5, entrada.getFecha_entrada());
			stm.setInt(6, entrada.getValorcompra_entrada());

			stm.executeUpdate();

			return true;

		} catch (Exception e) {
			System.err.println(e);
			return false;
		} finally {
			try {
				cn.close();
				// stm.close();
				// rs.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}

	}

	public boolean modificar(entrada entrada) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"UPDATE proveedores SET id_entrada=?, id_producto_entrada=?, cantidad_entrada=?, factura_entrada=?, fecha_entrada=?, ValorCompra_entrada=? WHERE id_entrada=?");

			stm.setInt(1, entrada.getId_Entrada());
			stm.setInt(2, entrada.getId_entrada_producto());
			stm.setInt(3, entrada.getCantidad_Entrada());
			stm.setString(4, entrada.getFactura_entrada());
			stm.setInt(5, entrada.getFecha_entrada());
			stm.setInt(6, entrada.getValorcompra_entrada());
			stm.setInt(7, entrada.getId_Entrada());
			stm.executeUpdate();

			return true;

		} catch (Exception e) {
			System.err.println(e);
			return false;
		} finally {
			try {
				cn.close();
				// stm.close();
				// rs.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

	public boolean eliminar(entrada entrada) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement("DELETE FROM entradas WHERE id_entrada = ?");

			stm.setInt(1, entrada.getId_Entrada());
			stm.executeUpdate();

			return true;

		} catch (Exception e) {
			System.err.println(e);
			return false;
		} finally {
			try {
				cn.close();
				// stm.close();
				// rs.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

	public boolean buscar(entrada entrada) {
		PreparedStatement stm = null;
		ResultSet rs = null;
		Connection cn = conectar();

		String sql = "SELECT * FROM entradas WHERE id_entrada = ?";

		try {
			stm = cn.prepareStatement(sql);
			stm.setInt(1, entrada.getId_Entrada());
			rs = stm.executeQuery();

			if (rs.next()) {
				entrada.setId_Entrada(rs.getInt("id_entrada"));
				entrada.setId_entrada_producto(rs.getInt("id_entrada_producto"));
				entrada.setCantidad_Entrada(rs.getInt("Cantidad_Entrada"));
				entrada.setFactura_entrada(rs.getString("factura_entrada"));
				entrada.setFecha_entrada(rs.getInt("fecha_entrada"));
				entrada.setValorcompra_entrada(rs.getInt("Valorcompra_entrada"));
				
				return true;
			}

			return false;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		} finally {
			try {
				cn.close();
				stm.close();
				rs.close();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

}
