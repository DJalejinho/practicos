package pr4;

public class Fotografia extends ObraArte {


    public Fotografia(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Fotografía:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);

    }
}