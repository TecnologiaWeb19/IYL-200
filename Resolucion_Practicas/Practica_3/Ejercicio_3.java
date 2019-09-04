/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 3---------------------
 * EJERCICIO 3
 * Hallar el area de un trapezoide.
 * a = ( B + b * h )/ 2
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_3
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int B, b, h, area;
	System.out.println("*****Ejercicio 3*****");
	System.out.println("Hallar el area de un trapezoide.");
	
	System.out.println ("Ingrese B");
	B = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese b");
	b = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese h");
	h = Integer.parseInt(br.readLine());

	area = ((B + b) * h) / 2;
	
	System.out.println("El Area del trapezoide es: " + area);
    }
}
