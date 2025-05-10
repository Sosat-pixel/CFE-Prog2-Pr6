package Ejercicio7;

public class Main {
    public static void main(String[] args){

    Cuenta c1 = new Cuenta(1253223,"José");

    System.out.println("Titular " + c1.getTitular());
    System.out.println("NumCuenta " + c1.getNumero());
    System.out.println("Saldo " + c1.getSaldo());

    c1.depositar(1000);

    System.out.println("Saldo " + c1.getSaldo());

    c1.retirar(1001);

    System.out.println("Saldo " + c1.getSaldo());


    }
}
