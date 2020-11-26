package ventana;

import javax.swing.JFrame;

import modelos.Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class VentaVentana extends JFrame {
	private final JButton btnNewButton = new JButton("Cerrar sesi\u00F3n");

	public VentaVentana(Usuario miUsuario) {
		getContentPane().setFont(new Font("Arial", Font.BOLD, 12));
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
	
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(278, 120, 140, 50);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Arial", Font.BOLD, 22));
		lblMenu.setBounds(28, 11, 82, 30);
		panel.add(lblMenu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(428, 120, 138, 50);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				LoginVentana log = new LoginVentana(); 
				log.setVisible(true);
				log.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVentana.this.setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(0, 0, 138, 50);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(278, 179, 288, 367);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAnadirCliente = new JButton("A\u00F1adir cliente");
		btnAnadirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentaClienteRegistro clRg = new VentaClienteRegistro(); 
				clRg.setVisible(true);
				clRg.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVentana.this.setVisible(false);
				
			}
		});
		btnAnadirCliente.setBounds(20, 11, 248, 40);
		panel_2.add(btnAnadirCliente);
		btnAnadirCliente.setBackground(new Color(0, 128, 128));
		btnAnadirCliente.setForeground(Color.WHITE);
		btnAnadirCliente.setFont(new Font("Arial", Font.BOLD, 18));
		
		JButton btnEncontrarCliente = new JButton("Encontrar cliente");
		btnEncontrarCliente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				VentaClientesVentana ficha = new VentaClientesVentana(); 
				ficha.setVisible(true);
				ficha.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVentana.this.setVisible(false);
				
			}
		});
		btnEncontrarCliente.setBounds(20, 62, 248, 40);
		panel_2.add(btnEncontrarCliente);
		btnEncontrarCliente.setForeground(Color.WHITE);
		btnEncontrarCliente.setFont(new Font("Arial", Font.BOLD, 18));
		btnEncontrarCliente.setBackground(new Color(0, 128, 128));
		
		JButton btnAnadirVehiculo = new JButton("Anadir vehiculo");
		btnAnadirVehiculo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				VentaVehiculoRegistro reg = new VentaVehiculoRegistro(); 
				reg.setVisible(true);
				reg.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVentana.this.setVisible(false);
				
			}
		});
		btnAnadirVehiculo.setBounds(20, 141, 248, 40);
		panel_2.add(btnAnadirVehiculo);
		btnAnadirVehiculo.setForeground(Color.WHITE);
		btnAnadirVehiculo.setFont(new Font("Arial", Font.BOLD, 18));
		btnAnadirVehiculo.setBackground(new Color(0, 128, 128));
		
		JButton btnEncontrarVehiculo = new JButton("Encontrar vehiculo");
		btnEncontrarVehiculo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				VentaVehiculosVentana vehF = new VentaVehiculosVentana(); 
				vehF.setVisible(true);
				vehF.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				VentaVentana.this.setVisible(false);
			}
		});
		btnEncontrarVehiculo.setBounds(20, 192, 248, 40);
		panel_2.add(btnEncontrarVehiculo);
		btnEncontrarVehiculo.setForeground(Color.WHITE);
		btnEncontrarVehiculo.setFont(new Font("Arial", Font.BOLD, 18));
		btnEncontrarVehiculo.setBackground(new Color(0, 128, 128));
		
		JLabel lblBarra = new JLabel("------------------------------------------------");
		lblBarra.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarra.setFont(new Font("Arial", Font.BOLD, 14));
		lblBarra.setBounds(20, 113, 248, 14);
		panel_2.add(lblBarra);
		
		JLabel lblBarra_1 = new JLabel("------------------------------------------------");
		lblBarra_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarra_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblBarra_1.setBounds(20, 243, 248, 14);
		panel_2.add(lblBarra_1);
		
		JButton btnPropuestas = new JButton("Propuestas");
		btnPropuestas.setForeground(Color.WHITE);
		btnPropuestas.setFont(new Font("Arial", Font.BOLD, 18));
		btnPropuestas.setBackground(new Color(0, 128, 128));
		btnPropuestas.setBounds(20, 264, 248, 40);
		panel_2.add(btnPropuestas);
		
		JButton btnVentas = new JButton("Ventas");
		btnVentas.setForeground(Color.WHITE);
		btnVentas.setFont(new Font("Arial", Font.BOLD, 18));
		btnVentas.setBackground(new Color(0, 128, 128));
		btnVentas.setBounds(20, 316, 248, 40);
		panel_2.add(btnVentas);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(265, 106, 314, 462);
		getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(265, 60, 314, 44);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblVentas = new JLabel("VENTAS");
		lblVentas.setBounds(88, 8, 122, 30);
		panel_4.add(lblVentas);
		lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		setTitle("Benavente & Porras - Venta");
	}
}