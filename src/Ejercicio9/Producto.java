package Ejercicio9;

public class Producto {

    private int codigo;

    private String nombre;

    private int stock;

    private double precio;


    public Producto(int codigo,String nombre,int stock,double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;

        if(stock >= 0 && precio >= 0)
        {
            System.out.println(this.nombre + "Stock y precio correcto");
        }else{
            System.out.println(this.nombre + "Algo malió sal, compruebe datos. Se colocan datos por defecto");
            this.stock = 0;
            this.precio = 0;
        }
    }

    public void vender(int cantidad) {
        if (cantidad > stock) {
            System.out.println("Vendimos todo");
            this.stock = 0;
        } else {
            this.stock -= cantidad;
        }
    }
    public void reponer(int cantidad){
        this.stock += cantidad;
    }

    public int getStock(){
        return this.stock;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}
