package Pago;

import java.util.Scanner;

public class Metodo_Transferencia {
    public static void metodoTrans (){
        Scanner MetodoTrans = new Scanner(System.in);

        //Mensajes
        System.out.println("Procesando Seleccion...");
        System.out.println("Usted ha elegido el metodo de pago tranferencia");
        System.out.println("Por favor indique el monto a pagar");

        //Operacion
        Boolean operacion = false;

        while (!operacion){
            int montoTrans = MetodoTrans.nextInt();

            //Si el valor es correcto
            if (montoTrans == MetodoPago.precioFinalDescuento || montoTrans == MetodoPago.precioFinal){
                System.out.println("Por favor indique los 4 digitos de su cuenta: ");
                System.out.println("Procesando pago...");
                System.out.println("Pago procesado");
                MetodoTrans.close();


            //Si el valor es incorrecto
            } else {
                System.out.println("Por favor ingrese el monto correcto");
                System.out.println("Por favor indique el monto a pagar");
                continue;
            }
        }
    }
}
