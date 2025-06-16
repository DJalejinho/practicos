package ActividadConstructora;
import java.util.Scanner;
public class ControladorConstructora {

	public static void main(String[] args) {
		int opcion;
		Apartamento[] arrayApa = new Apartamento[10];
		Casa[] arrayCas = new Casa[10];
 		do {
			Scanner lector = new Scanner(System.in);
			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Apartamento");
			System.out.println("2- Casa");
			System.out.println("3- Salir");
			opcion = lector.nextInt();
		switch (opcion) { // Switch General
			case 1: // CAso de Apartamento
				System.out.println("|| APARTAMENTO ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Apartamento
			case 1: //Ingresar 
				altaApartamento (arrayApa,lector);
				
				break; 
			case 2: // Borrar
				bajaApartamento (arrayApa,lector);
				break;
			case 3: // Modificar
				modifApartamento (arrayApa, lector);
				break;
			case 4: // Listar 
				listarApartamento (arrayApa);
				break;
			case 5: 
				System.out.println("Saliste de Libro");
				break;
			}
				}while (opcion != 5); // Termina Switch Libro
				break;
			case 2: // Caso de Casa
				System.out.println("|| CASA ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Casa
			case 1: //Ingresar
					altaCasa (arrayCas, lector);
				break;
			case 2: //Borrar
					bajaCasa (arrayCas, lector);
				break;
			case 3: //Modificar
					modifCasa (arrayCas, lector);
				break;
			case 4: //listar
					listarCasa (arrayCas);
				break;
			case 5:
				System.out.println("Saliste de Revsita");
				break;
			}
				}while (opcion != 5); // Termina Switch Casa
				break;
			case 3: 
				System.out.println("Saliste del programa");
				break;
			}
		}while (opcion != 3);
		
	} // main
 		public static void altaApartamento(Apartamento[] arrayApa, Scanner lector) {
 			
 			System.out.println("Cual es el material?");
 				String material = lector.next();
 			System.out.println("Cual es la direccion?");
 				String direccion = lector.next();
 			System.out.println("Cuantas Ventanas tiene?");
 				int ventanas = lector.nextInt();
 			System.out.println("En que block esta?");
 				String block = lector.next();
 			System.out.println("Tiene piscina?");
 				boolean piscina = lector.nextBoolean();
 			
 			for(int i=0; i<arrayApa.length; i++) {
 				if(arrayApa[i] == null) {
 					arrayApa[i] = new Apartamento(material,direccion,ventanas,block,piscina);
 					break;
 				}
 				}
 				}	
 		public static void bajaApartamento(Apartamento[] arrayApa, Scanner lector) {
 			System.out.println("Ingresa la direccion del Apartamento: ");
 			String direccion = lector.next();
 			for(int i=0; i<arrayApa.length; i++) {
 				if(arrayApa[i] != null && arrayApa[i].getDireccion().equals(direccion)) {
 					arrayApa[i] = null;
 					System.out.println("Apartamento Eliminado !!");
 					break;
 				}
 				}
 				}
 		public static void modifApartamento(Apartamento[] arrayApa, Scanner lector) {
 			System.out.println("Ingresa la direccion del Apartamento a modificar: ");
 			String direccion = lector.next();
 			
 			int opApartamento;
 		
 			 
 		for(int i=0; i<arrayApa.length; i++) {
 			if(arrayApa[i] != null && arrayApa[i].getDireccion().equals(direccion)) {
 				   
 					System.out.println("Apartamento encontrado");
 					
 			
				do {
 					System.out.println("Ingresa la opcion que quieres Modificar:");
 					System.out.println("1- Material");
 					System.out.println("2- Direccion");
 					System.out.println("3- Ventanas");
 					System.out.println("4- Block");
 					System.out.println("5- Piscina");
 					System.out.println("6- Salir");
 					opApartamento = lector.nextInt();

 				switch (opApartamento) {
 				
 				case 1: 
 					System.out.println("Ingresa el nuevo valor de Material del Apartamento: ");
						String material2 = lector.next();
						arrayApa[i].setMaterial(material2);
					break;
					
 				case 2: 
 					System.out.println("Ingresa el nuevo valor de la Direccion del Apartamento: ");
						String direccion2 = lector.next();
						arrayApa[i].setDireccion(direccion2);
					break;
					
 				case 3: 
 					System.out.println("Ingresa el nuevo valor de la Cantidad de Ventanas del Apartamento: ");
						int ventanas2 = lector.nextInt();
						arrayApa[i].setVentanas(ventanas2);
					break;
					
 				case 4: 
 					System.out.println("Ingresa el nuevo valor del Block del Apartamento: ");
						String block2 = lector.next();
						arrayApa[i].setBlock(block2);
					break;
					
 			    case 5: 
 					System.out.println("Ingresa el nuevo valor de la Piscina del Apartamento: (TRUE OR FALSE)");
						boolean piscina2 = lector.nextBoolean();
						arrayApa[i].setPiscina(piscina2);
					break;
					
 				case 6:
 						System.out.println("Saliste de Apartamento");
 						break;
 				}
 				}while (opApartamento != 6);    
 			}
 			}
 		        }
 		public static void listarApartamento(Apartamento[] arrayApa) {
 			
 			for(int i=0; i<arrayApa.length; i++) {
 				if(arrayApa[i] != null) {
 					System.out.print("Material: "+ arrayApa[i].getMaterial());
 					System.out.print(" Direccion: "+ arrayApa[i].getDireccion());
 					System.out.print(" Ventanas: "+ arrayApa[i].getVentanas());
 					System.out.print(" Block: "+ arrayApa[i].getBlock());
 					System.out.println(" Piscina?: "+ arrayApa[i].isPiscina());
 				}else {
 					System.out.println("Pos N°" + i + "es null");
 				}
 				}
 				}
 		public static void altaCasa(Casa[] arrayCas, Scanner lector) {
 			
 			System.out.println("Cual es el material?");
 				String material = lector.next();
 			System.out.println("Cual es la direccion?");
 				String direccion = lector.next();
 			System.out.println("Cuantas Ventanas tiene?");
 				int ventanas = lector.nextInt();
 			System.out.println("En que block esta?");
 				int tamPatio = lector.nextInt();
 			System.out.println("Cuantos pisos tiene?");
 				int pisos = lector.nextInt();
 			
 			for(int i=0; i<arrayCas.length; i++) {
 				if(arrayCas[i] == null) {
 					arrayCas[i] = new Casa(material,direccion,ventanas,tamPatio,pisos);
 					break;
 				}
 				}
 				}	
 		public static void bajaCasa(Casa[] arrayCas, Scanner lector) {
 			System.out.println("Ingresa la direccion de la casa: ");
 			String direccion = lector.next();
 			for(int i=0; i<arrayCas.length; i++) {
 				if(arrayCas[i] != null && arrayCas[i].getDireccion().equals(direccion)) {
 					arrayCas[i] = null;
 					System.out.println("Casa Eliminada !!");
 					break;
 				}
 				}
 				}
 		public static void modifCasa(Casa[] arrayCas, Scanner lector) {
 			System.out.println("Ingresa la direccion de la casa a modificar: ");
 			String direccion = lector.next();
 			int opCasa;
 		for(int i=0; i<arrayCas.length; i++) {
 			if(arrayCas[i] != null && arrayCas[i].getDireccion().equals(direccion)) {
 					System.out.println("Casa encontrada");
 				do {
 					System.out.println("Ingresa la opcion a modificar");
 					System.out.println("1- Material");
 					System.out.println("2- Direccion");
 					System.out.println("3- Ventanas");
 					System.out.println("4- Tamaño Patio");
 					System.out.println("5- Pisos");
 					System.out.println("6- Salir");
 				opCasa = lector.nextInt();
 				switch (opCasa) {
 				case 1: 
 					System.out.println("Ingresa el nuevo valor de Material de la casa: ");
						String material2 = lector.next();
						arrayCas[i].setMaterial(material2);
					break;
 				case 2: 
 					System.out.println("Ingresa el nuevo valor de Direccion de la casa: ");
					String direccion2 = lector.next();
					arrayCas[i].setDireccion(direccion2);
				break;
 				case 3:
 					System.out.println("Ingresa el nuevo valor de Ventanas de la casa: ");
					int ventanas2 = lector.nextInt();
					arrayCas[i].setVentanas(ventanas2);
				break;
 				case 4: 
 					System.out.println("Ingresa el nuevo valor de Tamaño patio de la casa: ");
					int tamPatio2 = lector.nextInt();
					arrayCas[i].setTamPatio(tamPatio2);
					break;
 				case 5:
 					System.out.println("Ingresa el nuevo valor de Pisos de la casa: ");
					int pisos2 = lector.nextInt();
					arrayCas[i].setPisos(pisos2);
				break;
 				case 6:
 					System.out.println("Saliste de Modificar");
				break;
 				}
 				}while (opCasa != 6);
 				}
 				}
 				}
 		public static void listarCasa(Casa[] arrayCas) {
 			
 			for(int i=0; i<arrayCas.length; i++) {
 				if(arrayCas[i] != null) {
 					System.out.print("Material: "+ arrayCas[i].getMaterial());
 					System.out.print(" Direccion: "+ arrayCas[i].getDireccion());
 					System.out.print(" Ventanas: "+ arrayCas[i].getVentanas());
 					System.out.print(" Tamaño piso: "+ arrayCas[i].getTamPatio() + "m2");
 					System.out.println(" Pisos: "+ arrayCas[i].getPisos());
 				}else {
 					System.out.println("Pos N°" + i + "es null");
 					
 				}
 				}
 				}	

	
}
