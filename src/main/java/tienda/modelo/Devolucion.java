package tienda.modelo;

import java.time.LocalDate;

public class Devolucion {

    private int idDevolucion;
    private Venta venta;
    private Producto producto;
    private int cantidad;
    private String motivo;
    private LocalDate fecha;

    public void procesar(Inventario inventario) {
    }
}
