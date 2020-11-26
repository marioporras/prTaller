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
import com.mysql.jdbc.Statement;

import conexion.Conexion;
import dao.ClienteDAO;

public class VentaVehiculosVentana extends JFrame {
	
	private JTable table;
	private JTextField textMatricula;
	Usuario miUsuario;
	
	public VentaVehiculosVentana() {
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(196, 60, 589, 44);
		getContentPane().add(panel_4);
		
		JLabel lblVentas = new JLabel("VENTA");
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
		lblVentas.setBounds(87, 11, 438, 30);
		panel_4.add(lblVentas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(209, 178, 558, 244);
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
		table.setBounds(10, 85, 519, 129);
		panel_2.add(table);
		
		
		textMatricula = new JTextField();
		textMatricula.setBounds(206, 34, 75, 20);
		panel_2.add(textMatricula);
		textMatricula.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(141, 37, 46, 14);
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Conexion miConexion = new Conexion();
				Connection conexion = miConexion.conectar(); 
				String matriculaChula = textMatricula.getText();
				String sql = "SELECT matricula, marca, modelo, color, fechaAlta, marca, modelo, color FROM vehiculo WHERE matricula =+ '" + matriculaChula + "'";
				
				Statement st;
				
				DefaultTableModel model = new DefaultTableModel();
				
				model.addColumn("NOMBRE");
				model.addColumn("APELLIDOS");
				model.addColumn("TELEFONO");
				//model.addColumn("DNI");
				model.addColumn("FECHA ALTA");
				model.addColumn("MATRICULA");
				model.addColumn("MARCA");
				model.addColumn("MODELO");
				model.addColumn("COLOR");

				table.setModel(model);
				String dato[] = new String[8];
				
				try {
					st = (Statement) conexion.createStatement();
					ResultSet result = st.executeQuery(sql);
					
					while (result.next()) {
						dato[0] = result.getString(1);
						dato[1] = result.getString(2);
						dato[2] = result.getString(3);
						dato[2] = result.getString(4);
						dato[4] = result.getString(5);
						dato[5] = result.getString(6);
						dato[6] = result.getString(7);
						dato[7] = result.getString(8);
						//dato[8] = result.getString(9);
						model.addRow(dato);

					}

				}catch(SQLException ex) {
					ex.printStackTrace();
			}
		}
	
		});
	
		
		
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(306, 33, 103, 23);
		panel_2.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(196, 107, 589, 327);
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
		panel_1.setBounds(441, 11, 138, 50);
		panel_3.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu principal");
		btnNewButton.setBounds(0, 0, 138, 50);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			//Usuario miUsuario;
			public void actionPerformed(ActionEvent e) {
				VentaVentana menu = new VentaVentana(miUsuario); 
				menu.setVisible(true);
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVehiculosVentana.this.setVisible(false);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.ORANGE);
		panel_5.setBounds(235, 11, 140, 50);
		panel_3.add(panel_5);
		
		JButton btnNewButton_2 = new JButton("Editar vehiculo");
		btnNewButton_2.setBounds(0, 0, 140, 50);
		panel_5.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				VentaVehiculoFicha menu = new VentaVehiculoFicha(); 
				menu.setVisible(true);
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVehiculosVentana.this.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setForeground(Color.WHITE);
		setTitle("Benavente & Porras - Venta - Clientes");
	}
}