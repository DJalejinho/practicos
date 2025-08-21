package Tercera_Implementación_La_Biblioteca;
import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaConEventosArrayFor extends JFrame {
	public VentanaConEventosArrayFor() {
		
		this.setTitle("ventana"); //Estable el titulo de la ventana
		this.setSize(600, 400); //Tamaño en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion default al cerrar
		this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
		
		
		JPanel panel1 = new JPanel();
			this.add(panel1);
		Libro[] arrayLibro = new Libro[10];
		
		JLabel lblISBN = new JLabel();
		JLabel lblNOMBRE = new JLabel();
		JLabel lblAUTOR = new JLabel();
		 
		JTextField txtISBN = new JTextField(6);
		JTextField txtNOMBRE = new JTextField(6);
		JTextField txtAUTOR = new JTextField(6);

	
		
		panel1.add(lblISBN);
			panel1.add(txtISBN);
		panel1.add(lblNOMBRE);
			panel1.add(txtNOMBRE);
		panel1.add(lblAUTOR);
			panel1.add(txtAUTOR);
		
		
		
		
			JButton btnRegistrar = new JButton("Registrar");
			panel1.add(btnRegistrar);
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String isbn = txtISBN.getText();
				String autor = txtAUTOR.getText();
				String titulo = txtNOMBRE.getText();
				fncGuardarLibro(isbn,autor,titulo,arrayLibro);
				
				txtISBN.setText(null);
				txtAUTOR.setText(null);
				txtNOMBRE.setText(null);
			}
		});
		JButton btnMostrar = new JButton("Mostrar");
		panel1.add(btnMostrar);
	btnMostrar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			fncMostrarLibro(arrayLibro);
			
		}
	});
}
	private void fncGuardarLibro(String isbn, String autor, String nombre,Libro[] arrayLibro){
		for(int i = 0; i<arrayLibro.length; i++) { 
			if(arrayLibro[i] == null) {
				arrayLibro[i] = new Libro(isbn,autor,nombre);
				break;
				}
			}
		}
	private void fncMostrarLibro(Libro[] arrayLibro) {
		for(int i = 0; i<arrayLibro.length; i++) {
		if(arrayLibro != null) {
			System.out.println("ISBN: "+ arrayLibro[i].getIsbn());
		System.out.println("NOMBRE: "+ arrayLibro[i].getNombre());
		System.out.println("AUTOR: "+ arrayLibro[i].getAutor());
		System.out.println("   ");
		}else {
			continue;
			
		}
	}
}
}