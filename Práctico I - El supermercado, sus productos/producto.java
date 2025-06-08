package pr1;

public abstract class producto {
    protected String nombre;
    protected double precio;

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void mostrarInformacion();
}