package ABML1;

import java.util.Scanner;

public class main {

	public static void main (String[] args) {
    	
    
        
        supermercado supermercado = new supermercado();
        producto[] arreglo = new producto[10];

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
		        	
		        case 4:
		        	
		        	modificarProducto(arreglo,lector);
		        	break;
		        }
		    
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
	    System.out.println("\nLista de productos almacenados:");

	    for (int i = 0; i < arreglo.length; i++) {
	        if (arreglo[i] != null) {
	            System.out.println("-------------------------");
	            System.out.println("Producto N° " + (i + 1));
	            System.out.println("Nombre: " + arreglo[i].getNombre());
	            System.out.println("Precio: $" + arreglo[i].getPrecio());
	            System.out.println("-------------------------");
	        } else {
	            System.out.println("Posición N° " + (i + 1) + " está vacía.");
	        }
	    }	}
	
	    public static void bajaProducto(producto[] arreglo, Scanner lector) {
	        listarProducto(arreglo); 
	        
	        System.out.println("\n=== ELIMINAR PRODUCTO ===");
	        System.out.println("Ingrese el NÚMERO del producto a eliminar:");
	        System.out.println("(0 para cancelar)");
	        
	        try {
	            int posicion = Integer.parseInt(lector.nextLine()) - 1;
	            
	            if(posicion == -1) {
	                System.out.println("Operación cancelada");
	                return;
	            }
	            
	            if(posicion >= 0 && posicion < arreglo.length) {
	                if(arreglo[posicion] != null) {
	                    String nombreEliminado = arreglo[posicion].getNombre();
	                    arreglo[posicion] = null;
	                    System.out.println("Producto '" + nombreEliminado + "' eliminado correctamente");
	                } else {
	                    System.out.println("Error: Esa posición ya está vacía");
	                }
	            } else {
	                System.out.println("Error: Número de producto no válido");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Debe ingresar un número válido");
	        }
	    }

	 
	public static void altaRopa(producto[] arreglo, Scanner lector) {
	    lector.nextLine();

	    System.out.println("\nIngrese datos de la ropa:");
	    System.out.println("nombre de la prenda: ");
	    String nombreRopa = lector.nextLine();

	    System.out.println("precio (solo el numero): ");
	    double precioRopa = 0;
	    while (true) {
	        try {
	            precioRopa = Double.parseDouble(lector.nextLine());
	            break;
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Ingresa un número válido para el precio.");
	        }
	    }

	    System.out.println("talla (ejemplo: xl): ");
	    String talla = lector.nextLine();
	  
ropa nuevaRopa =  new ropa(nombreRopa, precioRopa, talla);
System.out.println(nuevaRopa.toString()+"es un tostring");

	    for (int i = 0; i < arreglo.length; i++) {
	        if (arreglo[i] == null) {
	            arreglo[i] = new ropa(nombreRopa, precioRopa, talla);
	           
	            System.out.println("Producto guardado en la posición " + i + ": " + arreglo[i]);

	            break;
	        }
	    }
	}

	public static void altaElectronica(producto[] arreglo, Scanner lector) {
	    lector.nextLine();
	    
	    System.out.println("\nIngrese datos del producto electrónico:");
	    System.out.println("Nombre del producto: ");
	    String nombreElec = lector.nextLine();

	    System.out.println("Precio: ");
	    double precioElec = 0;
	    while (true) {
	        try {
	            precioElec = Double.parseDouble(lector.nextLine());
	            break;
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Ingresa un número válido para el precio.");
	        }
	    }

	    System.out.println("Marca: ");
	    String marca = lector.nextLine();

	    electronica nuevoElectronico = new electronica(nombreElec, precioElec, marca);
	    System.out.println(nuevoElectronico.toString() + " - creado correctamente");

	    for (int i = 0; i < arreglo.length; i++) {
	        if (arreglo[i] == null) {
	            arreglo[i] = nuevoElectronico;
	            System.out.println("Producto guardado en la posición " + i);
	            break;
	        }
	    }
	}

	public static void altaAlimento(producto[] arreglo, Scanner lector) {
	    lector.nextLine(); 
	    
	    System.out.println("\nIngrese datos del alimento:");
	    System.out.println("Nombre del alimento: ");
	    String nombreAli = lector.nextLine();

	    System.out.println("Precio: ");
	    double precioAli = 0;
	    while (true) {
	        try {
	            precioAli = Double.parseDouble(lector.nextLine());
	            break;
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Ingresa un número válido para el precio.");
	        }
	    }

	    System.out.println("Fecha de caducidad (dia/mes/año): ");
	    String fecha = lector.nextLine();

	    alimento nuevoAlimento = new alimento(nombreAli, precioAli, fecha);
	    System.out.println(nuevoAlimento.toString() + " - creado correctamente");

	    for (int i = 0; i < arreglo.length; i++) {
	        if (arreglo[i] == null) {
	            arreglo[i] = nuevoAlimento;
	            System.out.println("Producto guardado en la posición " + i);
	            break;
	        }
	    }
	}
	
	public static void modificarProducto(producto[] arreglo, Scanner lector) {
	    
	    listarProducto(arreglo);
	    
	    System.out.println("\n=== MODIFICAR PRODUCTO ===");
	    System.out.println("Ingrese el NÚMERO del producto a modificar (0 para cancelar):");
	    
	    try {
	        int posicion = Integer.parseInt(lector.nextLine()) - 1;
	        
	        if(posicion == -1) {
	            System.out.println("Operación cancelada");
	            return;
	        }
	        
	        if(posicion < 0 || posicion >= arreglo.length || arreglo[posicion] == null) {
	            System.out.println("Error: Posición inválida o vacía");
	            return;
	        }
	        
	        producto prod = arreglo[posicion];
	        System.out.println("\nProducto seleccionado: " + prod.toString());
	        
	     
	        if(prod instanceof electronica) {
	            modificarElectronico((electronica)prod, lector);
	        } else if(prod instanceof ropa) {
	            modificarRopa((ropa)prod, lector);
	        } else if(prod instanceof alimento) {
	            modificarAlimento((alimento)prod, lector);
	        } else {
	            modificarProductoGenerico(prod, lector);
	        }
	        
	        System.out.println("Producto modificado con éxito!");
	        
	    } catch (NumberFormatException e) {
	        System.out.println("Error: Debe ingresar un número válido");
	    }
	}

	private static void modificarElectronico(electronica elec, Scanner lector) {
	    System.out.println("\n=== MODIFICAR PRODUCTO ELECTRÓNICO ===");
	    System.out.println("1- Nombre");
	    System.out.println("2- Precio");
	    System.out.println("3- Marca");
	    System.out.println("4- Cancelar");
	    
	    int opcion = Integer.parseInt(lector.nextLine());
	    
	    switch(opcion) {
	        case 1:
	            System.out.println("Nuevo nombre:");
	            elec.setNombre(lector.nextLine());
	            break;
	        case 2:
	            System.out.println("Nuevo precio:");
	            elec.setPrecio(Double.parseDouble(lector.nextLine()));
	            break;
	        case 3:
	            System.out.println("Nueva marca:");
	            elec.setMarca(lector.nextLine());
	            break;
	        case 4:
	            System.out.println("Modificación cancelada");
	            break;
	        default:
	            System.out.println("Opción no válida");
	    }
	}

	private static void modificarRopa(ropa prenda, Scanner lector) {
	    System.out.println("\n=== MODIFICAR PRENDA DE ROPA ===");
	    System.out.println("1- Nombre");
	    System.out.println("2- Precio");
	    System.out.println("3- Talla");
	    System.out.println("4- Cancelar");
	    
	    int opcion = Integer.parseInt(lector.nextLine());
	    
	    switch(opcion) {
	        case 1:
	            System.out.println("Nuevo nombre:");
	            prenda.setNombre(lector.nextLine());
	            break;
	        case 2:
	            System.out.println("Nuevo precio:");
	            prenda.setPrecio(Double.parseDouble(lector.nextLine()));
	            break;
	        case 3:
	            System.out.println("Nueva talla:");
	            prenda.setTalla(lector.nextLine());
	            break;
	        case 4:
	            System.out.println("Modificación cancelada");
	            break;
	        default:
	            System.out.println("Opción no válida");
	    }
	}

	private static void modificarAlimento(alimento ali, Scanner lector) {
	    System.out.println("\n=== MODIFICAR ALIMENTO ===");
	    System.out.println("1- Nombre");
	    System.out.println("2- Precio");
	    System.out.println("3- Fecha de caducidad");
	    System.out.println("4- Cancelar");
	    
	    int opcion = Integer.parseInt(lector.nextLine());
	    
	    switch(opcion) {
	        case 1:
	            System.out.println("Nuevo nombre:");
	            ali.setNombre(lector.nextLine());
	            break;
	        case 2:
	            System.out.println("Nuevo precio:");
	            ali.setPrecio(Double.parseDouble(lector.nextLine()));
	            break;
	        case 3:
	            System.out.println("Nueva fecha de caducidad:");
	            ali.setFechaCaducidad(lector.nextLine());
	            break;
	        case 4:
	            System.out.println("Modificación cancelada");
	            break;
	        default:
	            System.out.println("Opción no válida");
	    }
	}

	private static void modificarProductoGenerico(producto prod, Scanner lector) {
	    System.out.println("\n=== MODIFICAR PRODUCTO ===");
	    System.out.println("1- Nombre");
	    System.out.println("2- Precio");
	    System.out.println("3- Cancelar");
	    
	    int opcion = Integer.parseInt(lector.nextLine());
	    
	    switch(opcion) {
	        case 1:
	            System.out.println("Nuevo nombre:");
	            prod.setNombre(lector.nextLine());
	            break;
	        case 2:
	            System.out.println("Nuevo precio:");
	            prod.setPrecio(Double.parseDouble(lector.nextLine()));
	            break;
	        case 3:
	            System.out.println("Modificación cancelada");
	            break;
	        default:
	            System.out.println("Opción no válida");
	    }
	}}




