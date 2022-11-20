/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 * Si se exeden la cantidad de movimientos para la cuenta
 * @author Anvil
 */
public class MovimientosException extends Exception{

    public MovimientosException() {
        super("El numero de movimientos por hoy se ha excedido");
    }
     
}
