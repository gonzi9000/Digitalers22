package clase11;

public class Perro {
	//atributos: caracteristicas
	private String nombre;
	private String raza;
	private double altura;
	private Hueso hueso;
	// constructor
	public Perro(String nombre, String raza, Double altura) {
		this.nombre = nombre;
		this.raza = raza;
		this.altura = altura;
	}
	// polimorfismo: sobrecarga de métodos, sobrecarga de construccion
	public Perro() {
		
	}
	public Perro(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	public Perro(String nombre, String raza, Double altura, Hueso hueso) {
		this.nombre = nombre;
		this.raza = raza;
		this.altura = altura;
		this.hueso = hueso;
	}
	//metodos: operaciones
	public void comer() {
		System.out.println("el perro esta comiendo");
	}
	//sobrecarga
	public void comer(String comida) {
		System.out.println("el perro esta comiendo" + comida);
	}
	
	String dormir() {
		String mensaje = "el perro " + nombre  + " esta durmiendo";
		return mensaje;
	}
	void ladrar() {
		System.out.println("el perro esta ladrando");
	}
	//setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setHueso(Hueso hueso) {
		this.hueso = hueso;
	}
	
		//getters
	public String getNombre() {
		return this.nombre;
	}
	public String getRaza() {
		return this.raza;
	}
	public double getAltura() {
		return this.altura;
	}
	public Hueso getHueso() {
		return this.hueso;
		
		
	
	
	

	}
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", altura=" + altura + ", hueso=" + hueso + "]";
	}
}
