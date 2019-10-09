package objeto;

public class Persona {
    //Attibutos
    String Nombre;
    String Apellido;
    int ci;
    String fechaNacimiento;
    int peso;
    
    //Metodos 
    public void mostrar(String n, String a, int ci, String fn, int p){
        System.out.println("Tu nombre es: "+n);
        System.out.println("Tu Apellido es: "+a);
        System.out.println("Tu ci es: "+ci);
        System.out.println("Tu Fecha Nacimiento es: "+fn);
        System.out.println("Tu Peso es: "+p);
    }
}
