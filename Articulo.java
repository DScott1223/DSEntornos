package exepciones.articulos;
//Cambio#1

public abstract class Articulo implements Comparable {
String nombre; double precio;  



public Articulo(String nombre, double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}


@Override
public String toString() {
	return "Articulo [nombre=" + nombre + ", precio=" + precio + "]";
}



public abstract double calcularPrecioFinal();



public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}
}
