/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 4---------------------
 * EJERCICIO 15
 * Cuatro persona desean dividirse un pastel. Si al mayor le corresponde
 30% hallar un algoritmo que divida equitativamente el resto entre los 3, 
 mostrar a cuanto le toca a cada uno.
 * a = 30;
 * b = 70 / 3;
 * c = 70 / 3;
 * d = 70 / 3;
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_15
{
    public static void main (String[] Info) throws IOException
    {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	double a, b, c, d;
	System.out.println ("*****Ejercicio 15*****");
	//System.out.println ("Hallar la suma de los primeros 10 numeros naturales.");

	float x = 70;
	a = 30;
	b = x / 3;
	c = x / 3;
	d = x / 3;

	System.out.println ("La division corresponde a: " + a);
	System.out.println ("La division corresponde a: " + b);
	System.out.println ("La division corresponde a: " + c);
	System.out.println ("La division corresponde a: " + d);
    }
}
