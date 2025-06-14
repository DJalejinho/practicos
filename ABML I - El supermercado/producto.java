package ABML1;

public abstract class producto {
     String Nombre;
     double Precio;

    public producto(String vNombre, double vPrecio) {
        Nombre = vNombre;
        Precio = vPrecio;
    }

    public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double Precio) {
		this.Precio = Precio;
	}

	
	
	public abstract void mostrarInformacion();
}