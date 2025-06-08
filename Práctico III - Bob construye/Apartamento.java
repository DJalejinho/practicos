package pr3;

public class Apartamento extends Edificio {
    private int numero;

    public Apartamento(String direccion, int pisos, int numero) {
        super(direccion, pisos);
        this.numero = numero;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Apartamento:");
        System.out.println("Dirección: " + direccion);
        System.out.println("Pisos: " + pisos);
        System.out.println("Número de apartamento: " + numero);
        System.out.println();
    }
}