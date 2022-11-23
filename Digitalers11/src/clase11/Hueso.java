package clase11;
//clase encapsulada
public class Hueso {
	// atributo
	private String sabor;
	// constructor
	public Hueso (String sabor) {
		this.sabor = sabor;
	}
	// sobrecarga de constructor
	public Hueso() {	
	}
	
	//setter y getter
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getSabor() {
		return this.sabor;
	}
	
	//otros metodos
	public void jugar() {
		System.out.println("El perro esta jugando");
	}
	
	//sobrecarga de metodos
	public void jugar(String juego) {
		System.out.println("El perro esta jugando " + juego);
		
	}
	@Override
	public String toString() {
		return "Hueso [sabor=" + sabor + "]";
	}
}
