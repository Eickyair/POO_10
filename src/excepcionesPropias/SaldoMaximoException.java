/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 * Si se excede la cantidad de saldo maximo en la cuenta
 * @author Anvil
 */
public class SaldoMaximoException extends Exception {

    public SaldoMaximoException() {
        super("El saldo de este tipo de cuenta a sido superado");
    }
     
}
