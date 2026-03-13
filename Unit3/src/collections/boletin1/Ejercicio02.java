package collections.boletin1;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {

		Random rd = new Random();

		ArrayList<Integer> lista = new ArrayList<>();

		int tamaño = rd.nextInt(5, 11);

		// Rellenar la lista con números aleatorios
		for (int i = 0; i < tamaño; i++) {
			int num = rd.nextInt(0, 101);// entre 0 y 100
			lista.add(num);
		}

		System.out.println("Lista: " + lista);

		int suma = 0;
		int max = lista.get(0);
		int min = lista.get(0);

		// Recorrer la lista
		for (int num : lista) {
			suma += num;

			if (num > max) {
				max = num;
			}

			if (num < min) {
				min = num;
			}
		}

		double media = (double) suma / lista.size();

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("Máximo: " + max);
		System.out.println("Mínimo: " + min);
	}
}