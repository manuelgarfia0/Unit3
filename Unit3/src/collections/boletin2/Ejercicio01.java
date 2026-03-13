package collections.boletin2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Crear lista del 1 al 10
		ArrayList<Integer> listaOriginal = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			listaOriginal.add(i);
		}

		// Mostrar lista original
		System.out.println("Lista original:");
		System.out.println(listaOriginal);

		// Mezclar lista
		ArrayList<Integer> listaMezclada = new ArrayList<>(listaOriginal);
		Collections.shuffle(listaMezclada);

		// Mostrar lista mezclada
		System.out.println("Lista mezclada:");
		System.out.println(listaMezclada);
	}
}