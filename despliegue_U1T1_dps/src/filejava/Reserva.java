package filejava;

import java.util.Objects;

/**
 * La clase Reserva representa una reserva de un libro realizada por un usuario,
 * con informacion sobre el usuario que hizo la reserva, la fecha de reserva y
 * la fecha de devolución estimada.
 * 
 * @author Daniel Perez Serrano
 * @version 1.0
 */
public class Reserva {
    private String usuario; // Nombre del usuario que hizo la reserva.
    private String fechaReserva; // Fecha en que se realizo la reserva.
    private String fechaDevolucion; // Fecha estimada de devolucion.

    /**
     * Constructor predeterminado de la clase Reserva.
     */
    public Reserva() {
    }

    /**
     * Constructor parametrizado que inicializa un objeto Reserva con los valores
     * especificados.
     *
     * @param usuario         El nombre del usuario que hizo la reserva.
     * @param fechaReserva    La fecha en que se realizo la reserva.
     * @param fechaDevolucion La fecha estimada de devolucion.
     */
    public Reserva(String usuario, String fechaReserva, String fechaDevolucion) {
        setUsuario(usuario);
        setFechaReserva(fechaReserva);
        setFechaDevolucion(fechaDevolucion);
    }

    /**
     * Establece el nombre del usuario que hizo la reserva.
     *
     * @param usuario El nombre del usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Establece la fecha en que se realizo la reserva.
     *
     * @param fechaReserva La fecha de reserva.
     */
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Establece la fecha estimada de devolucion.
     *
     * @param fechaDevolucion La fecha estimada de devolucion.
     */
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Obtiene el nombre del usuario que hizo la reserva.
     *
     * @return El nombre del usuario.
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Obtiene la fecha en que se realizo la reserva.
     *
     * @return La fecha de reserva.
     */
    public String getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Obtiene la fecha estimada de devolucion.
     *
     * @return La fecha estimada de devolucion.
     */
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Calcula el valor hash del objeto Reserva.
     *
     * @return El valor hash del objeto Reserva.
     */
    @Override
    public int hashCode() {
        return Objects.hash(fechaDevolucion, fechaReserva, usuario);
    }

    /**
     * Compara dos objetos Reserva para determinar si son iguales.
     *
     * @param obj El objeto a comparar con el objeto actual.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Reserva other = (Reserva) obj;
        return Objects.equals(fechaDevolucion, other.fechaDevolucion)
                && Objects.equals(fechaReserva, other.fechaReserva)
                && Objects.equals(usuario, other.usuario);
    }

    /**
     * Devuelve una representación de cadena del objeto Reserva.
     *
     * @return Una cadena que representa el objeto Reserva, incluyendo el nombre del
     *         usuario, la fecha de reserva
     *         y la fecha estimada de devolucion.
     */
    @Override
    public String toString() {
        return "Reserva [usuario=" + usuario + ", fechaReserva=" + fechaReserva + ", fechaDevolucion=" + fechaDevolucion
                + "]";
    }
}
