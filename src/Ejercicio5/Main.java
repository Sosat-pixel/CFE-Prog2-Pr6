package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Pedro", 125);

        System.out.println(p1.getNombre());
        System.out.println("");
        p1.setNombre("Joaco");
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println("");
        p1.setEdad(130);
        System.out.println(p1.getEdad());

    }
}
