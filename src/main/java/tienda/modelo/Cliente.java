package tienda.modelo;

import java.util.List;

public class Cliente {

    private int idCliente;
    private String nombre;
    private String correo;
    private String telefono;
    private Usuario usuario;

    public String getNombre() {
        return nombre;
    }

    public List<Venta> getHistorialCompras() {
        return null;
    }
}
