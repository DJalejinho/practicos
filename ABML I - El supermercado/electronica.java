package ABML1;

public class electronica extends producto {
    private String marca;

    public electronica(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
    public void mostrarInformacion() {
        System.out.println("electronica: " + Nombre + " | precio: " + Precio + " | marca: " + marca);
    }
}