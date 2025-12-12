package boletin3;

import java.util.Arrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Declarar variables
		int[][] num = new int[3][6];
		// Asignar valores
		num[0][0] = 0;
		num[1][0] = 75;
		num[0][1] = 30;
		num[0][2] = 2;
		num[2][2] = -2;
		num[2][3] = 9;
		num[1][4] = 0;
		num[0][5] = 5;
		num[2][5] = 11;
		// Mostrar array con bucles
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// Mostrar array con método
		System.out.println(Arrays.deepToString(num));
	}

}
