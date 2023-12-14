package servicios;

import java.util.List;

import daos.Vajilla;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

/**
 * Clase con los metodos de crud de Vajilla
 */
public class VajillaCrud {

	/**
	 * Metodo que inserta un objeto vajilla en la base de datos
	 * @param em
	 * @param vajilla
	 */
	public void InsertarVajilla(EntityManager em, Vajilla vajilla) {
		try {
			
		em.getTransaction().begin();
		em.persist(vajilla);
		em.getTransaction().commit();
		System.out.println("Vajilla Insertada Correctamente");
		}catch (Exception e) {
			System.out.println("Error-[servicios.VajillaCrud.InsertarVajilla]-No se a podido insertar");
		}
	}
	
	/**
	 * Metodo que elimina un objeto de la base de datos
	 * @param em
	 * @param vajilla
	 */
	public void EliminarVajilla(int id_vajilla, EntityManager em) {
		try {
			em.getTransaction().begin();
			Vajilla vajilla=em.find(Vajilla.class, id_vajilla);
			em.remove(vajilla);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("No se a podido eliminar la vajilla");
		}
		
	}
	
	/**
	 * Metodo que muestra todas las vajillas
	 * @param em
	 * @return
	 */
	public List<Vajilla> SelectAllVajilla(EntityManager em) {
		List<Vajilla> listaUsuarios = null;
		try {
			Query query=em.createQuery("SELECT a FROM Vajilla a", Vajilla.class);
			listaUsuarios=query.getResultList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}
	
	
	
	
}
