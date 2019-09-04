/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 3---------------------
 * EJERCICIO 9
 * Dado un triangulo cualquiera si se conoce dos angulos anteriors hallar el valor del tercero.
 * g = a + b; 
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_9
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int alfa, beta, gama;
	System.out.println("*****Ejercicio 9*****");
	System.out.println("Dado un triangulo cualquiera si se conoce dos angulos anteriors hallar el valor del tercero.");        
    
	System.out.println ("Ingrese Angulo alfa");
	alfa = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese Angulo beta");
	beta = Integer.parseInt(br.readLine());
	
	gama = alfa + beta;
	
	System.out.println("El valor angulo gama es: " + gama);
    }
}
