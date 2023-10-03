// Clase Libro
/**
 * Clase Libro - Representa un libro en la biblioteca.
 * @version 1.0
 * @author Daniel Perez Serrano
 */
class Libro {
  /**
   * Crea una instancia de Libro.
   * @param {string} titulo - El título del libro.
   * @param {string} autor - El autor del libro.
   * @param {string} ISBN - El ISBN del libro.
   * @param {string} estado - El estado de disponibilidad del libro (disponible o reservado).
   */
  constructor(titulo, autor, ISBN, estado) {
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.estado = estado;
  }

  /**
   * Obtiene el título del libro.
   * @returns {string} - El título del libro.
   */
  getTitulo() {
    return this.titulo;
  }

  /**
   * Obtiene el autor del libro.
   * @returns {string} - El autor del libro.
   */
  getAutor() {
    return this.autor;
  }

  /**
   * Obtiene el ISBN del libro.
   * @returns {string} - El ISBN del libro.
   */
  getISBN() {
    return this.ISBN;
  }

  /**
   * Obtiene el estado de disponibilidad del libro.
   * @returns {string} - El estado de disponibilidad del libro (disponible o reservado).
   */
  getEstado() {
    return this.estado;
  }

  /**
   * Devuelve una representación de cadena del objeto Libro.
   * @returns {string} - Una cadena que representa el objeto Libro.
   */
  toString() {
    return `Libro [titulo=${this.titulo}, autor=${this.autor}, ISBN=${this.ISBN}, estado=${this.estado}]`;
  }
}

module.exports = Libro;
