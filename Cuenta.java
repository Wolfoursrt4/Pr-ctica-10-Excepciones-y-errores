/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop10;

/**
 *
 * @author Luis
 */
public class Cuenta {
    private double saldo;

    public Cuenta() { //inicializa en cero
        this.saldo = 0;
    }
    public void depositar(double monto) throws SaldoExcedidoException{ 
        System.out.println("Depositando"+monto);
        if(20000<monto)
            throw new SaldoExcedidoException();
        
        saldo+=monto;
    }
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando"+monto);
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        saldo-=monto;
    }
    public void consultaSaldo(){
        System.out.println("El saldo es: "+saldo);
    }
    
}
