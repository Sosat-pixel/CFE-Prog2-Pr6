package Ejercicio8;

public class Main {
    public static void main(String[] args){

    Empleado e1 = new Empleado("Pedro","Empleado",-100);
    Empleado e2 = new Empleado("El jefe","Jefe",100);

        System.out.println("Sueldo " + e1.getSueldoFinal());
        System.out.println("Sueldo " + e2.getSueldoFinal());

    }
}
