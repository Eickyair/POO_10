/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.MovimientosException;
import excepcionesPropias.SaldoMaximoException;
/**
 * Objeto que representa una cuenta bancaria
 * @author poo01alu08
 */
class Cuenta {
    private double saldo;
    private int movimientos = 3;
    /**
     * Constructor vacio
     */
    public Cuenta() {
    }
    /**
     * Retiro de dinero a la cuenta
     * @param monto Cantidad de dinero a retirar
     * @throws SaldoInsuficienteException Si el monte es mayor al saldo entonces hay un error
     */
    public void retirar (double monto) throws SaldoInsuficienteException, MovimientosException{
        if(this.movimientos==0)
            throw new MovimientosException();
        System.out.println("Retirando...$"+monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            this.saldo -= monto;
            this.movimientos-=1;
    }
    /**
     * Deposito a una cuenta bancaria
     * @param monto Cantidad que vamos agrear
     */
    public void depositar(double monto) throws SaldoMaximoException{
        System.out.println("Depositando...$"+monto);
        if(saldo + monto > 20_000){
            throw new SaldoMaximoException();
        }else
            this.saldo += monto;
    }
    /**
     * Encapsulamiento del saldo
     * @return valor del saldo que posee la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    
}
