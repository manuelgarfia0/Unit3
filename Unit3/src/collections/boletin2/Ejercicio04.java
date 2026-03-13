package collections.boletin2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaNombres = new ArrayList<>();
		int opcion;

		do {
			System.out.println("\n--- MENÚ ---");
			System.out.println("1. Añadir nuevo nombre");
			System.out.println("2. Eliminar nombre");
			System.out.println("3. Ordenar lista alfabéticamente");
			System.out.println("4. Buscar nombre");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			switch (opcion) {
			case 1: // Añadir
				System.out.print("Introduce el nombre a añadir: ");
				String nombreAñadir = sc.nextLine();
				listaNombres.add(nombreAñadir);
				System.out.println("Nombre añadido correctamente.");
				break;

			case 2: // Eliminar
				System.out.print("Introduce el nombre a eliminar: ");
				String nombreEliminar = sc.nextLine();
				if (listaNombres.remove(nombreEliminar)) {
					System.out.println("Nombre eliminado correctamente.");
				} else {
					System.out.println("El nombre no se encuentra en la lista.");
				}
				break;

			case 3: // Ordenar
				Collections.sort(listaNombres);
				System.out.println("Lista ordenada alfabéticamente:");
				System.out.println(listaNombres);
				break;

			case 4: // Buscar
				System.out.print("Introduce el nombre a buscar: ");
				String nombreBuscar = sc.nextLine();
				if (listaNombres.contains(nombreBuscar)) {
					System.out.println("El nombre sí está en la lista.");
				} else {
					System.out.println("El nombre no está en la lista.");
				}
				break;

			case 0:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

		} while (opcion != 0);

		sc.close();
	}
}