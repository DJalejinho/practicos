package ABML1;

public class alimento extends producto {
    private String fechaCaducidad;

    public alimento(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
    public void mostrarInformacion() {
        System.out.println("Alimento: " + Nombre + " | Precio: $" + Precio + " | Caducidad: " + fechaCaducidad);
    }
}