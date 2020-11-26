package ventana;

	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import javax.swing.JPasswordField;
	import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JButton;
	import javax.swing.SwingConstants;
	import javax.swing.JPanel;
	import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
	import javax.swing.border.LineBorder;
	import dao.UsuarioDAO;
	import modelos.Usuario;
	import javax.swing.border.BevelBorder;

	public class LoginMecanico extends JFrame implements ActionListener {
		
		private JTextField txtfUsuario;
		private JPasswordField psdfContrasena;
		protected UsuarioDAO miUsuarioDao;
		protected Usuario miUsuario;
		
		public LoginMecanico() {
			setTitle("Mecánico - Login");
			getContentPane().setBackground(new Color(255, 153, 102));
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setForeground(Color.BLACK);
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel.setBackground(Color.ORANGE);
			panel.setBounds(289, 91, 256, 306);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			//Tomo el tamaño de la pantalla
			Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
			//Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto:
			panel.setLocation((pantallaTamano.width/2)-(panel.getWidth()/2), (pantallaTamano.height/2)-(panel.getHeight()/2));
			
			JLabel lblNombreTaller = new JLabel("MEC\u00C1NICOS");
			lblNombreTaller.setForeground(Color.BLACK);
			lblNombreTaller.setBounds(10, 11, 236, 60);
			panel.add(lblNombreTaller);
			lblNombreTaller.setHorizontalAlignment(SwingConstants.CENTER);
			lblNombreTaller.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
			
			JLabel lblUsuario = new JLabel("Usuario");
			lblUsuario.setForeground(Color.BLACK);
			lblUsuario.setBounds(47, 82, 110, 30);
			panel.add(lblUsuario);
			lblUsuario.setFont(new Font("Arial", Font.BOLD, 18));
			
			txtfUsuario = new JTextField();
			txtfUsuario.setForeground(Color.BLACK);
			txtfUsuario.setBounds(47, 112, 160, 30);
			panel.add(txtfUsuario);
			txtfUsuario.setFont(new Font("Arial", Font.BOLD, 18));
			txtfUsuario.setColumns(10);
			
			psdfContrasena = new JPasswordField();
			psdfContrasena.setForeground(Color.BLACK);
			psdfContrasena.setBounds(47, 179, 160, 30);
			panel.add(psdfContrasena);
			psdfContrasena.setFont(new Font("Arial", Font.BOLD, 18));
			
			JLabel lblContrasena = new JLabel("Contrase\u00F1a");
			lblContrasena.setForeground(Color.BLACK);
			lblContrasena.setBounds(47, 149, 110, 30);
			panel.add(lblContrasena);
			lblContrasena.setFont(new Font("Arial", Font.BOLD, 18));
			
			JButton btnEntrar = new JButton("Entrar");
			btnEntrar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					Usuario miUsuario = new Usuario();
					UsuarioDAO miUsuarioDAO = new UsuarioDAO();
					String contra = new String(psdfContrasena.getPassword());
					
					if(!psdfContrasena.getText().contentEquals("") && !contra.contentEquals("")) {
						miUsuario.setSeudonimo(txtfUsuario.getText());
						miUsuario.setContrasena(contra);
						
						if(miUsuarioDAO.pruebaLoginMecanico(miUsuario)) {
							
							JOptionPane.showMessageDialog(null, "Logeado correctamente");
							VentanaMecanico menu = new VentanaMecanico(); 
							menu.setVisible(true);
							menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
							LoginMecanico.this.setVisible(false);

							
						}else {
							JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrectamente");

						}
						}else { 					
							JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrectamente");

							
						};
					
					};
					
			});
			btnEntrar.setForeground(Color.WHITE);
			btnEntrar.setBackground(new Color(0, 128, 128));
			btnEntrar.setBounds(47, 235, 160, 30);
			panel.add(btnEntrar);
			btnEntrar.setFont(new Font("Arial", Font.BOLD, 18));
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.ORANGE);
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(10, 11, 236, 60);
			panel.add(panel_1);
		}
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						LoginMecanico frame = new LoginMecanico();
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
