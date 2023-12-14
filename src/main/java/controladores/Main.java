package controladores;

import java.util.List;

import daos.Rel_Vajilla_Reserva;
import daos.Reserva;
import daos.Vajilla;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import servicios.VajillaCrud;
import servicios.VajillaImpl;
import util.Utilidades;

/**
 * Clase controladora principal
 */
public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		Vajilla ejemplo1 = new Vajilla("ten1edor","descripcion",1);
		Reserva reser = new Reserva("hoy");
		Rel_Vajilla_Reserva asd = new Rel_Vajilla_Reserva(ejemplo1,reser,1);
		
		
		VajillaCrud crudVajilla = new VajillaCrud();
		VajillaImpl utilesVajilla = new VajillaImpl();
		
		boolean cerrar = false;
		
		do {
			Vajilla v1 = new Vajilla();
			Utilidades.menuPrincipal();
			System.out.print("Seleccione una opcion:");
			int Opcion = Utilidades.capturaOpcion();
			
			switch (Opcion) {
			case 1:
				try {
					utilesVajilla.pideVajilla(v1);
					
					crudVajilla.InsertarVajilla(em, v1);
				}catch (Exception e) {
					System.out.println("Error-[servicios.VajillaImpl.pideVajilla]-no se han podido capturar los datos");
				}
				break;
				
			case 2:
				try {
					
					crudVajilla.EliminarVajilla(utilesVajilla.pideVajillaEliminar(), em);
				}catch (Exception e) {
					System.out.println("error al eliminar");
				}
				break;
			case 4:
				List<Vajilla>listaVajilla = crudVajilla.SelectAllVajilla(em);
				utilesVajilla.imprimeListaVajilla(listaVajilla);
				break;
			}
			
		}while(!cerrar);
		em.close();
		emf.close();
		
		
		
		
		
		
		
	}

}
