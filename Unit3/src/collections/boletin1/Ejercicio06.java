package collections.boletin1;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeSet<String> nombres = new TreeSet<>();
		String nombre = "";

		System.out.println("Introduce nombres (escribe 'fin' para terminar):");

		// Bucle controlado por la condición
		while (!nombre.equalsIgnoreCase("fin")) {
			nombre = sc.nextLine();
			if (!nombre.equalsIgnoreCase("fin")) {
				nombres.add(nombre);
			}
		}

		System.out.println("Colección de nombres ordenada alfabéticamente:");
		System.out.println(nombres);

		sc.close();
	}
}