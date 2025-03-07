package Colores;

import Pago.MetodoPago;

import java.util.Scanner;

public class Colores {
    public static String colores() {
        Scanner eleccionColor = new Scanner(System.in);
        Boolean eleccionColorValida = false;
        String elegirColor = "";

        //Mostrar colores
        System.out.println("Mostrando colores disponibles");
        System.out.println("1.Rojo 2.Amarillo 3.Azul 4.Verde 5.Negro 6.Blanco");
        System.out.println("Elija un color por favor:");

        while (!eleccionColorValida){
            elegirColor = eleccionColor.nextLine().trim();

            //Eleccion Rojo_Amarillo
            if (elegirColor.equalsIgnoreCase("Rojo") || elegirColor.equals("1") ||
                    elegirColor.equalsIgnoreCase("Amarillo") || elegirColor.equals("2")){
                Rojo_Amaraillo.rojo_amarillo(elegirColor);
                eleccionColorValida = true;
                MetodoPago.elegirMetodoPago(elegirColor);

            //Eleccion Azul_Verde
            } else if (elegirColor.equalsIgnoreCase("Azul") || elegirColor.equalsIgnoreCase("3")
               || elegirColor.equalsIgnoreCase("Verde") || elegirColor.equalsIgnoreCase("4")) {
                Azul_Verde.azul_verde(elegirColor);
                eleccionColorValida = true;
                MetodoPago.elegirMetodoPago(elegirColor);

            //Eleccion Negro_Blanco
            } else if (elegirColor.equalsIgnoreCase("Negro") || elegirColor.equalsIgnoreCase("5")
                || elegirColor.equalsIgnoreCase("Blanco") || elegirColor.equalsIgnoreCase("6")){
                System.out.println("Este color no tiene descuento");
                System.out.println("Desea elegir un color con descuento? S/N");

                //Confirmacion
                boolean confirmacionValida = false;

                while (!confirmacionValida){
                    String confirmacionPrendaDescuento = eleccionColor.nextLine();

                    if (confirmacionPrendaDescuento.equalsIgnoreCase("S") || confirmacionPrendaDescuento.equalsIgnoreCase("Si")){
                        System.out.println("Elija un color por favor:");
                        confirmacionValida = true;
                        continue;
                    } else if (confirmacionPrendaDescuento.equalsIgnoreCase("N") || confirmacionPrendaDescuento.equalsIgnoreCase("No")) {
                        System.out.println("El total de su compra seria: " + MetodoPago.precioFinal + " USD");
                        confirmacionValida = true;
                        eleccionColorValida = true;
                        MetodoPago.elegirMetodoPago(elegirColor);
                    } else {
                        System.out.println("Por Favor elija una respuesta valida");
                    }
                }

            } else {
                System.out.println("Por favor elija un color valido");
            }
        }
        return elegirColor;
    }
}
