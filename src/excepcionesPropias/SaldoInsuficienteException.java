/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 * Excepcion para retirar dinero
 * @author poo01alu08
 */
public class SaldoInsuficienteException extends Exception{
    /**
     * Constructor
     */
    public SaldoInsuficienteException() {
        super("Saldo Insuficiente");
    }
    
    
}
