package ActividadConstructora;

public class Casa extends Edificio{
	private int tamPatio, pisos;

	public Casa(String material, String direccion, int ventanas, int tamPatio,  int pisos) {
		super(material, direccion, ventanas);
		this.tamPatio = tamPatio;
		this.pisos=pisos;
	}

	public int getTamPatio() {
		return tamPatio;
	}

	public void setTamPatio(int tamPatio) {
		this.tamPatio = tamPatio;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	
}
