package util;

import java.util.List;
import java.util.Scanner;

import daos.Vajilla;

/**
 * Clase con metodos de utilidades
 */
public class Utilidades {

	/**
	 * Imprime el menu principal
	 */
	public static void menuPrincipal() {
		System.out.println("1.-Crear Vajilla");
		System.out.println("2.-Eliminar Vajilla");
		System.out.println("3.-Modificar Cantidad");
		System.out.println("4.-Mostrar Stock");
		System.out.println("5.-Crear Reserva");
	}
	
	public static int capturaOpcion() {
		int opcion=0;
		Scanner leer = new Scanner(System.in);
		try {
			opcion = leer.nextInt();
		}catch (Exception e) {
			System.out.println("Error-[Util.Utilidades.capturaOpcion]-No es un numero");
		}return opcion;
		
	}
	
}
