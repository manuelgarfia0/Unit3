package collections.boletin1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> diccionario = new TreeMap<>();

		// Diccionario inicial con 20 palabras
		diccionario.put("casa", "house");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("libro", "book");
		diccionario.put("escuela", "school");
		diccionario.put("amigo", "friend");
		diccionario.put("agua", "water");
		diccionario.put("comida", "food");
		diccionario.put("mesa", "table");
		diccionario.put("silla", "chair");
		diccionario.put("sol", "sun");
		diccionario.put("luna", "moon");
		diccionario.put("coche", "car");
		diccionario.put("ciudad", "city");
		diccionario.put("árbol", "tree");
		diccionario.put("flor", "flower");
		diccionario.put("reloj", "clock");
		diccionario.put("zapato", "shoe");
		diccionario.put("camisa", "shirt");
		diccionario.put("ventana", "window");

		int opcion = 0;

		do {
			System.out.println("\n--- Mini Diccionario Español-Inglés ---");
			System.out.println("1. Insertar palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			switch (opcion) {
			case 1:
				System.out.print("Introduce palabra en español: ");
				String esp = sc.nextLine().toLowerCase();
				System.out.print("Introduce traducción al inglés: ");
				String ing = sc.nextLine().toLowerCase();
				diccionario.put(esp, ing);
				System.out.println("Palabra añadida correctamente.");
				break;

			case 2:
				System.out.print("Introduce palabra en español a buscar: ");
				String buscar = sc.nextLine().toLowerCase();
				if (diccionario.containsKey(buscar)) {
					System.out.println("Traducción: " + diccionario.get(buscar));
				} else {
					System.out.println("La palabra no existe en el diccionario.");
				}
				break;

			case 3:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}

		} while (opcion != 3);

		sc.close();
	}
}