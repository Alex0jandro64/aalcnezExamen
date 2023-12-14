package daos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva", schema = "esqexados")
public class Reserva {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reserva", nullable = false)
	private int idReserva;

	@Column(name = "fecha_reserva")
	private String fechaReserva="aaaaa";

	@OneToMany(mappedBy = "reserva")
	List<Rel_Vajilla_Reserva> rels_vajillas_reservas;

	// Constructores
	public Reserva(String fechaReserva) {
		super();
		this.fechaReserva = fechaReserva;
	}

	public Reserva() {
		super();
	}

	// Getters y Setters

}
