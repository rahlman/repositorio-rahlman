/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

import java.io.IOException;

/**
 *
 * @author dam125
 */
//añadir:
//excepciones en datos no validos
//estado de la tarjeta bancaria
            //estado: bloqueada,activada, NO Activada

    
    enum estadoCB{
        BLOQUEADA, ACTIVADA, NOACTIVADA
    }

public class CuentaBancaria {
    
    estadoCB estado=estadoCB.ACTIVADA;
    
    String titular, numero_de_cuenta;
    
    double saldo, tipoDeInteres, ingreso, cantidad;
    
    public CuentaBancaria(double saldo, String titular, String numero_de_cuenta){
        
        this.saldo = saldo;
        this.titular = titular;
        this.numero_de_cuenta = numero_de_cuenta;
        
    }
    
    public double ingresarDinero(double saldo) throws IOException, ErrorIngresarDineroException{
        
        System.out.println("Introduzca cantidad a ingresar:");
        ingreso = Input.leerDouble();
        
        if (ingreso <= 0) {
            
            throw new ErrorIngresarDineroException("cantidad no valida");
            
        } else {
            
            this.saldo = this.saldo + ingreso;
            
        }
        
        return this.saldo;
    }
    
    public double retirarDinero(double saldo) throws IOException, ErrorRetirarDineroException{
        
        System.out.println("Introduzca cantidad a retirar");
        cantidad = Input.leerDouble();
        
        if (cantidad <= 0) {
            
            throw new ErrorRetirarDineroException("cantidad no valida");
            
        } else {
            
            this.saldo -= cantidad;
            
        }
        
        return this.saldo;
    }
    
    
    
    public double establecerTipoDeInteres() throws IOException, ErrorTipoDeInteresException{
        
        System.out.println("establezca tipo de interes");
        tipoDeInteres = Input.leerDouble();
        
        if (tipoDeInteres <= 0) {
            
            throw new ErrorTipoDeInteresException("cantidad no valida");
            
        }
        
        return tipoDeInteres;
    }
    
    
    
    @Override
    public boolean equals(Object obj){
    
        if (obj==null) {
            return false;
        }
        
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        //convertimos
    final CuentaBancaria otro = (CuentaBancaria) obj ;
    
    return otro.numero_de_cuenta.equals(this.numero_de_cuenta);
    
    } 
    
    
}
