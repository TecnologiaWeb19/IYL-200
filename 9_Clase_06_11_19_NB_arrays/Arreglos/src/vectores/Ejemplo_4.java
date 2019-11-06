package vectores;

import java.util.Scanner;

public class Ejemplo_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Tamaño de vector
        int dimension = 7;

        //Declaracion de un Vector
        String[] nombre = new String[dimension];

        //Llenar datos al vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.println("Introduzca Nombre: " + (i + 1));
            nombre[i] = leer.nextLine();
        }

        //Mostrar datos del vector dinamicamente
        for (int i = 0; i < dimension; i++) {
            System.out.print("[" + nombre[i] + "]");
        }
        System.out.println("");
        //Mostrar 4 Nombres
        for (int i = 0; i < dimension; i++) {
            if(i % 2 == 0){
                System.out.print("[" + nombre[i] + "]");
            }            
        }
    }
}
