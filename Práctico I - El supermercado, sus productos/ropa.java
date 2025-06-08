package pr1;

public class ropa extends producto {
    private String talla;

    public ropa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("ropa: " + nombre + " | precio:" + precio + " | talla: " + talla);
    }
}