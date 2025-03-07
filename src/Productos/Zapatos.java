package Productos;

import Pago.MetodoPago;

import java.util.Scanner;

public class Zapatos {
    public static void Zapato(){

        Scanner prendazapatos = new Scanner(System.in);

        //Cantidad
        int cantidadprenda = 0;

        //Precios
        int precioZapatosNiños = 100;
        int precioZapatosAdultos = 120;

        //Mostrar tallas
        System.out.println("Usted eligio Productos.Productos.Zapatos");
        System.out.println("Por favor introduzca la talla que desea comprar:");
        System.out.println("Niños (20-36) Adultos (37-44)");

        boolean tallaZapatosValida = false;
        while (!tallaZapatosValida){
            int tallaZapatos = prendazapatos.nextInt();
            prendazapatos.nextLine();

            //Flujo segun respuesta
            if (tallaZapatos >= 20 && tallaZapatos <= 36){
                System.out.println("Talla para niños");
                System.out.println("El precio seria de: " + precioZapatosNiños + " USD");
                System.out.println("Desea Comprarlos S/Si");
                String zapatosniñosconf = prendazapatos.nextLine();

                //Flujo segun confirmacion
                if (zapatosniñosconf.equalsIgnoreCase("S") || zapatosniñosconf.equalsIgnoreCase("Si")){
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidadZapatoswhile = false;
                    while (!cantidadZapatoswhile){
                        cantidadprenda = prendazapatos.nextInt();
                        prendazapatos.nextLine();

                        if (cantidadprenda >= 1){
                            MetodoPago.precioFinal = cantidadprenda * precioZapatosNiños;
                            System.out.println("El total a pagar seria: " + MetodoPago.precioFinal + " USD");
                            tallaZapatosValida = true;
                            cantidadZapatoswhile = true;
                        } else {
                            System.out.println("Por favor ingrese una cantidad valida");
                        }
                    }
                } else {
                    System.out.println("Regresando a la eleccionde prenda");
                    Productos.mostrarProductos(true);
                    return;
                }

            } else if (tallaZapatos >= 37 && tallaZapatos <= 44) {
                System.out.println("Talla para Adultos");
                System.out.println("El precio seria de: " + precioZapatosAdultos + " USD");
                System.out.println("Desea Comprarlos S/Si");
                String zapatosadultosconf = prendazapatos.nextLine();

                //Flujo segun confirmacion
                if (zapatosadultosconf.equalsIgnoreCase("S") || zapatosadultosconf.equalsIgnoreCase("Si")){
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidadZapatoswhile = false;
                    while (!cantidadZapatoswhile){
                        cantidadprenda = prendazapatos.nextInt();
                        prendazapatos.nextLine();

                        if (cantidadprenda >= 1){
                            MetodoPago.precioFinal = cantidadprenda * precioZapatosAdultos;
                            System.out.println("El total a pagar seria: " + MetodoPago.precioFinal + " USD");
                            tallaZapatosValida = true;
                            cantidadZapatoswhile = true;
                        } else {
                            System.out.println("Por favor ingrese una cantidad valida");
                        }
                    }
                } else {
                    System.out.println("Regresando a la eleccionde prenda");
                    Productos.mostrarProductos(true);
                    return;
                }
            } else {
                System.out.println("Por favor introduzca una talla valida");
            }
        }
    }
}
