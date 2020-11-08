package modelos;

import java.sql.Date;

public class Vehiculo {
	
	private int idCliente;
	private int idUsuario;
	private int idConcesionario;
	private float precio;
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private Date fechaAlta;

	public Vehiculo(int miIdCliente, int miIdUsuario, int miIdConcesionario, float miPrecio, String miMatricula, String miMarca, String miModelo, String miColor, Date miFechaAlta) {
		idCliente = miIdCliente;
		idUsuario = miIdUsuario;
		idConcesionario = miIdConcesionario;
		precio = miPrecio;
		matricula = miMatricula;
		marca = miMarca;
		modelo = miModelo;
		color = miColor;
		fechaAlta = miFechaAlta;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdConcesionario() {
		return idConcesionario;
	}

	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public Vehiculo() {}

	public void add(Vehiculo miVehiculo) {}

}