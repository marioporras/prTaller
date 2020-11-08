package ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentaClienteFicha extends JFrame {
	
	public VentaClienteFicha() {
		setTitle("Benavente & Porras - Venta - Cliente - Ficha");
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(278, 120, 140, 50);
		getContentPane().add(panel);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Arial", Font.BOLD, 22));
		lblCliente.setBounds(10, 11, 120, 30);
		panel.add(lblCliente);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(278, 179, 288, 243);
		getContentPane().add(panel_2);
		
		JButton btnEditarCliente = new JButton("Editar cliente");
		btnEditarCliente.setForeground(Color.WHITE);
		btnEditarCliente.setFont(new Font("Arial", Font.BOLD, 18));
		btnEditarCliente.setBackground(new Color(0, 128, 128));
		btnEditarCliente.setBounds(20, 192, 248, 40);
		panel_2.add(btnEditarCliente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 14));
		lblNombre.setBounds(10, 11, 95, 25);
		panel_2.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.BOLD, 14));
		lblApellidos.setBounds(10, 47, 95, 25);
		panel_2.add(lblApellidos);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.BOLD, 14));
		lblTelefono.setBounds(10, 83, 95, 25);
		panel_2.add(lblTelefono);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.BOLD, 14));
		lblDni.setBounds(10, 119, 95, 25);
		panel_2.add(lblDni);
		
		JLabel lblFechaAlta = new JLabel("Fecha de alta");
		lblFechaAlta.setFont(new Font("Arial", Font.BOLD, 14));
		lblFechaAlta.setBounds(10, 155, 95, 25);
		panel_2.add(lblFechaAlta);
		
		JLabel lblFechaAlta_1 = new JLabel("Fecha de alta");
		lblFechaAlta_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFechaAlta_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblFechaAlta_1.setBounds(183, 155, 95, 25);
		panel_2.add(lblFechaAlta_1);
		
		JLabel lblDni_1 = new JLabel("DNI");
		lblDni_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDni_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDni_1.setBounds(183, 119, 95, 25);
		panel_2.add(lblDni_1);
		
		JLabel lblTelefono_1 = new JLabel("Telefono");
		lblTelefono_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefono_1.setBounds(183, 83, 95, 25);
		panel_2.add(lblTelefono_1);
		
		JLabel lblApellidos_1 = new JLabel("Apellidos");
		lblApellidos_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellidos_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellidos_1.setBounds(183, 47, 95, 25);
		panel_2.add(lblApellidos_1);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre_1.setBounds(183, 11, 95, 25);
		panel_2.add(lblNombre_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(265, 106, 314, 328);
		getContentPane().add(panel_3);
	}

}