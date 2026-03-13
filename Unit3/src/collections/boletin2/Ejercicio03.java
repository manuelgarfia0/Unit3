package collections.boletin2;

import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {

		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		TreeMap<Character, Integer> contador = new TreeMap<>();

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (Character.isLetter(c)) {
				c = Character.toLowerCase(c); // ignorar mayúsculas/minúsculas
				contador.put(c, contador.getOrDefault(c, 0) + 1);
			}
		}

		// Mostrar resultados
		System.out.println("Frecuencia de cada letra:");
		for (char letra : contador.keySet()) {
			System.out.println(letra + " → " + contador.get(letra));
		}
	}
}