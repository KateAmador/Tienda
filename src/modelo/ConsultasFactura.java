package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.Conexion;

public class ConsultasFactura extends Conexion {

	public ConsultasFactura() {

	}

	public boolean Guardar(Factura ft) {

		Conexion cn = new Conexion();
		Connection n = cn.conectar();
		PreparedStatement ps = null;

		String sql = "INSERT INTO Factura (factura_id, fk_cliente, cantidad, total, fecha) VALUES (?,?,?,?,?)";

		try {
			ps = n.prepareStatement(sql);

			ps.setInt(1, ft.getFactura_id());
			ps.setInt(2, ft.getCliente_fk());
			ps.setString(3, ft.getCantidad());
			ps.setString(4, ft.getTotal());
			ps.setString(5, ft.getFecha());

			ps.execute();

			return true;
		} catch (Exception e) {
			System.out.println("Error en la exception por que " + e.getMessage());
			return false;

		} finally {

			try {
				n.close();
			} catch (Exception e2) {
				System.out.println("Error no se pudo cerrar la consulta" + e2);
			}
		}
	}

	public boolean Buscar(Factura ft) {

		Conexion cn = new Conexion();
		Connection n = cn.conectar();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM Factura WHERE factura_id = ?";

		try {
			ps = n.prepareStatement(sql);
			ps.setInt(1, ft.getFactura_id());

			rs = ps.executeQuery();

			if (rs.next()) {

				ft.setFactura_id(Integer.parseInt(rs.getString("Factura_id")));
				ft.setCantidad(rs.getString("Cantidad"));
				ft.setTotal(rs.getString("Total"));
				ft.setFecha(rs.getString("Fecha"));
				return true;
			}

			return false;
		} catch (Exception e) {
			System.out.println("Error en la exception de modelo " + e.getMessage());
			return false;
		} finally {
			try {
				n.close();
			} catch (Exception e2) {
				System.out.println("Error no se pudo cerrar la consulta" + e2.getMessage());
			}
		}

	}

	public boolean Borrar(Factura ft) {

		Conexion n = new Conexion();
		Connection cn = n.conectar();
		PreparedStatement ps = null;

		String sql = "DELETE FROM Factura WHERE factura_id=?";
		try {
			ps = cn.prepareStatement(sql);
			ps.setInt(1, ft.getFactura_id());
			ps.execute();

			return true;
		} catch (Exception e) {
			System.out.println("Error en la exception " + e);
			return false;
		} finally {
			try {
				cn.close();
			} catch (Exception e2) {
				System.out.println("Error en la exception 2 " + e2);

			}
		}
	}

	public boolean Actualizar(Factura ft) {
		Conexion con = new Conexion();
		Connection n = con.conectar();
		PreparedStatement ps = null;

		String sql = "UPDATE Factura SET  factura_id=?, FK_Cliente=?, cantidad=?, total=?, fecha=? WHERE factura_id = ?";

		try {
			ps = n.prepareStatement(sql);
			ps.setInt(1, ft.getFactura_id());
			ps.setInt(2, ft.getCliente_fk());
			ps.setString(3, ft.getCantidad());
			ps.setString(4, ft.getTotal());
			ps.setString(5, ft.getFecha());
			ps.setInt(6, ft.getFactura_id());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println("Error en la exception " + e);
			return false;
		} finally {
			try {
				n.close();
			} catch (Exception e2) {
				System.out.println("Error no se pudo cerrar" + e2);
			}
		}

	}

}
