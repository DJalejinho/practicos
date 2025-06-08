package pr3;

public abstract class Edificio {
    protected String direccion;
    protected int pisos;

    public Edificio(String direccion, int pisos) {
        this.direccion = direccion;
        this.pisos = pisos;
    }

    public abstract void mostrarInformacion();
}