package collections.boletin1;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio03 {

	public static void main(String[] args) {

		Random rd = new Random();

		TreeSet<Integer> numeros = new TreeSet<>();

		// Generar 30 números aleatorios entre 1 y 10
		for (int i = 0; i < 30; i++) {
			int num = rd.nextInt(1, 11);
			numeros.add(num);
		}

		// Mostrar la colección
		System.out.println("Colección ordenada:");
		System.out.println(numeros);
	}
}