package pr4;





public abstract class ObraArte {
    protected String titulo;
    protected String autor;
    protected int anio;

    public ObraArte(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public abstract void mostrarInfo();
}
