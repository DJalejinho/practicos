package pr4;

public class Pintura extends ObraArte {


    public Pintura(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pintura:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
    }
}