package exepciones.articulos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Articulo> tienda = new ArrayList<>();
		Electronico e1 = new Electronico("Brit", 25, 21);
		Prenda p1 = new Prenda("Botas", 70, "S");
		
		tienda.add(e1);
		tienda.add(p1);
		
		
	}

}
