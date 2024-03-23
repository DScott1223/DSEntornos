package exepciones.articulos;
//Cambio1	2	3	4	5
public class Electronico extends Articulo {
double impuesto;


public Electronico(String nombre, double precio, double impuesto) {
	super(nombre, precio);
	this.impuesto = impuesto;
}



@Override
public double calcularPrecioFinal() {
	return (precio * (impuesto/100)+1);
}

}
