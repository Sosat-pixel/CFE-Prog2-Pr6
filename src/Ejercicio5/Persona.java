package Ejercicio5;

public class Persona {

    private String nombre;

    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

        System.out.println("Persona creada" + nombre);
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setEdad(int e){
        this.edad = e;
    }
}
