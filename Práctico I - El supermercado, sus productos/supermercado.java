package pr1;

public class supermercado {
    private electronica electronico;
    private ropa ropa;
    private alimento alimento;

    public void setElectronico(electronica electronico) {
        this.electronico = electronico;
    }

    public void setRopa(ropa ropa) {
        this.ropa = ropa;
    }

    public void setAlimento(alimento alimento) {
        this.alimento = alimento;
    }

    public void mostrarProductos() {
        System.out.println("\n --Productos en el supermercado--");
        if (electronico != null) electronico.mostrarInformacion();
        if (ropa != null) ropa.mostrarInformacion();
        if (alimento != null) alimento.mostrarInformacion();
    }
}