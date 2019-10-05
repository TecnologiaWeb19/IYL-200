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
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("La media es: "+Ejercicio_1());        
    }
    
    //Funcion
    public static int Ejercicio_1(){
	System.out.println("*****Ejercicio 1*****");
	System.out.println("Hallar la media de cuatro numeros");
	
	int valorA, valorB, valorC, valorD, media;
	
	System.out.println ("Ingrese Valor A");
	valorA = Integer.parseInt(br.readLine());
	System.out.println ("Ingrese Valor B");
	valorB = Integer.parseInt(br.readLine());
	System.out.println ("Ingrese Valor C");
	valorC = Integer.parseInt(br.readLine());
	System.out.println ("Ingrese Valor D");
	valorD = Integer.parseInt(br.readLine());
	
	media = (valorA + valorB + valorC + valorD) / 4;
	
	System.out.println ("La Media es: " + media);
	return media;
    }
    
    //procedimiento
    //public static void Ejericio_2(){
    
    //}
}
