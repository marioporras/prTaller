package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import dao.UsuarioDAO;
import modelos.Usuario;
import javax.swing.ImageIcon;

public class Principal extends JFrame implements ActionListener {
	protected UsuarioDAO miUsuarioDao;
	protected Usuario miUsuario;
	
	public Principal() {
		setTitle("Benavente & Porras - Login");
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(131, 58, 563, 339);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		/*
    	int panelX = (getWidth() - getContentPane().getWidth() - getInsets().left - getInsets().right) * 2;
    	int panelY = ((getHeight() - getContentPane().getHeight() - getInsets().top - getInsets().bottom) *2 2);

    	panel.setLocation(panelX, panelY);
	
		*/

		//Tomo el tamaño de la pantalla
		Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
		//Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto:
		panel.setLocation((pantallaTamano.width/2)-(panel.getWidth()/2), (pantallaTamano.height/2)-(panel.getHeight()/2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(162, 11, 253, 47);
		panel.add(panel_1);
		
		JLabel lblNombreTaller = new JLabel("Taller P&G");
		panel_1.add(lblNombreTaller);
		lblNombreTaller.setForeground(Color.BLACK);
		lblNombreTaller.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreTaller.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnEntrar_1 = new JButton("Ventas");
		btnEntrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginVentana log = new LoginVentana(); 
				log.setVisible(true);
				log.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				Principal.this.setVisible(false);
				
			}
		});
		btnEntrar_1.setForeground(Color.WHITE);
		btnEntrar_1.setFont(new Font("Arial", Font.BOLD, 18));
		btnEntrar_1.setBackground(new Color(0, 128, 128));
		btnEntrar_1.setBounds(87, 183, 160, 40);
		panel.add(btnEntrar_1);
		
		JButton btnVentas = new JButton("Jefe Mecánicos");
		btnVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginJefeMecanico log = new LoginJefeMecanico(); 
				log.setVisible(true);
				log.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				Principal.this.setVisible(false);
				
			}
		});
		btnVentas.setForeground(Color.WHITE);
		btnVentas.setFont(new Font("Arial", Font.BOLD, 18));
		btnVentas.setBackground(new Color(0, 128, 128));
		btnVentas.setBounds(87, 99, 160, 40);
		panel.add(btnVentas);
		
		JButton btnEntrar_1_2 = new JButton("Mecánico");
		btnEntrar_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMecanico log = new LoginMecanico(); 
				log.setVisible(true);
				log.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				Principal.this.setVisible(false);
				
			}
		});
		btnEntrar_1_2.setForeground(Color.WHITE);
		btnEntrar_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		btnEntrar_1_2.setBackground(new Color(0, 128, 128));
		btnEntrar_1_2.setBounds(305, 99, 160, 40);
		panel.add(btnEntrar_1_2);
		
		JButton btnEntrar_1_3 = new JButton("Jefe");
		btnEntrar_1_3.setForeground(Color.WHITE);
		btnEntrar_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		btnEntrar_1_3.setBackground(new Color(0, 128, 128));
		btnEntrar_1_3.setBounds(305, 183, 160, 40);
		panel.add(btnEntrar_1_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mario\\Downloads\\lamboFoto_preview_rev_1.png"));
		lblNewLabel.setBounds(114, 252, 301, 63);
		panel.add(lblNewLabel);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*
	public void abrir(ActionEvent e) {
		String acceso = new String(psdfContrasena.getPassword());		
		VentaVentana ventaVentana;
		miUsuario = miUsuarioDao.pruebaLogin(txtfUsuario.getText(), acceso);	
	}
*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
