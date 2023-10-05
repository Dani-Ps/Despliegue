package filejava;

import java.util.Objects;

/**
 * La clase Libro representa un libro con informacion sobre su titulo, autor,
 * ISBN y estado de disponibilidad.
 * 
 * @author Daniel Perez Serrano
 * @version 1.0
 */
public class Libro {

    // Variables de instancia que almacenan informacion sobre el libro.

    private String titulo;
    private String autor;
    private String ISBN;
    private Estado estado;

    /**
     * Enumeración que representa los posibles estados de disponibilidad de un
     * libro.
     * Esta enumeración define dos estados: disponible y reservado.
     */
    public enum Estado {
        /**
         * Representa el estado cuando el libro está disponible para ser prestado.
         */
        disponible,

        /**
         * Representa el estado cuando el libro está reservado y no está disponible para
         * ser prestado.
         */
        reservado
    }

    /**
     * Constructor predeterminado de la clase Libro.
     */
    public Libro() {
    }

    /**
     * Constructor parametrizado que inicializa un objeto Libro con los valores
     * especificados.
     *
     * @param titulo El titulo del libro.
     * @param autor  El autor del libro.
     * @param iSBN   El ISBN (Número de Identificación de Libro Estandar) del libro.
     * @param estado El estado de disponibilidad del libro (disponible o reservado).
     */
    public Libro(String titulo, String autor, String iSBN, Estado estado) {
        setTitulo(titulo);
        setAutor(autor);
        setISBN(iSBN);
        setEstado(estado);
    }

    /**
     * Obtiene el titulo del libro.
     *
     * @return El titulo del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el titulo del libro.
     *
     * @param titulo El titulo del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor El autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el ISBN del libro.
     *
     * @return El ISBN del libro.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Establece el ISBN del libro.
     *
     * @param iSBN El ISBN del libro.
     */
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    /**
     * Obtiene el estado de disponibilidad del libro.
     *
     * @return El estado de disponibilidad del libro (disponible o reservado).
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Establece el estado de disponibilidad del libro.
     *
     * @param estado El estado de disponibilidad del libro (disponible o reservado).
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Calcula el valor hash del objeto Libro.
     *
     * @return El valor hash del objeto Libro.
     */
    @Override
    public int hashCode() {
        return Objects.hash(ISBN, autor, estado, titulo);
    }

    /**
     * Compara dos objetos Libro para determinar si son iguales.
     *
     * @param obj El objeto a comparar con el objeto actual.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {

        Libro other = (Libro) obj;
        return Objects.equals(ISBN, other.ISBN) && Objects.equals(autor, other.autor) && estado == other.estado
                && Objects.equals(titulo, other.titulo);
    }

    /**
     * Devuelve una representacion de cadena del objeto Libro.
     *
     * @return Una cadena que representa el objeto Libro, incluyendo su titulo,
     *         autor, ISBN y estado.
     */
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", estado=" + estado + "]";
    }
}
