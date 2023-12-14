package daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Clase vajillas
 */
@Entity
@Table(name = "vajillas", schema = "esqexados")
public class Vajilla {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vajilla", nullable = false)
	private int idVajilla;

	@Column(name = "nombre_elemento")
	private String nombreElemento = "aaaaa";

	@Column(name = "descripcion_elemento")
	private String descripcionElemento = "aaaaa";

	@Column(name = "catidad_elemento")
	private int cantidadElemento = 0;

	@Column(name = "codigo_elemento")
	private String codigoElemento = "aaaaa";

	@OneToMany(mappedBy = "vajilla")
	List<Rel_Vajilla_Reserva> rels_vajillas_reservas;

	// Constructor
	public Vajilla(String nombreElemento, String descripcionElemento, int cantidadElemento) {
		super();
		this.nombreElemento = nombreElemento;
		this.descripcionElemento = descripcionElemento;
		this.cantidadElemento = cantidadElemento;
	}

	public Vajilla() {
		super();
	}

	// Getters y Setters
	public void setNombreElemento(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}

	public void setDescripcionElemento(String descripcionElemento) {
		this.descripcionElemento = descripcionElemento;
	}

	public void setCantidadElemento(int cantidadElemento) {
		this.cantidadElemento = cantidadElemento;
	}

	public String getCodigoElemento() {
		return codigoElemento;
	}

	public void setCodigoElemento() {
		this.codigoElemento = this.nombreElemento+this.descripcionElemento;
	}

	public String getNombreElemento() {
		return nombreElemento;
	}

	public String getDescripcionElemento() {
		return descripcionElemento;
	}

	public int getCantidadElemento() {
		return cantidadElemento;
	}
	
	


}
