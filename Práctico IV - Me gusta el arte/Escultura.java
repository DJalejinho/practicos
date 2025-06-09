package pr4;

public class Escultura extends ObraArte {
    private String material;

    public Escultura(String titulo, String autor, int anio, String material) {
        super(titulo, autor, anio);
        this.material = material;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Escultura:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Material: " + material);
    }
}