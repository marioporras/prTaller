package modelos;

import java.sql.Date;

public class Cliente {
	
	private int idCliente;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private Date fechaAlta;
		
	public Cliente(int miIdCliente, String miNombre, String miApellidos, String miTelefono, String miDni, Date miFechaAlta) {
		idCliente = miIdCliente;
		nombre = miNombre;
		apellidos = miApellidos;
		telefono = miTelefono;
		dni = miDni;
		fechaAlta = miFechaAlta;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public Cliente() {}

}