package ventana;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import modelos.Usuario;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSetMetaData;

import conexion.Conexion;
import dao.ClienteDAO;

public class VentaVehiculosVentana extends JFrame {
	
	private JTable table;
	private JTextField textField;
	
	public VentaVehiculosVentana() {
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(196, 60, 458, 44);
		getContentPane().add(panel_4);
		
		JLabel lblVentas = new JLabel("VENTA");
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
		lblVentas.setBounds(10, 8, 438, 30);
		panel_4.add(lblVentas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(209, 178, 433, 244);
		getContentPane().add(panel_2);
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nombre", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setFont(new Font("Arial", Font.PLAIN, 11));
		table.setBounds(10, 103, 412, 129);
		panel_2.add(table);
		
		
		textField = new JTextField();
		textField.setBounds(136, 52, 75, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(165, 37, 46, 14);
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String dni1 = JTextField.getText();
				String where = "";
				if (!"".contentEquals(dni1)) {
					where = "WHERE dni = '" + dni1 + "'";
				}
				try {
					DefaultTableModel modelo = new DefaultTableModel();
					jtNombre.setModel(modelo);
					
					ejemplo.setModel(table);
					Conexion miConexion = new Conexion();
					
					java.sql.PreparedStatement ps = null;
					ResultSet rs = null;
					Conexion conn = new Conexion();
					Connection con = conn.conectar();
					
					String sql = "SELECT nombre, apellidos, telefono, dni, fechaAlta FROM cliente + where";
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					
					ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
					int cantidadColumnas = rsMd.getColumnCount();
					
					while(rs.next()) {
						Object[] filas = new Object[cantidadColumnas];
						
						for (int i = 0; i<cantidadColumnas; i++) {
							filas[i] = rs.getObject(i + 1);
						}
						
						//table.addRow(filas);
					}	
					}catch (SQLException ex) {
						System.err.println(ex.toString());
					}
					
				}
			});
		
		
		
		
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(221, 51, 103, 23);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(196, 107, 458, 327);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 140, 50);
		panel_3.add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setLayout(null);
		
		JLabel lblCliente = new JLabel("Vehiculo");
		lblCliente.setBounds(10, 11, 120, 30);
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Arial", Font.BOLD, 22));
		panel.add(lblCliente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(310, 11, 138, 50);
		panel_3.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu principal");
		btnNewButton.addActionListener(new ActionListener() {
			Usuario miUsuario;
			public void actionPerformed(ActionEvent e) {
				VentaVentana menu = new VentaVentana(miUsuario); 
				menu.setVisible(true);
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVehiculosVentana.this.setVisible(false);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(0, 0, 138, 50);
		panel_1.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.ORANGE);
		panel_5.setBounds(160, 11, 140, 50);
		panel_3.add(panel_5);
		
		JLabel lblClientes = new JLabel("Vehiculo");
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setFont(new Font("Arial", Font.BOLD, 22));
		lblClientes.setBounds(10, 11, 120, 30);
		panel_5.add(lblClientes);
		setTitle("Benavente & Porras - Venta - Clientes");
	}
}