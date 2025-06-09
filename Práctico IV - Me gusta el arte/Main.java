package pr4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("ingrese los datos de la Pintura:");
        System.out.print("titulo: ");
        String tituloP = sc.nextLine();
        System.out.print("autor: ");
        String autorP = sc.nextLine();
        System.out.print("año: ");
        int anioP = sc.nextInt();
        sc.nextLine(); 
        Pintura pintura = new Pintura(tituloP, autorP, anioP);

      
        System.out.println("ingrese los datos de la Escultura:");
        System.out.print("titulo: ");
        String tituloE = sc.nextLine();
        System.out.print("autor: ");
        String autorE = sc.nextLine();
        System.out.print("año: ");
        int anioE = sc.nextInt();
        sc.nextLine();
        System.out.print("material: ");
        String material = sc.nextLine();
        Escultura escultura = new Escultura(tituloE, autorE, anioE, material);

      
        System.out.println("ingrese los datos de la fotografia:");
        System.out.print("titulo: ");
        String tituloF = sc.nextLine();
        System.out.print("autor: ");
        String autorF = sc.nextLine();
        System.out.print("año: ");
        int anioF = sc.nextInt();
        sc.nextLine();
        Fotografia fotografia = new Fotografia(tituloF, autorF, anioF);

        System.out.println("Información de las Obras de Arte ");
        pintura.mostrarInfo();
        System.out.println();
        escultura.mostrarInfo();
        System.out.println();
        fotografia.mostrarInfo();

    }
}