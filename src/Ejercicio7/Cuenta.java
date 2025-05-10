package Ejercicio7;

public class Cuenta {

    private int numero;

    private String titular;

    private double saldo;

    public Cuenta(int numero,String titular){
        this.numero = numero;
        this.titular = titular;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    public void retirar(double monto){
        if(this.saldo >= monto){
            this.saldo -= monto;
        }else{
            System.out.println("Saldo insuficiente");
            this.saldo = 0;
        }
    }

    public int getNumero(){
        return this.numero;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
