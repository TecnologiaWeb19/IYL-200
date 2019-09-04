/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 4---------------------
 * EJERCICIO 5
 * Intercambiar los valor de dos variables, sin usar variables auxiliares.
 * a = a + b
 * b = a - b
 * a = a - b 
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_5
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int valorA, valorB;
	System.out.println("*****Ejercicio 5*****");
	System.out.println("Intercambiar los valor de dos variables, sin usar variables auxiliares.");        
    
	System.out.println ("Ingrese Valor A");
	valorA = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese Valor B");
	valorB = Integer.parseInt(br.readLine());
	
	valorA = valorA + valorB;
	valorB = valorA - valorB;
	valorA = valorA - valorB;
	
	System.out.println("El Valor A es: " + valorA);
	System.out.println("El Valor B es: " + valorB);
    }
}
