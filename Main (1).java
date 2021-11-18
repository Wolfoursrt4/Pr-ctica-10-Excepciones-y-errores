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
public class Main {
    public static void main(String[] args) {
        System.out.println("#####Arreglos####");
        
        try{
            String mensajes[]={"Mensaje uno","Mensaje dos", "Mensaje tres"};
            for(int i=0; 1<3; i++){ //se quiere imprimir un cuarto elemento que no existe en el arreglo
                System.out.println(mensajes[i]);

            }
        }catch(ArrayIndexOutOfBoundsException e){ //con objeto e para poder utilizarlo
            System.out.println("Error apuntador de fuera de rango de el arreglo");
            System.out.println(e);   
        }
        finally{
            System.out.println("A pesar de todo, se ejecuta el bloque");
        }
        System.out.println("#####Aritmetica####");
        
        try{
            float equis = 5/0;
            System.out.println(equis);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Error general: "+e.getMessage());
        }
        
        System.out.println("#####Propagación####");
        try{
            int division = division(10,0);
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Ocurrio un error:"+e.getMessage());
        }
        int div2 = division2(4,0);
            System.out.println(div2);
        
        System.out.println("#####throw-throws####");
        try{
            int div3 = division3(6,0);
            System.out.println(div3);
        }catch(ArithmeticException e){
            System.out.println("Ocurrio un error:"+e.getMessage());
        }
        System.out.println("#####nuevas excepciones####");
        Cuenta miCuenta = new Cuenta();
        try{
            miCuenta.depositar(2000);
            miCuenta.consultaSaldo();
            miCuenta.retirar(1500);
            miCuenta.consultaSaldo();
            miCuenta.retirar(650);
            miCuenta.consultaSaldo();
        }catch(SaldoInsuficienteException e){
            System.out.println("Error "+e.getMessage());
        }    
        try{
            miCuenta.consultaSaldo();
            miCuenta.depositar(21000);
            miCuenta.consultaSaldo();
        }catch(SaldoExcedidoException e){
            System.out.println("Error "+e.getMessage());
        }
        
    }
    
    private static int division2(int a, int b) { // se crea un método
        int c = 0;
        try{
            c=a/b;
            
        }catch(ArithmeticException e){
            System.out.println("error"+e);
        }
        return c;
    }

    private static int division(int a, int b) {
        int c=a/b;
        return c;
    }

    private static int division3(int a, int b)throws ArithmeticException { 
        if(b==0){
            throw new ArithmeticException("Error, no lo vuelvas a hacer");
        }
        int c=a/b;
        return c;
    }
}
    
