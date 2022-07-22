package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.Conexion;

public class ConsultaSalida extends Conexion {

	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;

	Conexion conexion = new Conexion();

	public ConsultaSalida() {

	}

	public boolean registrar(SalidaObjeto salida) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"INSERT INTO salidas(id_salida, idproducto_salida, idfactura_salida, cantidad_salida, valorventa_salida) VALUES (?, ?, ?, ?, ?)");

			stm.setInt(1, salida.getID_Salida());
			stm.setInt(2, salida.getID_Producto());
			stm.setInt(3, salida.getID_Factura());
			stm.setInt(4, salida.getCantidad());
			stm.setInt(5, salida.getValorventa());

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

	public boolean modificar(SalidaObjeto salida) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"UPDATE salidas SET id_salida=?, idproducto_salida=?, idfactura_salida=?, cantidad_salida=?, valorventa_salida=? WHERE id_proveedor=?");

			stm.setInt(1, salida.getID_Salida());
			stm.setInt(2, salida.getID_Producto());
			stm.setInt(3, salida.getID_Factura());
			stm.setInt(4, salida.getCantidad());
			stm.setInt(5, salida.getValorventa());

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

	public boolean eliminar(SalidaObjeto salida) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement("DELETE FROM proveedores WHERE id_salida = ?");

			stm.setInt(1, salida.getID_Salida());
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

	public boolean buscar(SalidaObjeto salida) {
		PreparedStatement stm = null;
		ResultSet rs = null;
		Connection cn = conectar();

		String sql = "SELECT * FROM salidas WHERE id_salida = ?";

		try {
			stm = cn.prepareStatement(sql);
			stm.setInt(1, salida.getID_Salida());
			rs = stm.executeQuery();

			if (rs.next()) {
				salida.setID_Salida(rs.getInt("id_salida"));
				salida.setID_Producto(rs.getInt("idproducto_salida"));
				salida.setID_Factura(rs.getInt("idfactura_salida"));
				salida.setCantidad(rs.getInt("cantidad_salida"));
				salida.setValorventa(rs.getInt("valorventa_salida"));
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