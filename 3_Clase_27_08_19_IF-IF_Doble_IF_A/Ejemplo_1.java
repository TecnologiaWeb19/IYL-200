/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * FECHA: 20-08-19
 * -------------------Ejemplo Estructura IF---------------------
 * EJERCICIO 1
 * Determinar la edad habil de votacion de una persona.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ejemplo_1
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int edad;
	System.out.println("*****Ejemplo 1*****");
	//System.out.println("Hallar la media de cuatro numeros");
	
    
	System.out.println ("Ingrese Su EDAD");
	edad = Integer.parseInt(br.readLine());

	//IF - DOBLE
	if(edad > 17){
	    System.out.println ("Es Mayor de EDAD");
	    
	}else{
	    System.out.println ("Es Menor de EDAD");            
	}
    }
}
