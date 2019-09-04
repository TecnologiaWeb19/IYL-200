/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 3---------------------
 * EJERCICIO 7
 * Dada los puntos x1, y1, x2, y2, hallar la pendiente de la recta.
 * Considerar x1 <> x2.
 * m = y2 - y1 / x2 - x1 
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_7
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int x1, x2, y1, y2, m;
	System.out.println("*****Ejercicio 7*****");
	System.out.println("Dada los puntos x1, y1, x2, y2, hallar la pendiente de la recta.");        
    
	System.out.println ("Ingrese x1");
	x1 = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese x2");
	x2 = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese y1");
	y1 = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese y2");
	y2 = Integer.parseInt(br.readLine());
	
	m = (y2 - y1)/(x2 - x1);
	
	System.out.println("La pendiente de la recta es: " + m);
    }
}
