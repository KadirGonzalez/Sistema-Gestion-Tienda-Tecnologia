package tienda.modelo;

public class Usuario {

    private int idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String rol;

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        return this.nombreUsuario.equals(nombreUsuario)
                && this.contrasena.equals(contrasena);
    }

    public boolean tienePermiso(String accion) {
        return true;
    }
}
