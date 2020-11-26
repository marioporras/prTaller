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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class VentaVehiculoFicha extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public VentaVehiculoFicha() {
		
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(265, 60, 314, 44);
		getContentPane().add(panel_4);
		
		JLabel lblVentas = new JLabel("VENTA");
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
		lblVentas.setBounds(88, 8, 122, 30);
		panel_4.add(lblVentas);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(278, 120, 140, 50);
		getContentPane().add(panel);
		
		JLabel lblVehiculo = new JLabel("Veh\u00EDculo");
		lblVehiculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehiculo.setFont(new Font("Arial", Font.BOLD, 22));
		lblVehiculo.setBounds(10, 11, 120, 30);
		panel.add(lblVehiculo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(428, 120, 138, 50);
		getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Menu principal");
		btnNewButton.addActionListener(new ActionListener() {
			Usuario miUsuario;
			public void actionPerformed(ActionEvent e) {
				VentaVentana menu = new VentaVentana(miUsuario); 
				menu.setVisible(true);
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVehiculoFicha.this.setVisible(false);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(0, 0, 138, 50);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(278, 179, 288, 243);
		getContentPane().add(panel_2);
		
		JButton btnEditarVehiculo = new JButton("Editar vehiculo");
		btnEditarVehiculo.setToolTipText("Benavente & Porras - Venta - Vehiculo - Ficha");
		btnEditarVehiculo.setForeground(Color.WHITE);
		btnEditarVehiculo.setFont(new Font("Arial", Font.BOLD, 18));
		btnEditarVehiculo.setBackground(new Color(0, 128, 128));
		btnEditarVehiculo.setBounds(20, 192, 248, 40);
		panel_2.add(btnEditarVehiculo);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Arial", Font.BOLD, 14));
		lblMatricula.setBounds(10, 11, 95, 25);
		panel_2.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Arial", Font.BOLD, 14));
		lblMarca.setBounds(10, 47, 95, 25);
		panel_2.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Arial", Font.BOLD, 14));
		lblModelo.setBounds(10, 83, 95, 25);
		panel_2.add(lblModelo);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(new Font("Arial", Font.BOLD, 14));
		lblColor.setBounds(10, 119, 95, 25);
		panel_2.add(lblColor);
		
		JLabel lblFechaAlta = new JLabel("Fecha de alta");
		lblFechaAlta.setFont(new Font("Arial", Font.BOLD, 14));
		lblFechaAlta.setBounds(10, 155, 95, 25);
		panel_2.add(lblFechaAlta);
		
		textField = new JTextField();
		textField.setBounds(182, 14, 86, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 50, 86, 20);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 86, 86, 20);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 122, 86, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 158, 86, 20);
		panel_2.add(textField_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(265, 106, 314, 328);
		getContentPane().add(panel_3);
		setTitle("Benavente & Porras - Venta - Vehiculo - Ficha");
	}

}