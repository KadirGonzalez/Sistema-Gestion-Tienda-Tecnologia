package tienda.modelo;

import java.time.LocalDate;
import java.util.Map;

public class Venta {

    private int idVenta;
    private LocalDate fecha;
    private Cliente cliente;
    private Empleado empleado;
    private Map<Producto, Integer> productos;
    private double total;

    public void agregarProducto(Producto p, int cantidad) {
    }

    public double calcularTotal() {
        return total;
    }

    public void registrarPago() {
    }
}
