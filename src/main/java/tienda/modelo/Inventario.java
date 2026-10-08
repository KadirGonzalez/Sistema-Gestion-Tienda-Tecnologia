package tienda.modelo;

import java.util.Map;

public class Inventario {

    private Map<Producto, Integer> stock;

    public void agregarStock(Producto p, int cantidad) {
    }

    public boolean descontarStock(Producto p, int cantidad) {
        return false;
    }

    public int consultarStock(Producto p) {
        return 0;
    }
}
