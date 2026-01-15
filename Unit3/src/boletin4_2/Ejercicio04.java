package boletin4_2;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Inicializo el array
		int[][] tabla = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
		// Llamada a la función para comprobar si es mágica
		System.out.println(esMagica(tabla) ? "La matriz es mágica" : "La matriz no es mágica");
	}

	static boolean esMagica(int[][] t) {
		// Booleano que se devolverá en la función para saber si es mágica o no
		boolean magica = true;
		// Suma de una fila para tenerla de referencia
		int suma = 0;
		// Sumas de las columnas y tablas
		int sumaTotal = 0;

		// Bucle para obtener un resultado como referencia
		for (int i = 0; i < t.length; i++) {
			suma += t[0][i];
		}

		// Bucle para comprobar las filas del array
		for (int i = 0; i < t.length; i++) {
			sumaTotal = 0;
			for (int j = 0; j < t.length; j++) {
				sumaTotal += t[i][j];
			}
			if (sumaTotal != suma) {
				magica = false;
			}
		}

		// Bucle para comprobar las columnas del array
		for (int i = 0; i < t.length; i++) {
			sumaTotal = 0;
			for (int j = 0; j < t.length; j++) {
				sumaTotal += t[j][i];
			}
			if (sumaTotal != suma) {
				magica = false;
			}
		}

		return magica;
	}

}
