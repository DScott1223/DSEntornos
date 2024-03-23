package exepciones.articulos;
//Cambio1	2	3	4	5
//Cambio main 2

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


	@Override
	public int compareTo(Object o) {
		if (o.getClass().equals(Electronico.class) && ((Electronico) o).calcularPrecioFinal() == this.calcularPrecioFinal()) {
			return 0;
		} else if (o.getClass().equals(Electronico.class) && ((Electronico) o).calcularPrecioFinal() < this.calcularPrecioFinal()) {
			return 1;
		} else if (o.getClass().equals(Prenda.class) && ((Prenda) o).calcularPrecioFinal() == this.calcularPrecioFinal()) {
			return 0;
		} else if (o.getClass().equals(Prenda.class) && ((Prenda) o).calcularPrecioFinal() < this.calcularPrecioFinal()) {
			return 1;
		} else {
			return -1;
		}
	}


}


