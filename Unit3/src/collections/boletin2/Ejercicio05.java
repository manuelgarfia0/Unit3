package collections.boletin2;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> series = new HashMap<>();
		int opcion;

		do {
			System.out.println("\n--- MENÚ DE SERIES TV ---");
			System.out.println("1. Agregar serie");
			System.out.println("2. Buscar serie");
			System.out.println("3. Eliminar serie");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			switch (opcion) {
			case 1: // Agregar serie
				System.out.print("Introduce el nombre de la serie: ");
				String nombreSerie = sc.nextLine();
				System.out.print("Introduce la valoración (0-10): ");
				double valoracion = sc.nextDouble();
				sc.nextLine(); // limpiar buffer
				series.put(nombreSerie, valoracion);
				System.out.println("Serie agregada correctamente.");
				break;

			case 2: // Buscar serie
				System.out.print("Introduce el nombre de la serie a buscar: ");
				String buscarSerie = sc.nextLine();
				if (series.containsKey(buscarSerie)) {
					System.out.println("Valoración de " + buscarSerie + ": " + series.get(buscarSerie));
				} else {
					System.out.println("La serie no se encuentra en el sistema.");
				}
				break;

			case 3: // Eliminar serie
				System.out.print("Introduce el nombre de la serie a eliminar: ");
				String eliminarSerie = sc.nextLine();
				if (series.containsKey(eliminarSerie)) {
					series.remove(eliminarSerie);
					System.out.println("Serie eliminada correctamente.");
				} else {
					System.out.println("La serie no se encuentra en el sistema.");
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