//Para la suma de dos variables
class EjemploFP{

    //Metodo principal
    public static void main(String [] args){
	//1ra Forma
	int a = 4, b = 8; 
	Suma(a, b);
	
	//2da Forma
	Suma(5, 5);
    }
    
    //Procedimiento
    public static void Suma(int a, int b){
	int suma = a + b;
	System.out.println("La suma es:" +suma);
    }    
}
