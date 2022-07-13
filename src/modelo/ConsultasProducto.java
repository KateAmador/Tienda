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
					"INSERT INTO productos(id, Company_Name, Contact_Name, Contact_Title, Address, City, Region, Postal_Code, Country, Phone, Fax) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

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

	public boolean modificar(Producto cus) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement(
					"UPDATE customers SET Customer_ID=?, Company_Name=?, Contact_Name=?, Contact_Title=?, Address=?, City=?, Region=?, Postal_Code=?, Country=?, Phone=?, Fax=? WHERE Customer_ID=?");

			/*stm.setString(1, cus.getCustomerID());
			stm.setString(2, cus.getCompanyName());
			stm.setString(3, cus.getContactName());
			stm.setString(4, cus.getContactTitle());
			stm.setString(5, cus.getAddress());
			stm.setString(6, cus.getCity());
			stm.setString(7, cus.getRegion());
			stm.setString(8, cus.getPostalCode());
			stm.setString(9, cus.getCountry());
			stm.setString(10, cus.getPhone());
			stm.setString(11, cus.getFax());
			// stm.setString(12, cus.getId());
			stm.executeUpdate();*/

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

	public boolean eliminar(Producto cus) {
		Connection cn = conectar();

		try {
			PreparedStatement stm = cn.prepareStatement("DELETE FROM customers WHERE Customer_ID = ?");

			stm.setInt(1, cus.getProductoId());
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

	public boolean buscar(Producto cus) {
		PreparedStatement stm = null;
		ResultSet rs = null;
		Connection cn = conectar();

		String sql = "SELECT * FROM customers WHERE customer_id = ?";

		try {
			stm = cn.prepareStatement(sql);
			stm.setInt(1, cus.getProductoId());
			rs = stm.executeQuery();

			if (rs.next()) {
				/*cus.setCustomerID(rs.getString("customerID"));
				cus.setCompanyName(rs.getString("companyName"));
				cus.setContactName(rs.getString("contactName"));
				cus.setContactTitle(rs.getString("contactTitle"));
				cus.setAddress(rs.getString("address"));
				cus.setCity(rs.getString("city"));
				cus.setRegion(rs.getString("region"));
				cus.setPostalCode(rs.getString("postalCode"));
				cus.setCountry(rs.getString("country"));
				cus.setPhone(rs.getString("phone"));
				cus.setFax(rs.getString("fax"));*/
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
