/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 4---------------------
 * EJERCICIO 11
 * Mostar el 1er, 2do y 3er digito de un numero, considerar numeros mayores 999.
 * numero -> 2485
 * 2
 * 4
 * 8
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
	
	int numero, digito1, digito2, digito3, digito4;
	System.out.println("*****Ejercicio 11*****");
	System.out.println("Mostar el 1er, 2do y 3er digito de un numero, considerar numeros mayores 999.");        
    
	System.out.println ("Ingrese un Numero de 4 digitos");
	numero = Integer.parseInt(br.readLine());

	digito1 = numero % 10;
	numero = numero / 10;
	digito2 = numero % 10;
	numero = numero / 10;
	digito3 = numero % 10;
	numero = numero / 10;
	digito4 = numero % 10;
	numero = numero / 10;
	
	System.out.println("El 1er digito es : " + digito4);
	System.out.println("El 2do digito es : " + digito3);
	System.out.println("El 3er digito es : " + digito2);
    }
}
