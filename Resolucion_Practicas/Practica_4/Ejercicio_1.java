/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 5---------------------
 * EJERCICIO 11
 * Hallar la solucion de una ecuacion lineal.
 * x = -b / a (a <> 0)
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
	
	int a, b, x;
	System.out.println("*****Ejercicio 1*****");
	System.out.println("Hallar la solucion de una ecuacion lineal");        
    
	System.out.println ("Ingrese Coeficiente a");
	a = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese Termino independiente b");
	b = Integer.parseInt(br.readLine());
	
	x = -b / a;
	
	System.out.println("El Resultado de la ecuacion es: " + x);
    }
}
