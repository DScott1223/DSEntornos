package exepciones.articulos;

public class Prenda extends Articulo {
String talla;




public Prenda(String nombre, double precio, String talla) {
	super(nombre, precio);
	this.talla = talla;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double calcularPrecioFinal() {
	// TODO Auto-generated method stub
	return precio;
}
}

