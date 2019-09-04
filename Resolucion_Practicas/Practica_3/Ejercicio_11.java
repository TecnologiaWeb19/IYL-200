/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 3---------------------
 * EJERCICIO 11
 * Realizar un algoritmo para:
 * a = b + c
 * a = b / c
 * a = a + c
 * a = a + b + c 
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_11
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	double a, b, c;
	System.out.println("*****Ejercicio 9*****");
	System.out.println("Realizar un algoritmo para:");        
    
	System.out.println ("Ingrese b");
	b = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese c");
	c = Integer.parseInt(br.readLine());
	
	a = b + c;
	a = b / c;
	a = a + c;
	a = a + b + c; 
	
	System.out.println("El Resultado es: " + a);
    }
}
