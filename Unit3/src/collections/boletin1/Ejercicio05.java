package collections.boletin1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		String nombre = "";

		System.out.println("Introduce nombres (escribe 'fin' para terminar):");

		// Bucle que se ejecuta mientras el nombre no sea "fin"
		while (!nombre.equalsIgnoreCase("fin")) {
			nombre = sc.nextLine();
			if (!nombre.equalsIgnoreCase("fin")) {
				nombres.add(nombre);
			}
		}

		System.out.println("Colección de nombres:");
		System.out.println(nombres);

		sc.close();
	}
}