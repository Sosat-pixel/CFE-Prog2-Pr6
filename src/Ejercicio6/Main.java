package Ejercicio6;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro("La divina comedia", "Dante", 1998);

        System.out.println("Título " + l1.getTitulo());
        System.out.println("Autor " + l1.getAutor());
        System.out.println("Año " + l1.getAnio());


        System.out.println();

        l1.setAnio(2040);
        l1.setAutor("yo");

        System.out.println("Título " + l1.getTitulo());
        System.out.println("Autor " + l1.getAutor());
        System.out.println("Año " + l1.getAnio());


    }
}
