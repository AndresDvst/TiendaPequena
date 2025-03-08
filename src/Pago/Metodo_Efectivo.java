package Pago;

import java.util.Scanner;

public class Metodo_Efectivo {
    public static void MetodoEfectivo (){
        Scanner metodoEfectivo = new Scanner(System.in);

        //Mensaje
        System.out.println("Procesando seleccion...");
        System.out.println("Usted ha elegido el metodo de pago efectivo");
        System.out.println("Por favor ingrese cuanto desea pagar en efectivo:");

        //Operacion
        Boolean cantidadEfectivo = false;

        while (!cantidadEfectivo) {
            int tamañoEfectivo = metodoEfectivo.nextInt();

            //Flujo segun caso
            if (tamañoEfectivo > MetodoPago.precioFinalDescuento){
                System.out.println("Procesando cantidad de efectivo...");
                System.out.println("La cantidad en efectivo que desea pagar es: " + tamañoEfectivo + " USD");
                System.out.println("Y su cuenta es: " + MetodoPago.precioFinalDescuento + " USD");
                System.out.println("Desea confirmar el pago? S/N");

                //Segun confirmacion
                Boolean confirmacionEfectivo = false;

                while (!confirmacionEfectivo){
                    String confirmacionTamñoEfectivo = metodoEfectivo.nextLine();

                    //Confirmacion Positiva
                    if (confirmacionTamñoEfectivo.equalsIgnoreCase("S") || confirmacionTamñoEfectivo.equalsIgnoreCase("Si")){
                        System.out.println("Procesado efectivo...");
                        int vueltosEfectivo = 0;
                        vueltosEfectivo = tamañoEfectivo - MetodoPago.precioFinalDescuento;
                        System.out.println("Su efectivo es: " + tamañoEfectivo + " USD");
                        System.out.println("Y su vuelto es: " + vueltosEfectivo + " USD");
                        confirmacionEfectivo = true;
                        cantidadEfectivo = true;
                        metodoEfectivo.close();

                    //Confirmacion Negativa
                    } else if (confirmacionTamñoEfectivo.equalsIgnoreCase("N") || confirmacionTamñoEfectivo.equalsIgnoreCase("No")) {
                        System.out.println("Por favor confirme que cantidad desea pagar en efectivo");
                        System.out.println("Por favor ingrese cuanto desea pagar en efectivo:");
                        confirmacionEfectivo = true;
                        continue;
                    }
                }
            }
        }
    }
}
