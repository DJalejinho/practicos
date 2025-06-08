package pr3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese los datos de la Casa:");
        System.out.print("Direccion: ");
        String direccionCasa = scanner.nextLine();
        System.out.print("Numero de pisos: ");
        int pisosCasa = scanner.nextInt();
        System.out.print("¿Tiene jardin? (true/false): ");
        boolean tieneJardin = scanner.nextBoolean();
        scanner.nextLine();


        System.out.println("Ingrese los datos del Apartamento: ");
        System.out.print("Dirección: ");
        String direccionApto = scanner.nextLine();
        System.out.print("Numero de pisos: ");
        int pisosApto = scanner.nextInt();
        System.out.print("Numero de apartamento: ");
        int numeroApto = scanner.nextInt();


        Casa casa = new Casa(direccionCasa, pisosCasa, tieneJardin);
        Apartamento apartamento = new Apartamento(direccionApto, pisosApto, numeroApto);


        System.out.println("Informacion Ingresada: ");
        casa.mostrarInformacion();
        apartamento.mostrarInformacion();

        
    }
}