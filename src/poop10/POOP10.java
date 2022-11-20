/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import excepcionesPropias.MovimientosException;
import excepcionesPropias.SaldoInsuficienteException;
import excepcionesPropias.SaldoMaximoException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author poo01alu08
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            String mensajes[] = {"Mensaje 1", "Mensaje 2", "Mensaje 3"};
            for (int i = 0; i <= mensajes.length; i++){
                System.out.println(mensajes[i]);    
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            //e.printStackTrace();
        }
        System.out.println("################");
        try{
            float x = 10/2;
            System.out.println("X= "+x);
        } catch(ArithmeticException e){
            System.out.println("Error, no se puede dividir entre 0");
        }finally{
            System.out.println("Cualquier cosa que suceda entra al finally");
        }
        
        System.out.println("########Catch Anidado########");
        try{
            float x = 10/0;
            System.out.println("X= "+x);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            //e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Error, no se puede dividir entre 0");
        }
        
        System.out.println("########Propagacion de Excepciones########");
        try{
            float division = metodoDivision(4,0);
            System.out.println("Division = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion que sucede en el metodo");
        }
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@Excepciones Marcadas@@@@@@@@@@@@@@@@@@@@@@@");
        try{
            float div = metodoDivisionMarcada(5,0);
        }catch(ArithmeticException e){
            System.out.println("Excepcion de division entre 0 marcada");
        }
        
        System.out.println("########Creacion de excepciones###########");
        Cuenta cuenta = new Cuenta();
        try {
        cuenta.depositar(18_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
        }catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        } catch (SaldoMaximoException ex) {
            System.out.println(ex.getMessage());;
        } catch (MovimientosException ex) {
            System.out.println(ex.getMessage());
        }  
        
        prueba();
    }
    /**
     * Division entre dos numeros
     * @param a Numerador
     * @param b Denominador
     * @return Division de ambos
     */
    private static float metodoDivision(int a, int b) {
        return a/b;
    }
    /**
     * Division entre dos numeros
     * @param a Numerador
     * @param b Denominador
     * @return Division entre ambos
     * @throws ArithmeticException Si b es igual a 0 entonces la division es indefinida
     */
    private static float metodoDivisionMarcada(int a, int b) throws ArithmeticException{
        return a/b;
    }
    /**
     * Test de las excepciones
     */
    private static void prueba(){
        Cuenta pedro = new Cuenta();
        System.out.println("_____PRUEBA_____");
        try {
            pedro.depositar(20_001);
        } catch (SaldoMaximoException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            pedro.retirar(100);
        }catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());
        }catch (MovimientosException ex) {
            java.util.logging.Logger.getLogger(POOP10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try{
            pedro.depositar(10_000);
            pedro.retirar(100);
            pedro.retirar(1000);
            pedro.retirar(100);
            pedro.retirar(100);
        }catch(SaldoMaximoException ex){
            System.out.println(ex.getMessage());
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        } catch (MovimientosException ex) {
            System.out.println(ex.getMessage());
        }
    }
}