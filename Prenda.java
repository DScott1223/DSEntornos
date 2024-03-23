package exepciones.articulos;
//Cambio2	3	4	5
public class Prenda extends Articulo {
String talla;




public Prenda(String nombre, double precio, String talla) {
	super(nombre, precio);
	this.talla = talla;
}

@Override
public double calcularPrecioFinal() {
	// TODO Auto-generated method stub
	return precio;
}
}

