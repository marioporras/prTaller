package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import modelos.Usuario;

public class UsuarioDAO extends AbstractDAO {
	
	Statement stm;
	ResultSet rs;
	Usuario miUsuario;
	
	public UsuarioDAO() {
		super();
		stm = null;
		rs = null;
	}
	
	public Usuario pruebaLogin(String miSeudo, String miContra) {
		try {
			stm = super.cn.createStatement();
			rs = stm.executeQuery("select * from usuario where usuario='" + miSeudo + "' and contrasena='" + miContra + "';");
			if(rs.next()) {
				miUsuario = new Usuario();
				this.setAtributos();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return miUsuario;
	}
	
	private void setAtributos() {
		try {
			miUsuario.setIdUsuario(rs.getInt(1));
			miUsuario.setSeudonimo(rs.getString(2));
			miUsuario.setContrasena(rs.getString(3));
			miUsuario.setClase(rs.getString(4));
			miUsuario.setNombre(rs.getString(5));
			miUsuario.setApellidos(rs.getString(6));
			miUsuario.setTelefono(rs.getString(7));
			miUsuario.setDni(rs.getString(8));
			miUsuario.setFechaAlta(rs.getDate(9));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		}
		

	}
