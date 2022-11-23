package clase11;
	//superclase o clase padre
	//encapsulado
public class Vehiculo {
	//atributo
	private String marca;
	private double precio;
	//constructor
	public Vehiculo(String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
		
	}
	//sobrecarga
	public Vehiculo() {
		
	}
	//setters y getters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setPrecio(double precio) {
		this.precio = precio;	
	}
	public double getPrecio() {
		return this.precio;
	}
	public String toString() {
		return "Los datos, Marca: " + this.marca + " Precio: " + this.precio;
	}
}
