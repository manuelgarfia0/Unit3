package boletin1;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Declara variables
		int[] num = new int[12];
		// Asignar valores al array
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		// Mostrar array
		System.out.println(Arrays.toString(num));

		// Al ser el array de tipo int los huecos que no se inicializan a nada se quedan
		// a 0

	}

}
