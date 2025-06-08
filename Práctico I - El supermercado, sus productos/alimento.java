package pr1;

public class alimento extends producto {
    private String fechaCaducidad;

    public alimento(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Alimento: " + nombre + " | Precio: $" + precio + " | Caducidad: " + fechaCaducidad);
    }
}