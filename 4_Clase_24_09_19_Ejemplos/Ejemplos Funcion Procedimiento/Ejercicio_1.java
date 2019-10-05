/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO SUB SEDE TAJANI
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * ESTUDIANTE : Nombres y Apellidos
 * FECHA: 20-08-19
 * -------------------PRACTICA - 2---------------------
 * EJERCICIO 1
 * Hallar la media de cuatro numeros
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ejercicio_1
{

    //funcion principal
    public static void main (String[] Info)
    {
	Ejercicio_1_Procedimiento();
	System.out.println("Con funcion" +Ejercicio_1_Funcion());
    }
    
    //Funcion de Hallar la media de 4 numeros.
    public static int Ejercicio_1_Funcion(){
	//System.out.println("*****Ejercicio 1*****");
	//System.out.println("Hallar la media de cuatro numeros");
	
	int valorA, valorB, valorC, valorD, media;
	
	//System.out.println ("Ingrese Valor A");
	valorA = 8;
	//System.out.println ("Ingrese Valor B");
	valorB = 10;
	//System.out.println ("Ingrese Valor C");
	valorC = 6;
	//System.out.println ("Ingrese Valor D");
	valorD = 9;
	
	media = (valorA + valorB + valorC + valorD) / 4;
	
	//System.out.println ("La Media es: " + media);
	return media;
    }
    
    //procedimiento
    public static void Ejercicio_1_Procedimiento(){
	System.out.println("*****Ejercicio 1*****");
	System.out.println("Hallar la media de cuatro numeros");
	
	int valorA, valorB, valorC, valorD, media;
	
	//System.out.println ("Ingrese Valor A");
	valorA = 8;
	//System.out.println ("Ingrese Valor B");
	valorB = 10;
	//System.out.println ("Ingrese Valor C");
	valorC = 6;
	//System.out.println ("Ingrese Valor D");
	valorD = 9;
	
	media = (valorA + valorB + valorC + valorD) / 4;
	
	System.out.println ("La Media es: " + media);
    }
}
