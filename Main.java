package exepciones.articulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Articulo> tienda = new ArrayList<>();
		Electronico e1 = new Electronico("Brit", 25, 21);
		Electronico e2 = new Electronico("Brit2", 25, 21);
		Prenda p1 = new Prenda("Botas", 70, "S");
		Prenda p2 = new Prenda("Botas2", 170, "L");

		tienda.add(e1);
		tienda.add(p1);
		tienda.add(e2);
		tienda.add(p2);

		Collections.sort(tienda);

		// Imprimir la lista ordenada
		for(Articulo articulo : tienda) {
			System.out.println(articulo.nombre + " - " + articulo.precio);
		}
		
	}

}
