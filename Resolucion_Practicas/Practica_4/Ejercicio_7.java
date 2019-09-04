/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 04-09-19
 * -------------------Practica 4---------------------
 * EJERCICIO 7
 * Determinar el 1er digito de un numero considerar numero mayores a 0.
 * numero -> 2482 tiene 4 digitos -> 2
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
	
	int numero, digito1, digito2, digito3, digito4;
	System.out.println("*****Ejercicio 7*****");
	System.out.println("Determinar el 1er digito de un numero considerar numero mayores a 0.");        
    
	System.out.println ("Ingrese un Numero de 4 digitos");
	numero = Integer.parseInt(br.readLine());
	//1ra Forma
	/**digito1 = numero % 10;
	numero = numero / 10;
	digito2 = numero % 10;
	numero = numero / 10;
	digito3 = numero % 10;
	numero = numero / 10;
	digito4 = numero % 10;
	numero = numero / 10;*/
	
	//2da Forma
	digito1 = numero / 1000;
	
	System.out.println("El 1er digito es : " + digito1);
    }
}
