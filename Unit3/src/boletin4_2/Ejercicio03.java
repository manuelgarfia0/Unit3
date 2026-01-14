package boletin4_2;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Inicializo un array simetrico
		int[][] tabla = { { 1, 2, 3 }, { 2, 5, 6 }, { 3, 6, 9 } };

		// Bucle para mostrar el array
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		// Llamada a la funcion para comprobar si es simetrica o no
		System.out.println(esSimetrica(tabla) ? "La tabla es simétrica" : "La tabla no es simétrica");
	}

	static boolean esSimetrica(int[][] t) {
		// Declaro un boolean para saber si el array es simetrico o no
		boolean simetrica = true;
		// Comprobamos si la matriz es cuadrada
		if (t.length != t[0].length) {
			simetrica = false;
		}

		for (int i = 0; i < t.length; i++) {
			for (int j = i + 1; j < t.length; j++) {
				if (t[i][j] != t[j][i]) {
					simetrica = false;
				}
			}
		}

		return simetrica;
	}

}
