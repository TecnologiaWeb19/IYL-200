package Ejemplos;

public class Ejemplo_4 {
    public static void main(String[] args) {
        String letra = "hola amigos ";
        String letra2 = "como estan?";
        String unir = letra + letra2;
        System.out.println(unir);
    
        String texto = "INFORMATICA";

        //Convertir de miniscula a mayuscula -> mayuscula a minuscula
        System.out.println(letra.toUpperCase());
        System.out.println(letra2.toUpperCase());
        System.out.println(unir.toUpperCase());
        
        System.out.println(texto.toLowerCase());
    }
}
