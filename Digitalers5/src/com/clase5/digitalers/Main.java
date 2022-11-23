package com.clase5.digitalers;

import java.util.Scanner;

public class Main {

	public static void saludar() {
		System.out.println("holaaaaa digitalers!!!!");
	}
	public static void informar(String mascota, int edad, boolean vacuna) {
		System.out.println("vacunas pa tu mascota ");
		saludar();
		String sm  = "";
		if (edad < 3)
			sm = "vacuna xy";
		
		
	
		
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		saludar();
		System.out.println("escribe el nombre de tu mascota");
		String nombre = teclado.next();
		System.out.println("escribe edad de tu mascota");
		int edad = teclado.nextInt();
		informar(nombre, edad, true);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
