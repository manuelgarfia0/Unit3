package collections.boletin2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, TreeSet<String>> mapa = new HashMap<>();
		String palabra;

		System.out.println("Introduce palabras (escribe 'fin' para terminar):");

		while (true) {
			palabra = sc.nextLine();
			if (palabra.equalsIgnoreCase("fin")) {
				break;
			}

			int longitud = palabra.length();

			// Si no existe la clave, crear un TreeSet nuevo
			mapa.putIfAbsent(longitud, new TreeSet<>());

			// Añadir palabra al conjunto correspondiente
			mapa.get(longitud).add(palabra);
		}

		// Mostrar resultados
		System.out.println("\nClasificación de palabras por longitud:");
		for (Integer clave : mapa.keySet()) {
			System.out.println("Longitud " + clave + ": " + mapa.get(clave));
		}

		sc.close();
	}
}