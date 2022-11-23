package clase11;

public class Main {

	public static void main(String[] args) {
		//instanciamos la clase perro para crear objetos
	/*	Perro perro1 = new Perro(); //objeto1
		perro1.comer(); //objeto1 esta invocando al metodo comer
		//perro1.nombre = "Dali"; //solo funciona si esta publico
		perro1.setNombre("Toronto"); //atributo privado
		//perro1.raza = "Yorki"; //solo funciona si es publico
		perro1.setRaza("Mestizo");
		//perro1.altura = 20.5; //Solo funciona si esta publico
		perro1.setAltura(10);
		System.out.println(perro1.dormir());
		Perro perro2 = new Perro(); //objeto2
	//	perro2.nombre = "Bom"; //solo funciona si es publico
		perro2.setNombre("Rocco");
		System.out.println(perro2.dormir());
		System.out.println("Mi perrito se llama " + perro1.getNombre() + 
		" , mide " + perro1.getAltura() + " cm de altura y es de raza " 
		+ perro1.getRaza());
		
		//Probando a la clase persona
		System.out.println("*************PERSONA***********");
		Persona p1 = new Persona();
		p1.setNombre("Gonzalo");
		p1.setApellido("Arancibia");
		p1.setDni(12345678);
		p1.setCorreo("musambe@yahoo.com");
		p1.setEdad(27);
		System.out.println("Mi nombre es " + p1.getNombre() + " " +
		p1.getApellido() + " tengo " + p1.getEdad() + " años de edad, y mi dni es: " + 
				p1.getDni() + " y mi correo es " + p1.getCorreo());
		
	*/	
		
		//Clase 12
		//con setter
		
		Perro miPerrito1 = new Perro(); // mi objeto
		miPerrito1.setNombre("Laki");
		System.out.println(miPerrito1.getNombre()); 
		
		Perro miPerrito2 = new Perro("Leon", "Doberman", 0.40); // mi objeto
		System.out.println(miPerrito2.getNombre());
		
		miPerrito1.comer();
		miPerrito1.comer(" zanahorias");
		
		
		
	/*	//instancia la clase hueso*/
		Hueso hueso1 = new Hueso("jamon ahumado");
		Hueso hueso2 = new Hueso();
		hueso2.setSabor("pollo");
		System.out.println(hueso1.getSabor());
		hueso1.jugar();
		hueso2.jugar("esconderse");
		
		//instanciando en la clase perro
		Perro p3 = new Perro("Dante" , "Mestizo" , 0.95, hueso1);
		Perro p4 = new Perro();
		p4.setHueso(hueso2);
		System.out.println(hueso1.toString());
		System.out.println(p3.toString());
		
		
		//construyendo un objeto de tipo vehiculo
		Vehiculo vehiculo = new Vehiculo("Audi", 100);
		System.out.println(vehiculo.toString());
		
		//Construyendo un objeto de tipo moto (hija)
		Moto moto = new Moto();
		moto.setMarca("Yamaha");
		moto.setPrecio(50);
		System.out.println("La moto " + moto.getMarca() + " cuesta "+ moto.getPrecio());
		

	}

}
