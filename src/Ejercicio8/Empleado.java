package Ejercicio8;

public class Empleado {

    private String nombre;

    private String cargo;

    private double sueldoBase;

    public Empleado(String nombre, String cargo,double sueldo){
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoBase = sueldo;

        if(this.sueldoBase >= 0)
        {
            System.out.println("El sueldo de " + this.nombre + " es correcto");
        }else{
            System.out.println("El sueldo de " + this.nombre + " es negativo, por defecto se coloca 0");
            this.sueldoBase = 0;
        }

        if(cargo.equals("Jefe"))
        {
            this.sueldoBase += (20 * this.sueldoBase) / 100;
        }
    }
    public double getSueldoFinal() {
      return this.sueldoBase;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCargo(){
        return this.cargo;
    }

    public void setSueldoBase(double s){
        this.sueldoBase = s;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setCargo(String c){
        this.cargo = c;
    }






}
