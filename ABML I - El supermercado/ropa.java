package ABML1;

public class ropa extends producto {
    private String talla;

    public ropa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Precio: $" + getPrecio() + ", Talla: " + talla;
    }

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		
	}

    }
 