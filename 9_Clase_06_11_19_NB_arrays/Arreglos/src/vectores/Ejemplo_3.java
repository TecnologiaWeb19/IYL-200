package vectores;

import java.util.Scanner;

public class Ejemplo_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Tamaño de vector
        int dimension = 7;
        
        //Declaracion de un Vector
        int[] edad = new int[dimension];
        
        //Llenar datos al vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduzca la edad: " + (i+1));
            edad[i] = Integer.parseInt(leer.nextLine());
        }      
        
        //Mostrar datos del vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.print("["+edad[i]+"]");
        }
    }
}
