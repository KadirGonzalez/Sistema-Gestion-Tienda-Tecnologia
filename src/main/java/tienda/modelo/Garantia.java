package tienda.modelo;

import java.time.LocalDate;

public class Garantia {

    private int idGarantia;
    private Producto producto;
    private Factura factura;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public boolean estaVigente() {
        return false;
    }
}
