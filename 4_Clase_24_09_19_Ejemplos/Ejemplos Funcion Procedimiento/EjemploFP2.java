//Para la suma de dos variables
class EjemploFP2{

    //Metodo principal
    public static void main(String [] args){
	//2da Forma
	MostrarNombre("Kevin","Villca",15);
	MostrarNombre("Maria","Yujra",16);
	MostrarNombre("Jannet","Gomez",10);
	MostrarNombre("Ximena","Mamani",20);
	MostrarNombre("Estela","Mamani",18);
    }
    
    //Procedimiento
    public static void MostrarNombre(String n, String a, int e){
	System.out.println("Tu nombre es:" +n);
	System.out.println("Tu Apellido es:" +a);
	System.out.println("y tu edad es:" +e);
	System.out.println("--------------------------");
    } 
       
}
