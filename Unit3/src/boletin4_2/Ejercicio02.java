package boletin4_2;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Declarar variables
		int[][] matriz = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} };
		int[][] matrizTranspuesta = transponerMatriz(matriz);
		// Mostrar la matriz original y dsp la transpuesta
		System.out.println("Matriz original");
		mostrarMatriz(matriz);
		// Salto de linea
		System.out.println();
		// Transponer la matriz y mostrarla
		System.out.println("Matriz transpuesta");
		mostrarMatriz(matrizTranspuesta);
	}

	// Función para mostrar una matriz dada como parametro de entrada
	static void mostrarMatriz(int[][] matriz) {
		// Bucle para mostrar una matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// Función para tranponer una matriz dada por parametro de entrada
	static int[][] transponerMatriz(int[][] matriz) {
		// Almacenos las filas de la matriz original en una variable
		int filas = matriz.length;
		// Almacena las columnas de la matriz original en una variables
		int columnas = matriz[0].length;
		// Crea una matriz nueva con las filas y las columnas al contrario que la matriz
		// original
		int[][] matrizTranspuesta = new int[columnas][filas];
		// Bucle para recorrer el array
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				// Asigna los valores de la matriz original en la matriz nueva cabiando de lugar
				// la i y j
				matrizTranspuesta[j][i] = matriz[i][j];
			}
		}
		// Devuelve la nueva matriz
		return matrizTranspuesta;
	}

}
