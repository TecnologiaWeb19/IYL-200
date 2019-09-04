/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 4---------------------
 * EJERCICIO 9
 * Halla el valor absoluto de un numero.
 * -9 = 9
 * 9 = 9
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

class Ejercicio_9
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int numero;
	System.out.println("*****Ejercicio 9*****");
	System.out.println("Halla el valor absoluto de un numero.");        
    
	System.out.println ("Ingrese un numero Negativo");
	numero = Integer.parseInt(br.readLine());
	
	numero = numero * (-1);
	
	System.out.println("El valor Absoluto : " + numero);
    }
}
