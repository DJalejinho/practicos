package ActividadConstructora;

public class Edificio {
	private String material,direccion;
	private int ventanas;
	public Edificio(String material, String direccion, int ventanas) {
		this.material = material;
		this.direccion = direccion;
		this.ventanas = ventanas;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getVentanas() {
		return ventanas;
	}
	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}
	
	
}
