package ABML1;

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
//aca tambien pedi ayuda de como mostrar las cosas porque no tenia idea eso de != null, o no se si lo dimos no me acuerdo
    public void mostrarProductos() {
        System.out.println("\n --Productos en el supermercado--");
        if (electronico != null) electronico.mostrarInformacion();
        if (ropa != null) ropa.mostrarInformacion();
        if (alimento != null) alimento.mostrarInformacion();
    }
}
