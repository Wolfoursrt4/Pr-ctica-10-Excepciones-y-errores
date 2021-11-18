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
public class SaldoExcedidoException extends Exception {

    public SaldoExcedidoException() {
        super("No se puede ingresar mas de 20,000");
    }
    
}
