/*
Ejercicio 1: Hallar la media de cuatro numeros
Autor: By Erik 2019
*/
public class Ejercicio_1{
	public static void main (String [] ERIK){
		int A, B, C, D, MEDIA; //Esto es declaracion de Variables
		//Lectura de variables de A hasta D
		System.out.println("Introduzca Valor A");
		A = Integer.parseInt(System.console().readLine());

		System.out.println("Introduzca Valor B");
		B = Integer.parseInt(System.console().readLine());

		System.out.println("Introduzca Valor C");
		C = Integer.parseInt(System.console().readLine());

		System.out.println("Introduzca Valor D");
		D = Integer.parseInt(System.console().readLine());

		//Proceso
		MEDIA = (A + B + C + D)/4;
		
		//Salida de Datos
		System.out.println("La Media de 4 Numeros es: " + MEDIA);
	}
}