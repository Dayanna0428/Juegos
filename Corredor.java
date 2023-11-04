/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author derly
 */
public class Corredor {
    private int dr;
    private String nombre;

    public Corredor() {
   
        this.dr=0;
        this.nombre="asignado";
    }

   
   
    public Corredor(int dr,String nombre ) {
        this.dr = dr;
        this.nombre=nombre;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }
   
   public void correr(){
   
   this.dr=this.dr+50;
   
   }
   
   public void SaltarObs(){
       System.out.println("hola desde saltar...."+this.nombre);
       int dado20=0;
       
       dado20 = (int) (Math.random() * (20 - 1+1));
       
       if(dado20<11){
       
           this.dr=this.dr-20;
       
       }
       
   }  
   
   public void mostrar(){
   
        System.out.println("dr: "+this.dr);
        System.out.println("Nombre: "+this.nombre);
    }  
       
     
   
   
}

