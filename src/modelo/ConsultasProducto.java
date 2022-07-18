package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.Conexion;

public class ConsultasProducto extends Conexion {

	public ConsultasProducto() {

	}

	public boolean registrar(Producto producto) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"INSERT INTO productos(id_producto, cantidad_producto, marca_producto, valorventa_producto, valorcompra_producto) VALUES (?, ?, ?, ?, ?)");

			stm.setInt(1, producto.getProductoId());
			stm.setInt(4, producto.getCantidad());
			stm.setString(5, producto.getMarca());
			stm.setInt(6, producto.getValorVenta());
			stm.setInt(7, producto.getValorCompra());
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

	public boolean modificar(Producto producto) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"UPDATE productos SET id_producto=?, cantidad_producto=?, marca_producto=?, valorventa_producto=?, valorcompra_producto=?");

			stm.setInt(1, producto.getProductoId());
			stm.setInt(4, producto.getCantidad());
			stm.setString(5, producto.getMarca());
			stm.setInt(6, producto.getValorVenta());
			stm.setInt(7, producto.getValorCompra());
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

	public boolean eliminar(Producto producto) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement("DELETE FROM productos WHERE id_producto = ?");

			stm.setInt(1, producto.getProductoId());
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

	public boolean buscar(Producto producto) {
		PreparedStatement stm = null;
		ResultSet rs = null;
		Connection cn = conectar();

		String sql = "SELECT * FROM productos WHERE id_producto = ?";

		try {
			stm = cn.prepareStatement(sql);
			stm.setInt(1, producto.getProductoId());
			rs = stm.executeQuery();

			if (rs.next()) {

				producto.setProductoId(rs.getInt("id_producto"));
				producto.setCantidad(rs.getInt("cantidad_producto"));
				producto.setMarca(rs.getString("marca_producto"));
				producto.setValorVenta(rs.getInt("valorventa_producto"));
				producto.setValorCompra(rs.getInt("valorcompra_producto"));

				return true;
			}

			return false;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error" + e);
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
