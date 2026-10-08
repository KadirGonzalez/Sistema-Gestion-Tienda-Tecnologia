package tienda.modelo;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private int mesesGarantia;
    private Categoria categoria;
    private Proveedor proveedor;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
