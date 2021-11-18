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
public class SaldoInsuficienteException extends Exception {
    //esta heredado
    public SaldoInsuficienteException() {
        super("Saldo insuficiente");
    }
    
}
