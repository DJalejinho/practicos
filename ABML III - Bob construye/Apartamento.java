package ActividadConstructora;

public class Apartamento extends Edificio {
	private String block;
	private boolean piscina;
	public Apartamento(String material, String direccion, int ventanas, String block, boolean piscina) {
		super(material, direccion, ventanas);
		this.block = block;
		this.piscina = piscina;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	
}	
