package Pago;

import java.util.Scanner;

public class MetodoPago {


    //Precio Final
    public static int precioFinal = 0;

    //Precio con descuento
    public static int precioFinalDescuento = 0;

    //Elegir metodo pago
    public static void elegirMetodoPago(String color){
        Scanner elegirMetodo = new Scanner(System.in);

        System.out.println("Por favor elija el metodo de pago");
        System.out.println("1.Tarjeta 2.Efectivo 3.Tranferencia");
        
        //Con descuento
        if(color.equalsIgnoreCase("1") || color.equalsIgnoreCase("Rojo")
        || color.equalsIgnoreCase("2") || color.equalsIgnoreCase("Amarillo")
        || color.equalsIgnoreCase("3") || color.equalsIgnoreCase("Azul")
        || color.equalsIgnoreCase("4") || color.equalsIgnoreCase("Verde")){

            System.out.println("Para pagar un total de: " + precioFinalDescuento + " USD");

            //Elegir Metodo
            Boolean metodoValido = false;

            while (!metodoValido){

                //Elegir
                String elegirMetodoDescuento = elegirMetodo.nextLine();

                //Flujo segun caso

                //Tarjeta
                if (elegirMetodoDescuento.equalsIgnoreCase("Tarjeta") || elegirMetodoDescuento.equalsIgnoreCase("1")){
                    Metodo_Tarejta.meotodoTarjeta();
                    metodoValido = true;

                //Efectivo
                } else if (elegirMetodoDescuento.equalsIgnoreCase("Efectivo") || elegirMetodoDescuento.equalsIgnoreCase("2")) {
                    Metodo_Efectivo.MetodoEfectivo();
                    metodoValido = true;

                //Tranferencia
                } else if (elegirMetodoDescuento.equalsIgnoreCase("3") || elegirMetodoDescuento.equalsIgnoreCase("Tranferencia")) {
                    Metodo_Transferencia.metodoTrans();
                    metodoValido = true;
                }
            }
            
        //Sin Descuento    
        } else if (color.equalsIgnoreCase("5") || color.equalsIgnoreCase("Negro")
        || color.equalsIgnoreCase("6") || color.equalsIgnoreCase("Blanco")) {

            System.out.println("Para pagar un total de: " + precioFinal + " USD");

            //Elegir Metodo
            Boolean metodoValido = false;

            while (!metodoValido){

                //Elegir
                String elegirMetodoDescuento = elegirMetodo.nextLine();

                //Flujo segun caso

                //Tarjeta
                if (elegirMetodoDescuento.equalsIgnoreCase("Tarjeta") || elegirMetodoDescuento.equalsIgnoreCase("1")){
                    Metodo_Tarejta.meotodoTarjeta();
                    metodoValido = true;

                    //Efectivo
                } else if (elegirMetodoDescuento.equalsIgnoreCase("Efectivo") || elegirMetodoDescuento.equalsIgnoreCase("2")) {
                    Metodo_EfectivoSinDescuento.MetodoEfectivo();
                    metodoValido = true;

                    //Tranferencia
                } else if (elegirMetodoDescuento.equalsIgnoreCase("3") || elegirMetodoDescuento.equalsIgnoreCase("Tranferencia")) {
                    Metodo_Transferencia.metodoTrans();
                    metodoValido = true;
                }
            }

        }
    }
}
