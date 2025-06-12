package ABML1;

import java.util.Scanner;

public class main {

	public static void main (String[] args) {
    	
    
        
        supermercado supermercado = new supermercado();
        electronica[] arreglo = new electronica[10];
        int opcion;
        int opcion1;

do {
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Ingresar Datos de los productos");
			System.out.println("2- Mostrar Lista de los Productos");
			System.out.println("3- Borrar Productos");
			System.out.println("4- Modificar algun Producto");
			System.out.println("5- Salir");
			opcion = lector.nextInt();
			
			
			switch (opcion) {
			
			case 1:
				
				
				System.out.println("Ingresa opcion deseada:");
				System.out.println("1- Ingrese los datos de los productos ELECTRONICOS");
				System.out.println("2- Ingrese los datos de los productos ALIMENTICIOS");
				System.out.println("3- Ingrese los datos de las prendas de ROPA");
				
				opcion1 = lector.nextInt();
				
		        switch(opcion1) {
		        
		        case 1:
		        	
		        	altaElectronica(arreglo, lector);
		        	break;
		        case 2:
		        	
		        	altaAlimento(arreglo,lector);
		        	break;
		        case 3: 
		        	
		        	altaRopa(arreglo,lector);
		        	break;
		        }
		     
		       

		        

		     
		    
				break;
				
			case 2:
		
				listarProducto(arreglo);
				
				break;
			case 3:
				
				bajaProducto(arreglo, lector);
				
				break;
	
			}
}while(opcion!=5);
			
}

	public static void listarProducto(producto[] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] != null) {
				System.out.print("Producto N°" + i);
				System.out.print(" NOMBRE: " + arreglo[i].getNombre());
				System.out.println(" PRECIO: " + arreglo[i].getPrecio());

			} else {
				System.out.println("Pos N°" + i + "es null");
			}
		}
	}
	public static void bajaProducto(producto[] arreglo, Scanner lector) {
		System.out.println("Ingresa la CI del estudiante a dar de baja: ");
		int num = lector.nextInt();
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] != null && arreglo[i].getPrecio() == num) {
				arreglo[i] = null;
				break;
			}}}
	
	public static void altaRopa(producto[] arreglo, Scanner lector) {
		
		System.out.println("\nIngrese datos de la ropa:");
        System.out.println("nombre de la prenda: ");
        String nombreRopa = lector.nextLine();
        System.out.println("precio (solo el numero): ");
        double precioRopa = lector.nextDouble(); lector.nextLine();
        System.out.println("talla (solo el numero): ");
        String talla = lector.nextLine();
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] == null) {
				arreglo[i] = new ropa(nombreRopa, precioRopa, talla);
				break;
			}
		}
}

public static void altaElectronica(producto[] arreglo, Scanner lector) {
	
	System.out.println("ingrese datos del producto electronico:");
    System.out.println("nombre del producto electronico: ");
    String nombreElec = lector.nextLine();
    System.out.println("precio del producto (solo el numero) : ");
    double precioElec = lector.nextDouble(); lector.nextLine();
    System.out.println("marca del producto: ");
    String marca = lector.nextLine();

    for(int i=0; i<arreglo.length; i++) {
		if(arreglo[i] == null) {
			arreglo[i] = new electronica(nombreElec, precioElec, marca);
			break;

		}}}

public static void altaAlimento(producto[] arreglo, Scanner lector) {

System.out.println("\ningrese datos del alimento:");
System.out.println("nombre del alimento: ");
String nombreAli = lector.nextLine();
System.out.println("precio del producto: ");
double precioAli = lector.nextDouble(); lector.nextLine();
System.out.println("fecha de caducidad (dia/mes/año): ");
String fecha = lector.nextLine();

for(int i=0; i<arreglo.length; i++) {
	if(arreglo[i] == null) {
		arreglo[i] = new alimento(nombreAli, precioAli, fecha);
		break;
	}}}}




