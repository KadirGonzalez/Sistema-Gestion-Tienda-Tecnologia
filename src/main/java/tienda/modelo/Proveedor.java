package tienda.modelo;

import java.util.List;

public class Proveedor {

    private int idProveedor;
    private String nombre;
    private String telefono;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductosSuministrados() {
        return null;
    }
}
