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
import javax.swing.ImageIcon;

	public class VentanaJefeMecanicos extends JFrame {
		

		private JTextField txtNombre;
		private JTextField txtApellidos;
		private JTextField txtTelefono;
		private JTextField txtDNI;
		
		public VentanaJefeMecanicos() {
			setTitle("Benavente & Porras - Venta - Cliente - Registro");
			getContentPane().setBackground(new Color(255, 153, 102));
			getContentPane().setLayout(null);
			/*
			JButton btnNewButton = new JButton("Menu principal");
			btnNewButton.addActionListener(new ActionListener() {
				Usuario miUsuario;
				public void actionPerformed(ActionEvent e) {
					menu = new VentaVentana(miUsuario); 
					menu.setVisible(true);
					menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					VentanaJefeMecanicos.this.setVisible(false);
					
				}
			});
			
			btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBounds(0, 0, 138, 50);
			panel_1.add(btnNewButton);
			*/
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel.setBackground(Color.ORANGE);
			panel.setBounds(278, 120, 523, 50);
			getContentPane().add(panel);
			
			JLabel lblCliente = new JLabel("Trabajo para hoy");
			lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
			lblCliente.setFont(new Font("Arial", Font.BOLD, 22));
			lblCliente.setBounds(10, 11, 503, 30);
			panel.add(lblCliente);
			
			JPanel panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_4.setBackground(Color.ORANGE);
			panel_4.setBounds(265, 60, 561, 44);
			getContentPane().add(panel_4);
			
			JLabel lblVentas = new JLabel("JEFE MEC\u00C1NICOS");
			lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
			lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
			lblVentas.setBounds(10, 11, 541, 30);
			panel_4.add(lblVentas);
			
			JPanel panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_2.setBackground(Color.ORANGE);
			panel_2.setBounds(278, 179, 523, 243);
			getContentPane().add(panel_2);
			
			JButton btnRegistrarCliente = new JButton("CREAR");
			btnRegistrarCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ClienteDAO miClienteDAO = new ClienteDAO();
					Cliente miCliente = new Cliente();
					
					miCliente.setNombre(txtNombre.getText());
					miCliente.setApellidos(txtApellidos.getText());
					miCliente.setTelefono(txtTelefono.getText());
					miCliente.setDni(txtDNI.getText());
					//miCliente.setFechaAlta(txtFechaAlta.getText());
					
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
			btnRegistrarCliente.setBounds(10, 175, 248, 40);
			panel_2.add(btnRegistrarCliente);
			
			JLabel lblNombre = new JLabel("Matricula c.");
			lblNombre.setFont(new Font("Arial", Font.BOLD, 14));
			lblNombre.setBounds(20, 13, 83, 25);
			panel_2.add(lblNombre);
			
			JLabel lblApellidos = new JLabel("Mec\u00E1nico");
			lblApellidos.setFont(new Font("Arial", Font.BOLD, 14));
			lblApellidos.setBounds(20, 49, 83, 25);
			panel_2.add(lblApellidos);
			
			JLabel lblTelefono = new JLabel("Tiempo");
			lblTelefono.setFont(new Font("Arial", Font.BOLD, 14));
			lblTelefono.setBounds(20, 85, 95, 25);
			panel_2.add(lblTelefono);
			
			JLabel lblDni = new JLabel("Presupuesto");
			lblDni.setFont(new Font("Arial", Font.BOLD, 14));
			lblDni.setBounds(10, 119, 95, 25);
			panel_2.add(lblDni);
			
			txtNombre = new JTextField();
			txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
			txtNombre.setBounds(121, 16, 110, 20);
			panel_2.add(txtNombre);
			txtNombre.setColumns(10);
			
			txtApellidos = new JTextField();
			txtApellidos.setFont(new Font("Arial", Font.PLAIN, 12));
			txtApellidos.setBounds(121, 88, 110, 20);
			panel_2.add(txtApellidos);
			txtApellidos.setColumns(10);
			
			txtTelefono = new JTextField();
			txtTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
			txtTelefono.setBounds(121, 52, 110, 20);
			panel_2.add(txtTelefono);
			txtTelefono.setColumns(10);
			
			txtDNI = new JTextField();
			txtDNI.setFont(new Font("Arial", Font.PLAIN, 12));
			txtDNI.setBounds(121, 122, 110, 20);
			panel_2.add(txtDNI);
			txtDNI.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mario\\Downloads\\descarga (2)_preview_rev_1.png"));
			lblNewLabel.setBounds(268, 11, 235, 219);
			panel_2.add(lblNewLabel);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_3.setBackground(Color.ORANGE);
			panel_3.setBounds(265, 106, 561, 328);
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

