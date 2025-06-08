package pr1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        supermercado supermercado = new supermercado();


        System.out.println("ingrese datos del producto electronico:");
        System.out.print("nombre del producto electronico: ");
        String nombreElec = sc.nextLine();
        System.out.print("precio del producto (solo el numero) : ");
        double precioElec = sc.nextDouble(); sc.nextLine();
        System.out.print("marca del producto: ");
        String marca = sc.nextLine();
        supermercado.setElectronico(new electronica(nombreElec, precioElec, marca));


        System.out.println("\nIngrese datos de la ropa:");
        System.out.print("nombre de la prenda: ");
        String nombreRopa = sc.nextLine();
        System.out.print("precio (solo el numero): ");
        double precioRopa = sc.nextDouble(); sc.nextLine();
        System.out.print("talla (solo el numero): ");
        String talla = sc.nextLine();
        supermercado.setRopa(new ropa(nombreRopa, precioRopa, talla));


        System.out.println("\ningrese datos del alimento:");
        System.out.print("nombre del alimento: ");
        String nombreAli = sc.nextLine();
        System.out.print("precio del producto: ");
        double precioAli = sc.nextDouble(); sc.nextLine();
        System.out.print("fecha de caducidad (dia/mes/año): ");
        String fecha = sc.nextLine();
        supermercado.setAlimento(new alimento(nombreAli, precioAli, fecha));

 
        supermercado.mostrarProductos();


    }
}