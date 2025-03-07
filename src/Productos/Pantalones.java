package Productos;

import Pago.MetodoPago;

import java.util.Scanner;

public class Pantalones {
    public static void Pantalon(){

        Scanner prendapantalon = new Scanner(System.in);

        //Cantidad
        int cantidadprenda = 0;

        //Precios
        int precioPantalonNiños = 30;
        int precioPantalonAdultos = 60;

        //Mostrar tallas
        System.out.println("Usted eligio Pantalon");
        System.out.println("Por favor introduzca la talla que desea comprar:");
        System.out.println("Niños (16-32) Adultos (33-44)");

        boolean tallaPantalonValida = false;
        while (!tallaPantalonValida){
            int tallaPantalon = prendapantalon.nextInt();
            prendapantalon.nextLine();

            //Flujo segun respuesta
            if (tallaPantalon >= 16 && tallaPantalon <= 32){
                System.out.println("Talla para niños");
                System.out.println("El precio seria de: " + precioPantalonNiños + " USD");
                System.out.println("Desea Comprarlo S/Si");
                String pantalonniñosconf = prendapantalon.nextLine();

                //Flujo segun confirmacion
                if (pantalonniñosconf.equalsIgnoreCase("S") || pantalonniñosconf.equalsIgnoreCase("Si")){
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidadpantalonwhile = false;
                    while (!cantidadpantalonwhile){
                        cantidadprenda = prendapantalon.nextInt();
                        prendapantalon.nextLine();

                        if (cantidadprenda >= 1){
                            MetodoPago.precioFinal = cantidadprenda * precioPantalonNiños;
                            System.out.println("El total a pagar seria: " + MetodoPago.precioFinal + " USD");
                            tallaPantalonValida = true;
                            cantidadpantalonwhile = true;
                        } else {
                            System.out.println("Por favor ingrese una cantidad valida");
                        }
                    }
                } else {
                    System.out.println("Regresando a la eleccionde prenda");
                    Productos.mostrarProductos(true);
                    return;
                }

            } else if (tallaPantalon >= 33 && tallaPantalon <= 44) {
                System.out.println("Talla para Adultos");
                System.out.println("El precio seria de: " + precioPantalonAdultos + " USD");
                System.out.println("Desea Comprarlo S/Si");
                String pantalonadultosconf = prendapantalon.nextLine();

                //Flujo segun confirmacion
                if (pantalonadultosconf.equalsIgnoreCase("S") || pantalonadultosconf.equalsIgnoreCase("Si")){
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidadpantalonwhile = false;
                    while (!cantidadpantalonwhile){
                        cantidadprenda = prendapantalon.nextInt();
                        prendapantalon.nextLine();

                        if (cantidadprenda >= 1){
                            MetodoPago.precioFinal = cantidadprenda * precioPantalonAdultos;
                            System.out.println("El total a pagar seria: " + MetodoPago.precioFinal + " USD");
                            tallaPantalonValida = true;
                            cantidadpantalonwhile = true;
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
