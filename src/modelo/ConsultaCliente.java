package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.Conexion;

public class ConsultaCliente extends Conexion {

	Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;

	Conexion conexion = new Conexion();

	public ConsultaCliente() {

	}

	public boolean registrar(ClienteObjeto cliente) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"INSERT INTO clientes(id_cliente, nombre, apellido, documento, telefono) VALUES (?, ?, ?, ?, ?)");

			stm.setInt(1, cliente.getId_Cliente());
			stm.setString(2, cliente.getNombre());
			stm.setString(3, cliente.getApellido());
			stm.setString(4, cliente.getDocumento());
			stm.setString(5, cliente.getTelefono());

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

	public boolean modificar(ClienteObjeto cliente) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"UPDATE clientes SET id_cliente=?, nombre=?, apellido=?, documento=?, telefono=? WHERE id_proveedor=?");

			stm.setInt(1, cliente.getId_Cliente());
			stm.setString(2, cliente.getNombre());
			stm.setString(3, cliente.getApellido());
			stm.setString(4, cliente.getDocumento());
			stm.setString(5, cliente.getTelefono());

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

	public boolean eliminar(ClienteObjeto cliente) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement("DELETE FROM proveedores WHERE id_cliente = ?");

			stm.setInt(1, cliente.getId_Cliente());
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

	public boolean buscar(ClienteObjeto cliente) {
		PreparedStatement stm = null;
		ResultSet rs = null;
		Connection cn = conectar();

		String sql = "SELECT * FROM clientes WHERE id_cliente = ?";

		try {
			stm = cn.prepareStatement(sql);
			stm.setInt(1, cliente.getId_Cliente());
			rs = stm.executeQuery();

			if (rs.next()) {
				cliente.setId_Cliente(rs.getInt("id_cliente"));
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setDocumento(rs.getString("documento"));
				cliente.setTelefono(rs.getString("telefono"));
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
