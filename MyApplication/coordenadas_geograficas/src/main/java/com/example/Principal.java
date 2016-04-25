package com.example;

/**
 * Created by josemaria.barrero on 19/04/2016.
 */
public class Principal {
    public static void main(String[] args){
        GeoPunto x,y;
        x=new GeoPunto(1,2);
        y=new GeoPunto(3,4);

        System.out.println("Resultado: " + x.distancia(y));
    }
}

