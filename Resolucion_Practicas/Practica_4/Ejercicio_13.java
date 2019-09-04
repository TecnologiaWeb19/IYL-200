/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 4---------------------
 * EJERCICIO 13
 * Hallar la suma de los primeros 10 numeros naturales.
 * s = n(n+1)/2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_13
{
    public static void main (String[] Info) throws IOException
    {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

	int numero10, suma10;
	System.out.println ("*****Ejercicio 11*****");
	System.out.println ("Hallar la suma de los primeros 10 numeros naturales.");

	System.out.println ("Ingrese un Numero n");
	numero10 = Integer.parseInt (br.readLine ());

	suma10 = (numero10 * (numero10 + 1)) / 2;

	System.out.println ("La suma es " + suma10);
    }
}
