package ventana;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VentaVehiculoRegistro extends JFrame {
	
	private JTextField txtMatricula;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtColor;
	private JTextField txtFechaAlta;
	
	public VentaVehiculoRegistro() {
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(278, 120, 140, 50);
		getContentPane().add(panel);
		
		JLabel lblVehiculo = new JLabel("Vehiculo");
		lblVehiculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehiculo.setFont(new Font("Arial", Font.BOLD, 22));
		lblVehiculo.setBounds(10, 11, 120, 30);
		panel.add(lblVehiculo);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(428, 120, 138, 50);
		getContentPane().add(panel_1);
		
		JLabel lblSeudonimo = new JLabel("Seudonimo");
		lblSeudonimo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeudonimo.setFont(new Font("Arial", Font.BOLD, 18));
		lblSeudonimo.setBounds(10, 0, 119, 30);
		panel_1.add(lblSeudonimo);
		
		JLabel lblMenuPrincipal = new JLabel("Menu principal");
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMenuPrincipal.setBounds(10, 20, 119, 30);
		panel_1.add(lblMenuPrincipal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(278, 179, 288, 243);
		getContentPane().add(panel_2);
		
		JButton btnRegistrarCliente = new JButton("Registrar cliente");
		btnRegistrarCliente.setForeground(Color.WHITE);
		btnRegistrarCliente.setFont(new Font("Arial", Font.BOLD, 18));
		btnRegistrarCliente.setBackground(new Color(0, 128, 128));
		btnRegistrarCliente.setBounds(20, 192, 248, 40);
		panel_2.add(btnRegistrarCliente);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula");
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
		
		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(158, 16, 110, 20);
		panel_2.add(txtMatricula);
		
		txtMarca = new JTextField();
		txtMarca.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMarca.setColumns(10);
		txtMarca.setBounds(158, 50, 110, 20);
		panel_2.add(txtMarca);
		
		txtModelo = new JTextField();
		txtModelo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtModelo.setColumns(10);
		txtModelo.setBounds(158, 86, 110, 20);
		panel_2.add(txtModelo);
		
		txtColor = new JTextField();
		txtColor.setFont(new Font("Arial", Font.PLAIN, 12));
		txtColor.setColumns(10);
		txtColor.setBounds(158, 122, 110, 20);
		panel_2.add(txtColor);
		
		txtFechaAlta = new JTextField();
		txtFechaAlta.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFechaAlta.setColumns(10);
		txtFechaAlta.setBounds(158, 158, 110, 20);
		panel_2.add(txtFechaAlta);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(265, 106, 314, 328);
		getContentPane().add(panel_3);
		setTitle("Benavente & Porras - Venta - Vehiculo - Registro");
	}

}