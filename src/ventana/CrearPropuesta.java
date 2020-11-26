package ventana;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.mysql.jdbc.Statement;

import conexion.Conexion;
import dao.VehiculoDAO;
import modelos.Usuario;
import modelos.Vehiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CrearPropuesta extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public CrearPropuesta() {
		
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(265, 60, 436, 44);
		getContentPane().add(panel_4);
		

		
		JLabel lblVentas = new JLabel("VENTA");
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
		lblVentas.setBounds(45, 8, 356, 30);
		panel_4.add(lblVentas);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(278, 120, 224, 50);
		getContentPane().add(panel);
		
		JLabel lblVehiculo = new JLabel("Crear propuesta");
		lblVehiculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehiculo.setFont(new Font("Arial", Font.BOLD, 22));
		lblVehiculo.setBounds(10, 11, 207, 30);
		panel.add(lblVehiculo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(512, 120, 171, 50);
		getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Menu principal");
		btnNewButton.setBounds(0, 0, 175, 50);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			Usuario miUsuario;
			public void actionPerformed(ActionEvent e) {
				VentaVentana menu = new VentaVentana(miUsuario); 
				menu.setVisible(true);
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				CrearPropuesta.this.setVisible(false);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(278, 179, 405, 253);
		getContentPane().add(panel_2);
		
		JButton btnEditarVehiculo = new JButton("CREAR");
		btnEditarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VehiculoDAO miVehiculoDAO = new VehiculoDAO();
				Vehiculo miVehiculo = new Vehiculo();
				
				
				miVehiculo.setMatricula(textField.getText());
				miVehiculo.setMarca(txtMarca.getText());
				miVehiculo.setModelo(txtModelo.getText());
				miVehiculo.setColor(txtColor.getText());
				miVehiculo.setFechaAlta(txtFechaAlta.getText());
				miVehiculo.setTipoVehiculo(txtTipo.getText());


									
				if (miVehiculoDAO.anadirVehiculo(miVehiculo)) 
				{
					JOptionPane.showMessageDialog(null, "Registrado correctamente");
					
				}else {
					JOptionPane.showMessageDialog(null, "Registrado INcorrectamente");

				}
			}
	
				
			
		});
		btnEditarVehiculo.setToolTipText(" Venta - Vehiculo - Ficha");
		btnEditarVehiculo.setForeground(Color.WHITE);
		btnEditarVehiculo.setFont(new Font("Arial", Font.BOLD, 18));
		btnEditarVehiculo.setBackground(new Color(0, 128, 128));
		btnEditarVehiculo.setBounds(139, 207, 180, 35);
		panel_2.add(btnEditarVehiculo);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Arial", Font.BOLD, 14));
		lblMatricula.setBounds(119, 23, 95, 25);
		panel_2.add(lblMatricula);
		
		JLabel lblFechaAlta = new JLabel("Presupuesto");
		lblFechaAlta.setFont(new Font("Arial", Font.BOLD, 14));
		lblFechaAlta.setBounds(119, 60, 95, 25);
		panel_2.add(lblFechaAlta);
		
		textField = new JTextField();
		textField.setBounds(220, 26, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 63, 86, 20);
		panel_2.add(textField_1);
		
		JLabel lblDni = new JLabel("DNI cliente");
		lblDni.setFont(new Font("Arial", Font.BOLD, 14));
		lblDni.setBounds(119, 96, 104, 25);
		panel_2.add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(220, 99, 86, 20);
		panel_2.add(textField_2);
		
		JLabel lblTiempo = new JLabel("Tiempo");
		lblTiempo.setFont(new Font("Arial", Font.BOLD, 14));
		lblTiempo.setBounds(119, 135, 104, 25);
		panel_2.add(lblTiempo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(220, 138, 86, 20);
		panel_2.add(textField_3);
		
		JLabel lblPiezas = new JLabel("Piezas");
		lblPiezas.setFont(new Font("Arial", Font.BOLD, 14));
		lblPiezas.setBounds(119, 171, 104, 25);
		panel_2.add(lblPiezas);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(265, 106, 436, 344);
		getContentPane().add(panel_3);
		setTitle("Benavente & Porras - Venta - Vehiculo - Ficha");
	}

}