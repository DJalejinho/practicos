package ABML1;

public class electronica extends producto {
    private String marca;

    public electronica(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("electronica: " + Nombre + " | precio: " + Precio + " | marca: " + marca);
    }
}