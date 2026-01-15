package boletin4_2;

public class Ejercicio05 {

	public static void main(String[] args) {
		int[][] tabla = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] tablaGirada = gira90(tabla);

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < tablaGirada.length; i++) {
			for (int j = 0; j < tablaGirada.length; j++) {
				System.out.print(tablaGirada[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static int[][] gira90(int[][] tablaInicio) {
		int[][] tablaGirada = new int[tablaInicio[0].length][tablaInicio.length];

		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				tablaGirada[i][j] = tablaInicio[tablaInicio[i].length - j - 1][i];
			}
		}

		return tablaGirada;
	}

}
