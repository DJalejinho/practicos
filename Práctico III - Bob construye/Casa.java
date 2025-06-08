package pr3;

public class Casa extends Edificio {
    private boolean tieneJardin;

    public Casa(String direccion, int pisos, boolean tieneJardin) {
        super(direccion, pisos);
        this.tieneJardin = tieneJardin;
    }

    @Override
    public void mostrarInformacion() {
        System.out.print("Casa:");
        System.out.print("Dirección: " + direccion);
        System.out.print("Pisos: " + pisos);
        System.out.print("¿Tiene jardín? " + (tieneJardin ? "Sí" : "No"));
        System.out.println();
    }
}
