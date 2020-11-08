package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Vehiculo;

public class VehiculoDAO extends AbstractDAO {
	
	Statement stm;
	ResultSet rs;
	Vehiculo miVehiculo;
	
	public VehiculoDAO() {
		super();
		stm = null;
		rs = null;
	}

	//Por alguna razon a la hora de ingresar preparedStmt.setDate sale error con los valores por ello lo retiro de editar y encontrar vehiculo.
	//miPrecio lo tengo que poner en String, porque en float no funciona...
	public ArrayList<Vehiculo> encontrarVehiculo(String miPrecio, String miMatricula, String miMarca, String miModelo, String miColor) {
		ArrayList<Vehiculo> miVehiculos = null;
		Vehiculo miVehiculo;
		PreparedStatement pr;
		try {
			String query = "select * from vehiculo where vehiculo.idConcesionario" + " and matricula like ? and marca like ? and modelo like ? and tipo like ? and color like ? and fechaAlta like ? and precio like ?;";
			pr = super.cn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			if(!miPrecio.equals("")) pr.setFloat(1, Float.valueOf(miPrecio));
			pr.setString(2, "%" + miMatricula + "%" );
			pr.setString(3, "%" + miMarca + "%");
			pr.setString(4, "%" + miModelo + "%" );
			pr.setString(5, "%" + miColor + "%" );
			rs = pr.executeQuery();
			miVehiculos = new ArrayList<Vehiculo>();
			while(rs.next()) {
				miVehiculo = new Vehiculo();
				miVehiculo.setPrecio(rs.getFloat(1));
				miVehiculo.setMatricula(rs.getString(2));
				miVehiculo.setMarca(rs.getString(3));
				miVehiculo.setModelo(rs.getString(4));
				miVehiculo.setColor(rs.getString(5));
				miVehiculo.add(miVehiculo);
			}	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return miVehiculos;
	}
	
	//Por alguna razon a la hora de ingresar preparedStmt.setDate sale error con los valores por ello lo retiro de editar y encontrar vehiculo.
	public void anadirVehiculo(float miPrecio, String miMatricula, String miMarca, String miModelo, String miColor) {
		PreparedStatement pr;
		try {
			pr = super.cn.prepareStatement("insert into vehiculo (precio, matricula, marca, modelo, color) values (?,?,?,?,?,?);");
			pr.setFloat(1, miPrecio);
			pr.setString(2, miMatricula);
			pr.setString(3, miMarca);
			pr.setString(4, miModelo);
			pr.setString(5, miColor);
			pr.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Vehiculo editarVehiculo(float miPrecio, String miMatricula, String miMarca, String miModelo, String miColor) {
		PreparedStatement pr;
		try {
			pr = super.cn.prepareStatement("update vehiculo " + "set precio = ?, matricula = ?, marca = ?, modelo = ?, color = ?;");
			pr.setFloat(1, miPrecio);
			pr.setString(2, miMatricula);
			pr.setString(3, miMarca);
			pr.setString(4, miModelo);
			pr.setString(5, miColor);
			pr.executeUpdate();
			miVehiculo.setPrecio(miPrecio);
			miVehiculo.setMatricula(miMatricula);
			miVehiculo.setMarca(miMarca);
			miVehiculo.setModelo(miModelo);
			miVehiculo.setColor(miColor);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return miVehiculo;
	}
	
}