package objeto;

public class MetodoPrincipal {
    public static void main(String[] args) {       
        Persona maria = new Persona();
        maria.mostrar("Maria", "Yujra", 123465, "01-01-2000", 50);
        
        Persona kevin = new Persona();
        kevin.mostrar("Kevin", "Calcina", 98654, "11-11-2100", 100);
    }
}
