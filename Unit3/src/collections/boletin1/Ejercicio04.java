package collections.boletin1;

import java.util.Random;
import java.util.TreeSet;

public class Ejercicio04 {

	public static void main(String[] args) {

		Random rd = new Random();

		TreeSet<Integer> numeros = new TreeSet<>();

		while (numeros.size() < 20) {
			int num = rd.nextInt(100);
			numeros.add(num);
		}

		System.out.println("Colección ordenada:");
		System.out.println(numeros);
	}
}