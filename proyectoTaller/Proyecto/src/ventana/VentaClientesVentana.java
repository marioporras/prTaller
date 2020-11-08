package ventana;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;

public class VentaClientesVentana extends JFrame {
	
	private JTable table;
	
	public VentaClientesVentana() {
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(Color.ORANGE);
		panel_4.setBounds(196, 60, 458, 44);
		getContentPane().add(panel_4);
		
		JLabel lblVentas = new JLabel("VENTA");
		lblVentas.setHorizontalAlignment(SwingConstants.CENTER);
		lblVentas.setFont(new Font("Arial", Font.BOLD, 25));
		lblVentas.setBounds(10, 8, 438, 30);
		panel_4.add(lblVentas);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(209, 178, 433, 244);
		getContentPane().add(panel_2);
		
		table = new JTable();
		table.setFont(new Font("Arial", Font.PLAIN, 11));
		table.setBounds(10, 11, 412, 221);
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(196, 107, 458, 327);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 140, 50);
		panel_3.add(panel);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.ORANGE);
		panel.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 11, 120, 30);
		lblCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliente.setFont(new Font("Arial", Font.BOLD, 22));
		panel.add(lblCliente);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(310, 11, 138, 50);
		panel_3.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setLayout(null);
		
		JLabel lblSeudonimo = new JLabel("Seudonimo");
		lblSeudonimo.setBounds(10, 0, 119, 30);
		lblSeudonimo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeudonimo.setFont(new Font("Arial", Font.BOLD, 18));
		panel_1.add(lblSeudonimo);
		
		JLabel lblMenuPrincipal = new JLabel("Menu principal");
		lblMenuPrincipal.setBounds(10, 20, 119, 30);
		lblMenuPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenuPrincipal.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_1.add(lblMenuPrincipal);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.ORANGE);
		panel_5.setBounds(160, 11, 140, 50);
		panel_3.add(panel_5);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientes.setFont(new Font("Arial", Font.BOLD, 22));
		lblClientes.setBounds(10, 11, 120, 30);
		panel_5.add(lblClientes);
		setTitle("Benavente & Porras - Venta - Clientes");
	}
	
}