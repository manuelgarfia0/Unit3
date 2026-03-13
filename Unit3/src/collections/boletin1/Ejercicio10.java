package collections.boletin1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> productos = new HashMap<>();
		int opcion;

		do {
			System.out.println("\n--- PRODUCTOS ---");
			System.out.println("1. Alta de producto");
			System.out.println("2. Baja de producto");
			System.out.println("4. Listar existencias");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			switch (opcion) {
			case 1: // Alta
				System.out.print("Introduce nombre del producto: ");
				String nombre = sc.nextLine();
				if (productos.containsKey(nombre)) {
					System.out.println("El producto ya existe. Actualizando precio.");
				}
				System.out.print("Introduce precio: ");
				double precio = sc.nextDouble();
				sc.nextLine(); // limpiar buffer
				productos.put(nombre, precio);
				System.out.println("Producto dado de alta correctamente.");
				break;

			case 2: // Baja
				System.out.print("Introduce nombre del producto a eliminar: ");
				String eliminar = sc.nextLine();
				if (productos.containsKey(eliminar)) {
					productos.remove(eliminar);
					System.out.println("Producto eliminado correctamente.");
				} else {
					System.out.println("El producto no existe.");
				}
				break;

			case 4: // Listar existencias
				if (productos.isEmpty()) {
					System.out.println("No hay productos registrados.");
				} else {
					System.out.println("Listado de productos y precios:");
					for (String prod : productos.keySet()) {
						System.out.println(prod + " → " + productos.get(prod));
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