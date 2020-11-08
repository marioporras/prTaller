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
		
		JLabel lblSeudonimo = new JLabel("Seudonimo");
		lblSeudonimo.setBounds(10, 0, 119, 30);
		panel_1.add(lblSeudonimo);
		lblSeudonimo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeudonimo.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblCerrarSesion = new JLabel("CerrarSesion");
		lblCerrarSesion.setBounds(10, 20, 119, 30);
		panel_1.add(lblCerrarSesion);
		lblCerrarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblCerrarSesion.setFont(new Font("Arial", Font.PLAIN, 15));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(278, 179, 288, 243);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnAnadirCliente = new JButton("A\u00F1adir cliente");
		btnAnadirCliente.setBounds(20, 11, 248, 40);
		panel_2.add(btnAnadirCliente);
		btnAnadirCliente.setBackground(new Color(0, 128, 128));
		btnAnadirCliente.setForeground(Color.WHITE);
		btnAnadirCliente.setFont(new Font("Arial", Font.BOLD, 18));
		
		JButton btnEncontrarCliente = new JButton("Encontrar cliente");
		btnEncontrarCliente.setBounds(20, 62, 248, 40);
		panel_2.add(btnEncontrarCliente);
		btnEncontrarCliente.setForeground(Color.WHITE);
		btnEncontrarCliente.setFont(new Font("Arial", Font.BOLD, 18));
		btnEncontrarCliente.setBackground(new Color(0, 128, 128));
		
		JButton btnAnadirVehiculo = new JButton("Anadir vehiculo");
		btnAnadirVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAnadirVehiculo.setBounds(20, 141, 248, 40);
		panel_2.add(btnAnadirVehiculo);
		btnAnadirVehiculo.setForeground(Color.WHITE);
		btnAnadirVehiculo.setFont(new Font("Arial", Font.BOLD, 18));
		btnAnadirVehiculo.setBackground(new Color(0, 128, 128));
		
		JButton btnEncontrarVehiculo = new JButton("Encontrar vehiculo");
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(265, 106, 314, 328);
		getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(265, 60, 314, 44);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblVentas = new JLabel("VENTA");
		lblVentas.setBounds(88, 8, 122, 30);
		panel_4.add(lblVentas);
		lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		setTitle("Benavente & Porras - Venta");
	}
	
}