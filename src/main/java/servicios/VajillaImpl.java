package servicios;

import java.util.List;
import java.util.Scanner;

import daos.Vajilla;
import util.Utilidades;

/**
 * Clase que contiene los metodos relaciones con el objeto Vajilla
 */
public class VajillaImpl {

	/**
	 * Metodo que pide y captura los datos de un objeto vajilla y los devuelve
	 * 
	 * @return
	 */
	public void pideVajilla(Vajilla v1) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Nombre de la Vajilla:");
		String nombre = leer.nextLine();
		v1.setNombreElemento(nombre);

		System.out.println("Descripcion de la Vajilla:");
		String descripcion = leer.nextLine();
		;
		v1.setDescripcionElemento(descripcion);

		int cantidad = -1;
		do {
			System.out.println("Cantidad de la Vajilla:");
			cantidad = leer.nextInt();
			if (cantidad < 0) {
				System.out.println("no puede ser menor que 0 la cantidad");
			}
		} while (cantidad < 0);

		v1.setCantidadElemento(cantidad);
		v1.setCodigoElemento();

	}

	/**
	 * Metodo que imprime una lista de vajilla
	 * @param lista
	 */
	public void imprimeListaVajilla(List<Vajilla> lista) {
		for (Vajilla vajilla : lista) {
			System.out
					.println(vajilla.getCodigoElemento() +", "+ vajilla.getNombreElemento() +", "+ vajilla.getCantidadElemento());
		}
	}
	
	/**
	 * Metodo que pide un codigo de vajilla para el metodo de eliminar 
	 * @return
	 */
	public int pideVajillaEliminar() {
		
		System.out.print("Id de la vajilla a eliminar:");
		int id=Utilidades.capturaOpcion();
		return id;
		
	}
}
