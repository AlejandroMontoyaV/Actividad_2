package com.mycompany.actividad_2;
public class Actividad_2 {

    public static void main(String[] args) {
        double x,y,suma;
        suma = 0;
        x = 20;
        suma = suma + x;

        y = 40;
        x = x + Math.pow(y,2);
        suma = suma + (x/y);
        
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
                                     
    }
}
