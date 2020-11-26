package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import conexion.Conexion;
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
	
	public boolean pruebaLogin(Usuario miUsuario) {
		//String miSeudo, String miContra
		
		Conexion miConexion = new Conexion();
		
		java.sql.PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = conectar();
		
		String sql = "SELECT seudonimo, contrasena FROM usuario WHERE seudonimo = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, miUsuario.getSeudonimo());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				if (miUsuario.getContrasena().equals(rs.getString(2))) {
					return true;
				}else {
					return false;
				}
			}
			
		
			return false;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		}
	
	public boolean pruebaLoginMecanico(Usuario miUsuario) {
		//String miSeudo, String miContra
		
		Conexion miConexion = new Conexion();
		
		java.sql.PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = conectar();
		
		String sql = "SELECT seudonimo, contrasena FROM mecanico WHERE seudonimo = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, miUsuario.getSeudonimo());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				if (miUsuario.getContrasena().equals(rs.getString(2))) {
					return true;
				}else {
					return false;
				}
			}
			
		
			return false;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		}
	
	public boolean pruebaLoginJefeMecanico(Usuario miUsuario) {
		//String miSeudo, String miContra
		
		Conexion miConexion = new Conexion();
		
		java.sql.PreparedStatement ps = null;
		ResultSet rs = null;
		Connection con = conectar();
		
		String sql = "SELECT seudonimo, contrasena FROM jefemecanico WHERE seudonimo = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, miUsuario.getSeudonimo());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				if (miUsuario.getContrasena().equals(rs.getString(2))) {
					return true;
				}else {
					return false;
				}
			}
			
		
			return false;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
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
