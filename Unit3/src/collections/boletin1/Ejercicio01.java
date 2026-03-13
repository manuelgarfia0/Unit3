package collections.boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		int num;

		// Introducir números
		System.out.println("Introduce números positivos (negativo para terminar):");

		do {
			num = sc.nextInt();
			if (num >= 0) {
				lista.add(num);
			}
		} while (num >= 0);

		// Recorrer la lista y mostrar índices de números pares
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 == 0) {
				System.out.println("Índice con número par: " + i);
			}
		}

		sc.close();
	}
}