//Definicion y Tipos de Datos
class Ejemplo_1
{
    public static void main (String[] Info)
    {
	//tipo de datos entero corto
	int x = 5;
	System.out.println("El valor de la variable es: " + x);
	x++; // 1ra forma
	x = x + 1; //2da Forma
	x+=1; //3er Forma
	System.out.println("El valor actual de la variable es: " + x);
	
	// Tipo de dato entero largo
	long y = 397812313;
	System.out.println("El valor de la variable long es: " + y);
	
	float f = 23.5F;
	double d = 3.9;
	
	System.out.println("El valor float es: " + f + "\nEl valor Double es: "+d);
	
	char c = 'r';
	System.out.println("El valor del char es: " + c);
	String cad = "hola ";
	String cad2 = "como estas";
	System.out.println(cad + cad2);
	
	boolean sw = false;
	System.out.println(sw);
    }
}
