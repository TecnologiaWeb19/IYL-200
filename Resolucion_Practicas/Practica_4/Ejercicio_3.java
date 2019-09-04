/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 4---------------------
 * EJERCICIO 3
 * Determinar la fuerza con que cae un objeto.
 * v = sqrt(2 * g * h)
 * f = (m * v * v)/2
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
	
	double altura, masa, velocidad, gravedad, fuerza;
	System.out.println("*****Ejercicio 3*****");
	System.out.println("Determinar la fuerza con que cae un objeto.");        
    
	System.out.println ("Ingrese Altura");
	altura = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese Masa");
	masa = Integer.parseInt(br.readLine());
	
	gravedad = 9.8;
	
	velocidad = Math.sqrt(2 * gravedad * altura);
	fuerza = (masa * velocidad * velocidad) / 2;
	
	System.out.println("La Fuerza: " + fuerza);
    }
}
