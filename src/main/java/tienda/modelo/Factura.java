package tienda.modelo;

import java.time.LocalDate;

public class Factura {

    private String numero;
    private LocalDate fecha;
    private Venta venta;
    private double total;

    public void generar() {
    }

    public double getTotal() {
        return total;
    }
}
