import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ejemplo_4
{
    public static void main (String[] Info)throws IOException
    {
	BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
	    
	String nombre;
	System.out.println("Por favor, dime como te llamas: ");
	nombre = leer.readLine();
	int edad;
	System.out.println("Por favor, dame tu edad: ");
	edad = Integer.parseInt(leer.readLine());
	System.out.print("\nHola! "+nombre+" Tu Edad es: "+edad+", Encantado de conocerte!");
    }
}
