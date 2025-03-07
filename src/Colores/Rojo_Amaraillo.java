package Colores;

import Pago.MetodoPago;
import Productos.Camisas;

public class Rojo_Amaraillo {
    public static void rojo_amarillo(String color){

        //Eleccion Rojo o Amrillo
        System.out.println("Has elegido el: " + color);


        //Flujo segun el caso

        //Rojo
        if (color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("1")){
            System.out.println("Este color tiene un 20% de descuento");
            MetodoPago.precioFinalDescuento = (int) (MetodoPago.precioFinal * 0.80);
            System.out.println("El precio final con desucento es " + MetodoPago.precioFinalDescuento + " USD");


        //Amarillo
        } else if(color.equalsIgnoreCase("Amarillo") || color.equalsIgnoreCase("2")) {
            System.out.println("Este color tiene un 10% de descuento");
            MetodoPago.precioFinalDescuento = (int) (MetodoPago.precioFinal * 0.90);
            System.out.println("El precio final con descuento es: " + MetodoPago.precioFinalDescuento + " USD");
        }
    }
}
