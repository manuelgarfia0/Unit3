package collections.boletin2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, ArrayList<String>> tareas = new HashMap<>();
		int opcion;

		do {
			System.out.println("\n--- GESTIÓN DE TAREAS ---");
			System.out.println("1. Añadir tarea");
			System.out.println("2. Eliminar tarea");
			System.out.println("3. Listar tareas por categoría");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			switch (opcion) {
			case 1: // Añadir tarea
				System.out.print("Introduce la categoría: ");
				String categoriaAñadir = sc.nextLine();
				System.out.print("Introduce la tarea: ");
				String tarea = sc.nextLine();

				// Crear lista si la categoría no existe
				tareas.putIfAbsent(categoriaAñadir, new ArrayList<>());

				// Añadir la tarea
				tareas.get(categoriaAñadir).add(tarea);
				System.out.println("Tarea añadida correctamente.");
				break;

			case 2: // Eliminar tarea
				System.out.print("Introduce la categoría: ");
				String categoriaEliminar = sc.nextLine();
				if (tareas.containsKey(categoriaEliminar)) {
					ArrayList<String> listaTareas = tareas.get(categoriaEliminar);
					if (listaTareas.isEmpty()) {
						System.out.println("No hay tareas en esta categoría.");
					} else {
						System.out.println("Tareas actuales: " + listaTareas);
						System.out.print("Introduce la tarea a eliminar: ");
						String tareaEliminar = sc.nextLine();
						if (listaTareas.remove(tareaEliminar)) {
							System.out.println("Tarea eliminada correctamente.");
						} else {
							System.out.println("La tarea no se encuentra en la lista.");
						}
					}
				} else {
					System.out.println("La categoría no existe.");
				}
				break;

			case 3: // Listar tareas
				if (tareas.isEmpty()) {
					System.out.println("No hay tareas registradas.");
				} else {
					System.out.println("\nTareas por categoría:");
					for (String cat : tareas.keySet()) {
						System.out.println(cat + ": " + tareas.get(cat));
					}
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