/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 3---------------------
 * EJERCICIO 5
 * Dadas la Vo, la A y el tiempo. Halla la velocidad final de un movil.
 * vf=vo+a*t
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
	
	int velocidadInicial, aceleracion, tiempo, velocidadFinal;
	System.out.println("*****Ejercicio 5*****");
	System.out.println("Dadas la Vo, la A y el tiempo. Halla la velocidad final de un movil.");        
    
	System.out.println ("Ingrese la Velocidad Inicial");
	velocidadInicial = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese la Aceleracion");
	aceleracion = Integer.parseInt(br.readLine());
	
	System.out.println ("Ingrese el tiempo");
	tiempo = Integer.parseInt(br.readLine());

	velocidadFinal = velocidadInicial + aceleracion * tiempo;
	
	System.out.println("La Velocidad Final es: " + velocidadFinal + " m/s");
    }
}
