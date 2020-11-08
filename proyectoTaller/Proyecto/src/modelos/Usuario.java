package modelos;

import java.sql.Date;

public class Usuario {
	
	private int idUsuario;
	private String seudonimo;
	private String contrasena;
	private String clase;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private Date fechaAlta;
	
	public Usuario(int miIdUsuario, String miSeudonimo, String miContrasena, String miClase, String miNombre, String miApellidos, String miTelefono, String miDni, Date miFechaAlta) {
		idUsuario = miIdUsuario;
		seudonimo = miSeudonimo;
		contrasena = miContrasena;
		clase = miClase;
		nombre = miNombre;
		apellidos = miApellidos;
		telefono = miTelefono;
		dni = miDni;
		fechaAlta = miFechaAlta;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSeudonimo() {
		return seudonimo;
	}

	public void setSeudonimo(String seudonimo) {
		this.seudonimo = seudonimo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public Usuario() {}
	
}