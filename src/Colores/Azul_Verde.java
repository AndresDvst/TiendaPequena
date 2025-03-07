package Colores;

import Pago.MetodoPago;

public class Azul_Verde {
    public static void azul_verde (String color){

        //Eleccion Azul_Verde
        System.out.println("Has elegido el: " + color);


        //Flujo segun el caso

            //Azul
        if (color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("3")){
            System.out.println("Este color tiene un 30% de descuento");
            MetodoPago.precioFinalDescuento = (int) (MetodoPago.precioFinal * 0.70);
            System.out.println("El precio final con desucento es " + MetodoPago.precioFinalDescuento + " USD");


            //Verde
        } else if(color.equalsIgnoreCase("Verde") || color.equalsIgnoreCase("4")) {
            System.out.println("Este color tiene un 15% de descuento");
            MetodoPago.precioFinalDescuento = (int) (MetodoPago.precioFinal * 0.85);
            System.out.println("El precio final con descuento es: " + MetodoPago.precioFinalDescuento + " USD");
        }
    }

}
