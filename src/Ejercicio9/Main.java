package Ejercicio9;

public class Main {
    public static void main(String[] args){

        Producto p1 = new Producto(101,"pepitas",-100,100);
        Producto p2 = new Producto(100,"Alpargatas",20,800);

        p1.vender(200);
        System.out.println(p1.getStock());
    }
}
