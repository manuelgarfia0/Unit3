package collections.boletin2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
		Random rand = new Random();

		// Generar 10 números aleatorios distintos entre 1 y 20
		while (numeros.size() < 10) {
			int num = rand.nextInt(20) + 1; // 1-20
			numeros.add(num); // si se repite, no se añade
		}

		// Mostrar los números generados
		System.out.println("Números aleatorios únicos:");
		for (int n : numeros) {
			System.out.print(n + " ");
		}
	}
}