package com.digitalers.educationit.telecom.clase2;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		
	/*	int numero = 2;
				System.out.println(numero);
				numero = 4;
						System.out.println(numero);
						final int NUMERO2 = 10;
						/* final int para definir una variante como constante asi d esta forma no puede modificarse
						esta variate debe nombrarse con letras mayusculas*/
					//	System.out.println(NUMERO2);
						//  NOTA: las constante no pueden modificarse
						// operadores logicos && ||
						/* 
						 * TRUE && TRUE = TRUE
						 * FALSE && TRUE = FALSE
						 * TRUE && FALSE = FALSE
						 * FALSE & FALSE = FALSE
						 */
				/*		boolean a = true;
						boolean b = false;
						System.out.println(a && b);
						b = true;
						System.out.println(a && b);
						
						// "&&" = amberson realiza 2 verificaciones..... "&"= realiza una sola, es decir 
						//si el boolean empieza con true continua, d lo contrario corta ahi la verificacion
						System.out.println(a || b);
						b = false;
						System.out.println(a || b);
						a = false;
						System.out.println(a || b);
						System.out.println(!a); // negar e invertir la afirmacion
						
						// array = []   sirven para guardar multiples variables de un mismo tipo de dato
						// en una caja interna      siempre inician en cero "0" 
						// es decir el indice cero "0" hace referencia a la primer caja dentro el casillero
						//
					/*
						int [] datos = new int [4]; 
						datos [0] = 15;
						datos [1] = 20;
						datos [2] = 25;
						datos [3] = 30;
						System.out.println(datos [3]);
						datos [3] = 450; // puedo cambiar el valor de la caja y volver a imprimir
						System.out.println(datos [3]);
						// otra fortma de array
						String clientes [] = {"Sara","Chon","harry","Elver","Tiziano"};
						System.out.println(clientes [3]);
						// ctrl + F = buscar en paginas
						*/
							// Clase Scanner
		               Scanner teclado = new Scanner(System.in);
		               System.out.println("Pone tu nombre");
		               String nombre = teclado.next();
		               System.out.println("cuantos añitos tenes lacra?");
		               byte edad = teclado.nextByte();
		               System.out.println("Holaaa Golos@ " + nombre + " te caben " + edad + " centimetros de placer");
		               
		               //programa q registre 3 alumnos y luego los muestre con un syso
		             String [] alumnos = new String [3];
		             
		              System.out.println("datos de alumno 1");
		              alumnos [0] = teclado.nextLine();
		              System.out.println("datos de alumno 2");
		              alumnos [1] = teclado.nextLine();
		              System.out.println("datos de alumno 3");
		              alumnos [2] = teclado.nextLine();
		              System.out.println("Los alumnos registrados son:\n\n\t1) "
		              + alumnos [0] + "\n\t2) " + alumnos [1] + "\n\t3) " + alumnos [2]);  
		               
		               // inline-if, condicional, ternario condicion ? true : false
		               
		            //   int a = 500, b = 250;
		             //  String mensaje = (a > b )? "A es mayor que B" : "A es menor que B";
		             //  System.out.println(mensaje);
		              
		                 
		               
						
						
						
						
						
						
						
						
						
						
						
						
						
						
	}
						

}
