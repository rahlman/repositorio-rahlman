/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

/**
 *
 * @author dam125
 */
class ErrorRetirarDineroException extends Exception {
    
    public ErrorRetirarDineroException (String msg){
        super (msg);
    }
}