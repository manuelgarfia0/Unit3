package collections.boletin1;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		System.out.println("Introduce los 5 números del sorteo (1-50):");
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			// Actualizar contador
			if (numeros.containsKey(num)) {
				numeros.put(num, numeros.get(num) + 1);
			} else {
				numeros.put(num, 1);
			}
		}

		System.out.println("Introduce las 2 estrellas del sorteo (1-12):");
		for (int i = 0; i < 2; i++) {
			int estrella = sc.nextInt();
			if (estrellas.containsKey(estrella)) {
				estrellas.put(estrella, estrellas.get(estrella) + 1);
			} else {
				estrellas.put(estrella, 1);
			}
		}

		// Mostrar resultados ordenados
		System.out.println("\nNúmeros y veces que han salido:");
		for (int num : numeros.keySet()) {
			System.out.println(num + " → " + numeros.get(num));
		}

		System.out.println("\nEstrellas y veces que han salido:");
		for (int estrella : estrellas.keySet()) {
			System.out.println(estrella + " → " + estrellas.get(estrella));
		}

		sc.close();
	}
}