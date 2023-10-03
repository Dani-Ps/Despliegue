// Clase Reserva
/**
 * Clase Reserva - Representa una reserva de un libro en la biblioteca.
 * @version 1.0
 * @author Daniel Perez Serrano
 */
class Reserva {
  /**
   * Crea una instancia de Reserva.
   * @param {string} usuario - El nombre del usuario que hizo la reserva.
   * @param {string} fechaReserva - La fecha en que se realizó la reserva.
   * @param {string} fechaDevolucion - La fecha estimada de devolución.
   */
  constructor(usuario, fechaReserva, fechaDevolucion) {
    this.usuario = usuario;
    this.fechaReserva = fechaReserva;
    this.fechaDevolucion = fechaDevolucion;
  }

  /**
   * Obtiene el nombre del usuario que hizo la reserva.
   * @returns {string} - El nombre del usuario.
   */
  getUsuario() {
    return this.usuario;
  }

  /**
   * Obtiene la fecha en que se realizó la reserva.
   * @returns {string} - La fecha de reserva.
   */
  getFechaReserva() {
    return this.fechaReserva;
  }

  /**
   * Obtiene la fecha estimada de devolución.
   * @returns {string} - La fecha estimada de devolución.
   */
  getFechaDevolucion() {
    return this.fechaDevolucion;
  }

  /**
   * Devuelve una representación de cadena del objeto Reserva.
   * @returns {string} - Una cadena que representa el objeto Reserva.
   */
  toString() {
    return `Reserva [usuario=${this.usuario}, fechaReserva=${this.fechaReserva}, fechaDevolucion=${this.fechaDevolucion}]`;
  }
}

module.exports = Reserva;
