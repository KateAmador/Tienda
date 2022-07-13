package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.Conexion;

public class ConsultasProveedor extends Conexion {

	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;

	Conexion conexion = new Conexion();

	public ConsultasProveedor() {

	}

	public boolean registrar(Proveedor proveedor) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"INSERT INTO proveedores(id_proveedor, empresa_proveedor, nombre_proveedor, apellido_proveedor, telefono_proveedor) VALUES (?, ?, ?, ?, ?)");

			stm.setInt(1, proveedor.getProveedorId());
			stm.setString(2, proveedor.getEmpresa());
			stm.setString(3, proveedor.getNombre());
			stm.setString(4, proveedor.getApellido());
			stm.setString(5, proveedor.getTelefono());

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

	public boolean modificar(Proveedor proveedor) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"UPDATE proveedores SET id_proveedor=?, empresa_proveedor=?, nombre_proveedor=?, apellido_proveedor=?, telefono_proveedor=? WHERE id_proveedor=?");

			stm.setInt(1, proveedor.getProveedorId());
			stm.setString(2, proveedor.getEmpresa());
			stm.setString(3, proveedor.getNombre());
			stm.setString(4, proveedor.getApellido());
			stm.setString(5, proveedor.getTelefono());
			stm.setInt(6, proveedor.getProveedorId());
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

	public boolean eliminar(Proveedor proveedor) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement("DELETE FROM proveedores WHERE id_proveedor = ?");

			stm.setInt(1, proveedor.getProveedorId());
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

	public boolean buscar(Proveedor proveedor) {
		PreparedStatement stm = null;
		ResultSet rs = null;
		Connection cn = conectar();

		String sql = "SELECT * FROM proveedores WHERE id_proveedor = ?";

		try {
			stm = cn.prepareStatement(sql);
			stm.setInt(1, proveedor.getProveedorId());
			rs = stm.executeQuery();

			if (rs.next()) {
				proveedor.setProveedorId(rs.getInt("id_proveedor"));
				proveedor.setEmpresa(rs.getString("empresa_proveedor"));
				proveedor.setNombre(rs.getString("nombre_proveedor"));
				proveedor.setApellido(rs.getString("apellido_proveedor"));
				proveedor.setTelefono(rs.getString("telefono_proveedor"));
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
