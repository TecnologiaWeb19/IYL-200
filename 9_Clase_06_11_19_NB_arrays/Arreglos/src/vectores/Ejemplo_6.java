package vectores;
import java.util.Scanner;

public class Ejemplo_6 {

    static Scanner leer = new Scanner(System.in);
    //Tamaño de vector
    static int dimension = 2;

    public static void main(String[] args) {
        //Declaracion de un Vector
        int[] edad = new int[dimension];
        
        Llenar(edad);
        Mostrar(edad);
        
    }

    public static void Llenar(int V[]) {
        //Llenar datos al vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduzca la edad: " + (i + 1));
            V[i] = Integer.parseInt(leer.nextLine());
        }
    }

    public static void Mostrar(int V[]) {
        //Mostrar datos del vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.print("[" + V[i] + "]");
        }
    }
}
