/* ****************************************************
 * INSTITUTO TECNOLOGICO
 * ESCUELA INDUSTRIAL SUPERIOR PEDRO DOMINGO MURILLO ST
 * MATERIA: INFORMATICA Y LABORATORIO II
 * SIGLA: IYL-200
 * DOCENTE : ERIK HUALLPA ARUQUIPA
 * ESTUDIANTE : Nombres y Apellidos
 * FECHA: 20-08-19
 * -------------------PRACTICA - 2---------------------
 * EJERCICIO 2
 * Dados 2 numeros, hallar la suma, la diferencia y el producto
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ejercicio_2
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("*****Ejercicio 2*****");
	System.out.println("Dados 2 numeros, hallar la suma, la diferencia y el producto");
	int valorA, valorB, suma, diferencia, producto;
	System.out.println ("Ingrese Valor A");
	valorA = Integer.parseInt(br.readLine());
	System.out.println ("Ingrese Valor B");
	valorB = Integer.parseInt(br.readLine()); 
	
	suma = valorA + valorB;
	diferencia = valorA - valorB;
	producto = valorA * valorB;

	System.out.println ("La Suma es: " + suma);
	System.out.println ("La Diferencia es: " + diferencia);
	System.out.println ("El Producto es: " + producto);
    }
}
