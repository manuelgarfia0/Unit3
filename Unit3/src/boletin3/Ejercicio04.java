package boletin3;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declarar variables
		int[][] tablaMultiplicar = new int[10][10];
		// Bucle para rellenar el array
		for (int i = 0; i < tablaMultiplicar.length; i++) {
			for (int j = 0; j < tablaMultiplicar[i].length; j++) {
				tablaMultiplicar[i][j] = (i + 1) * (j + 1);
			}
		}
		// Bucle para mostrar array
		for (int i = 0; i < tablaMultiplicar.length; i++) {
			for (int j = 0; j < tablaMultiplicar[i].length; j++) {
				System.out.print(tablaMultiplicar[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
