import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ejemplo_3
{
    public static void main (String[] Info)throws IOException
    {
	//Notar que readLine() nos obliga a declarar IOException
	//Ya tenemos el "lector"
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	//Se pide un dato al usuario
	System.out.println("Por favor ingrese su nombre");
	//Se lee el nombre con readLine() que retorna un String con el dato
	String nombre = br.readLine(); 
	//Se pide otro dato al usuario
	System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");
	//Se guarda la entrada (edad) en una variable
	String entrada = br.readLine(); 
	//N�tese que readLine siempre retorna String y la clase BufferedReader...
	//no tiene un m�todo para leer enteros, as� que debemos convertirlo.
	int edad = Integer.parseInt(entrada);//Se transforma la entrada anterior en un entero
	//Si el usuario ingres� solo n�meros funcionar� bien, de lo contrario generar� una excepci�n
	//Operacion numerica con la edad
	System.out.println("Gracias " + nombre + " en 10 a�os usted tendr� " + (edad + 10) + " a�os."); 
    }
}
