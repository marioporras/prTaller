package ventana;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;


import dao.ClienteDAO;
import modelos.Cliente;
import modelos.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentaClienteRegistro extends JFrame {
	

	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDNI;
	private JTextField txtFechaAlta;
	
	public VentaClienteRegistro() {
		setTitle("Benavente & Porras - Venta - Cliente - Registro");
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
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
				VentaClienteRegistro.this.setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(0, 0, 138, 50);
		panel_1.add(btnNewButton);
		
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(278, 179, 288, 243);
		getContentPane().add(panel_2);
		
		JButton btnRegistrarCliente = new JButton("Registrar cliente");
		btnRegistrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteDAO miClienteDAO = new ClienteDAO();
				Cliente miCliente = new Cliente();
				
				miCliente.setNombre(txtNombre.getText());
				miCliente.setApellidos(txtApellidos.getText());
				miCliente.setTelefono(txtTelefono.getText());
				miCliente.setDni(txtDNI.getText());
				miCliente.setFechaAlta(txtFechaAlta.getText());
				
				if (miClienteDAO.anadirCliente(miCliente)) 
				{
					JOptionPane.showMessageDialog(null, "Registrado correctamente");
					
				}else {
					JOptionPane.showMessageDialog(null, "Registrado Incorrectamente");

				}
			}
		});
		btnRegistrarCliente.setForeground(Color.WHITE);
		btnRegistrarCliente.setFont(new Font("Arial", Font.BOLD, 18));
		btnRegistrarCliente.setBackground(new Color(0, 128, 128));
		btnRegistrarCliente.setBounds(20, 192, 248, 40);
		panel_2.add(btnRegistrarCliente);
		
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
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setBounds(158, 16, 110, 20);
		panel_2.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setFont(new Font("Arial", Font.PLAIN, 12));
		txtApellidos.setBounds(158, 50, 110, 20);
		panel_2.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTelefono.setBounds(158, 86, 110, 20);
		panel_2.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDNI.setBounds(158, 122, 110, 20);
		panel_2.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtFechaAlta = new JTextField();
		txtFechaAlta.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFechaAlta.setBounds(158, 158, 110, 20);
		panel_2.add(txtFechaAlta);
		txtFechaAlta.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(265, 106, 314, 328);
		getContentPane().add(panel_3);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaClienteRegistro frame = new VentaClienteRegistro();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}