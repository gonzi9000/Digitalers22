package com.practicas.clase3;

import java.util.Scanner;

	public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			// if else
		//  IF: realiza una accion q si da TRUE ejecuta otra accion
		//  ELSE: es el camino a seguir si IF da FALSE
		/*
			int a =300;
			if (a < 50) {
			System.out.println(a + " es menor a 50");
	     }	else {
			System.out.println(a + " es mayor a 50");
	     }
			*/
			/* Desarrollar un programa solicitando usuario y
			 *  clave para acceder al sistema a traves del teclado
			 * */
	/*
			String usuario, clave, usuarioC = "admin", claveC = "abc123";
			System.out.println("Ingrese su Usuario ");
			usuario = sc.next();
			System.out.println("Ingrese su Clave ");
			clave  = sc.next();
			if (usuario.equals(usuarioC) && clave.equals(claveC)) {
				System.out.println(" sesion iniciada");
			} else {
				System.out.println("usuario o clave incorrecta");
			}
			*/
		// equals busca y compara q 2 objetos sean iguales
		
		/* ir a petrus balilable
		 * solo acceden pesonas d 18 a 25 años
		 * si tenemos 22 , recibimos bebida gratis
		 * si no podemos ingresar , decir el motivo
		 * por el q no podemos entra
		 */
		/*
			System.out.println("Que edad tenes?");
			int edad = sc.nextInt();
			if (edad >= 18 && edad <= 25) {
			System.out.println("Podes pasar");	
			if (edad == 22)
				System.out.println(" y te Ganaste una coquita");
			}else {
				System.out.println("no podes pasar, raja d aca");
				if (edad < 18)
					System.out.println("x pendejo");
				else System.out.println("x fosil");
			}
			
			System.out.println(" dame tu edad");
			int edad = sc.nextInt();
			
			if (edad >= 18 && edad <= 25) {
				System.out.println("podes entrar");
				if (edad == 22)
					System.out.println("recibe una coquita");
			}else {
				System.out.println("no entra");
			if (edad < 18)
				System.out.println("no permitido x menor");
			else System.out.println("no permitido x viej@");
			}	*/
		
		//tenemos numero enteros y debemos decir la cantidad de cifras
		/*
		System.out.println("ingresa numeros");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("numero invalido");
			}else if (num ==0) { 
		System.out.println("no se permite esta cifra");
		}else if (num <10) { 
			System.out.println("numero 1 cifras");
		}else if (num < 100) {
			System.out.println("numero 2 cifras");
		}else if (num < 1000 ) {
			System.out.println("numero 3 cifras");
		}else if (num < 10000) {
			System.out.println("numero 4 cifras");
		
			}else 
				System.out.println("numero 5 o mas cifras"); 
		*/
		// switch
	/*	System.out.println("que dia es hoy? ");
		String dia = sc.next();
		switch (dia) {
			case "domingo":
			case "Domingo":
			case "DOMINGO":
				System.out.println("domingo de asado");
				break;
			case "lunes":
			case "Lunes":
			case "LUNES":
				System.out.println("lunes de sopita");
				break;
			case "martes":
			case "Martes":
			case "MARTES":
				System.out.println("martes de guisito");
				break;
			case "miercoles":
			case "Miercoles":
			case "MIERCOLES":
				System.out.println("miercoles de estofado d poshito o carnita");
				break;
			case "jueves":
			case "Jueves":
			case "JUEVES":
				System.out.println("jueves de tuquito");
			case "viernes":
			case "Viernes":
			case "VIERNES":
				System.out.println("viernes de milanesitas caseras");
				break;
		default:
			System.out.println("sabado de delivery");
		} */
	/*	
			
	double numero = 1500;
    double semanas = numero /168;
    int dias = semanas *24;
    int horas = 12;
    System.out.println("horas totales"); */
    		
/*		int semanas = (1500 / 168);
		System.out.println(semanas);
		int resto = 1500 - (168 * semanas);
		System.out.println(resto);
		int dias = resto / 24;
		System.out.println(dias);
		int horas = resto - (24 * dias);
		System.out.println(horas);
		*/
	
		
		//el parentesis sirve para dar prioridad a lo q quiero resolver primero
		
	/*	byte resto;
		resto = 5 / 2;
		System.out.println(resto);
		
		int sm = 3 + 4 * 2;
		System.out.println(sm);
		int as = (3 + 4) * 2;
		System.out.println(as);
		int bz = 3 + (4 * 2);
		System.out.println(bz);        */
		

		//	operaciones de asignacion 
		
		//		+=, -=, /=, *=    
	
		/*	
		byte a = 10;
		a += 5;
		System.out.println(a);
		
		a /= 3;
		System.out.println(a);   */
		
		
		
		
		
		
		
		
		
			
		
		
			
		
	}

}
