package daos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 * Clase de la relacion entre vajilla y reserva 
 */
@Entity
@Table(name = "rel_vajilla_reserva", schema = "esqexados")
public class Rel_Vajilla_Reserva {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rel_vajilla_reserva", nullable = false)
	private int idRelVajillaReserva;

	@ManyToOne
	private Vajilla vajilla;

	@ManyToOne
	private Reserva reserva;

	@Column(name = "cantidad")
	private int cantidadVajillaReserva = 0;

	// Constructores
	public Rel_Vajilla_Reserva(Vajilla vajilla, Reserva reserva, int cantidadVajillaReserva) {
		super();
		this.vajilla = vajilla;
		this.reserva = reserva;
		this.cantidadVajillaReserva = cantidadVajillaReserva;
	}

	public Rel_Vajilla_Reserva() {
		super();
	}

	// Getters y Setters

}
