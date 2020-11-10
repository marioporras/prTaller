package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Cliente;

public class ClienteDAO extends AbstractDAO {
	
	Statement stm;
	ResultSet rs;
	Cliente miCliente;
		
	public ClienteDAO() {
		super();
		stm = null;
		rs = null;
		miCliente = new Cliente();
	}
	
	public boolean anadirCliente(Cliente miCliente) {
		PreparedStatement pr;
		//Cliente miCLiente = new Cliente();
		try {
			pr = super.cn.prepareStatement("insert into cliente" + "(nombre,apellidos,telefono,dni,fechaAlta) values(?,?,?,?,?);");
			pr.setString(1, miCliente.getNombre());
			pr.setString(2, miCliente.getApellidos());
			pr.setString(3, miCliente.getTelefono());
			pr.setString(4, miCliente.getDni());
			pr.setString(5, miCliente.getFechaAlta());
			pr.executeUpdate();
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//Por alguna razon a la hora de ingresar preparedStmt.setDate sale error con los valores por ello lo retiro de editar y encontrar cliente.
	public boolean encontrarCliente(String miDni) {
		ArrayList<Cliente> miClientes = null;
		Cliente miCliente;
		PreparedStatement pr;
		try {
			String query = "select * from cliente where dni like ?;";
			pr = super.cn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			//pr.setString(1, "%" + miNombre + "%" );
			//pr.setString(2, "%" + miApellido + "%");
			//pr.setString(3, "%" + miTelefono + "%" );
			pr.setString(4, "%" + miDni + "%" );
			miClientes = new ArrayList<Cliente>();
			rs = pr.executeQuery();
			while(rs.next()) {
				miCliente = new Cliente();
				miCliente.setIdCliente(rs.getInt(1));
				miCliente.setNombre(rs.getString(2));
				miCliente.setApellidos(rs.getString(3));
				miCliente.setTelefono(rs.getString(4));
				miCliente.setDni(rs.getString(5));
				miClientes.add(miCliente);			
			}		return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	//Por alguna razon a la hora de ingresar preparedStmt.setDate sale error con los valores por ello lo retiro de editar y encontrar cliente.
	public Cliente editarCliente(String miNombre, String miApellido, String miTelefono, String miDni, Cliente miCliente) {
		PreparedStatement pr;
		try {
			pr = super.cn.prepareStatement("update cliente " + "set nombre = ?, apellidos = ?, telefono = ?, dni = ? where idCliente = ?;");
			pr.setString(1, miNombre);
			pr.setString(2, miApellido);
			pr.setString(3, miTelefono);
			pr.setString(4, miDni);
			pr.setInt(5, miCliente.getIdCliente());
			pr.executeUpdate();
			miCliente.setNombre(miNombre);
			miCliente.setApellidos(miApellido);
			miCliente.setTelefono(miTelefono);
			miCliente.setDni(miDni);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return miCliente;
	}

}