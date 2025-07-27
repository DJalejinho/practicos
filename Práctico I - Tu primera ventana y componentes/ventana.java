package pr1_ventanas;

import javax.swing.*;
import java.awt.*;

	public class ventana extends JFrame {

		public ventana() {
			this.setTitle("Ventana de Prueba - Ramiro Sosa");
	        this.setSize(400, 200);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	        
	        JPanel panel1 = new JPanel();
	        panel1.setLayout(new GridLayout(3, 1, 5, 5)); 
	        
	        JLabel lblBienvenido = new JLabel("Bienvenido a mi programa", SwingConstants.CENTER);
	        JPanel panelNombre = new JPanel(new FlowLayout(FlowLayout.CENTER));
	        JLabel lblNombre = new JLabel("Nombre:");
	        JTextField txtNombre = new JTextField(15);
	        JButton btnAceptar = new JButton("Aceptar");
	        
	     
	        panelNombre.add(lblNombre);
	        panelNombre.add(txtNombre);
	        
	  
	        panel1.add(lblBienvenido);
	        panel1.add(panelNombre);
	        panel1.add(btnAceptar);
	        
	        this.add(panel1);
	    }
	}