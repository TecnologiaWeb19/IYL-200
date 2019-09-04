/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 3---------------------
 * EJERCICIO 1
 * Determinar la velocidad de un movil con aceleracion constante.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_1
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int distancia, tiempo, velocidad;
	System.out.println("*****Ejercicio 1*****");
	System.out.println("Determinar la velocidad de un movil con aceleracion constante.");        
    
	System.out.println ("Ingrese la distancia");
	distancia = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese la tiempo");
	tiempo = Integer.parseInt(br.readLine());

	velocidad = distancia / tiempo;
	
	System.out.println("La Velocida es: " + velocidad + " m/s");
    }
}
