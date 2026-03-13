package collections.boletin2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, ArrayList<String>> libreta = new HashMap<>();
		int opcion;

		do {
			System.out.println("\n--- LIBRETA DE DIRECCIONES ---");
			System.out.println("1. Añadir persona");
			System.out.println("2. Añadir teléfono a persona");
			System.out.println("3. Mostrar teléfonos de una persona");
			System.out.println("4. Eliminar teléfono de una persona");
			System.out.println("5. Eliminar persona");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			switch (opcion) {
			case 1: // Añadir persona
				System.out.print("Introduce el nombre de la persona: ");
				String nombre = sc.nextLine();
				if (!libreta.containsKey(nombre)) {
					libreta.put(nombre, new ArrayList<>());
					System.out.println("Persona añadida correctamente.");
				} else {
					System.out.println("La persona ya existe en la libreta.");
				}
				break;

			case 2: // Añadir teléfono
				System.out.print("Introduce el nombre de la persona: ");
				String nombreTel = sc.nextLine();
				if (libreta.containsKey(nombreTel)) {
					System.out.print("Introduce el teléfono: ");
					String telefono = sc.nextLine();
					libreta.get(nombreTel).add(telefono);
					System.out.println("Teléfono añadido correctamente.");
				} else {
					System.out.println("La persona no existe en la libreta.");
				}
				break;

			case 3: // Mostrar teléfonos
				System.out.print("Introduce el nombre de la persona: ");
				String nombreMostrar = sc.nextLine();
				if (libreta.containsKey(nombreMostrar)) {
					ArrayList<String> telefonos = libreta.get(nombreMostrar);
					if (telefonos.isEmpty()) {
						System.out.println("La persona no tiene teléfonos registrados.");
					} else {
						System.out.println("Teléfonos de " + nombreMostrar + ": " + telefonos);
					}
				} else {
					System.out.println("La persona no existe en la libreta.");
				}
				break;

			case 4: // Eliminar teléfono
				System.out.print("Introduce el nombre de la persona: ");
				String nombreEliminarTel = sc.nextLine();
				if (libreta.containsKey(nombreEliminarTel)) {
					ArrayList<String> telefonos = libreta.get(nombreEliminarTel);
					if (telefonos.isEmpty()) {
						System.out.println("La persona no tiene teléfonos registrados.");
					} else {
						System.out.println("Teléfonos actuales: " + telefonos);
						System.out.print("Introduce el teléfono a eliminar: ");
						String telEliminar = sc.nextLine();
						if (telefonos.remove(telEliminar)) {
							System.out.println("Teléfono eliminado correctamente.");
						} else {
							System.out.println("El teléfono no se encuentra en la lista.");
						}
					}
				} else {
					System.out.println("La persona no existe en la libreta.");
				}
				break;

			case 5: // Eliminar persona
				System.out.print("Introduce el nombre de la persona a eliminar: ");
				String nombreEliminar = sc.nextLine();
				if (libreta.remove(nombreEliminar) != null) {
					System.out.println("Persona eliminada correctamente.");
				} else {
					System.out.println("La persona no existe en la libreta.");
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