package Productos;

import Pago.MetodoPago;

import java.util.Scanner;

public class Shorts {
    public static void Short() {
        Scanner prendaShort = new Scanner(System.in);

        //Cantidad
        int cantidadprenda = 0;

        //Precios
        int precioShortNiños = 10;
        int precioShortAdultos = 20;

        //Mostrar tallas
        System.out.println("Usted eligió Short");
        System.out.println("Por favor introduzca la talla que desea comprar:");
        System.out.println("Niños (16-32) Adultos (33-44)");

        boolean tallaShortValida = false;
        while (!tallaShortValida) {
            int tallaShort = prendaShort.nextInt();
            prendaShort.nextLine();

            //Flujo según respuesta
            if (tallaShort >= 4 && tallaShort <= 16) {
                System.out.println("Talla para niños");
                System.out.println("El precio sería de: " + precioShortNiños + " USD");
                System.out.println("¿Desea comprarlo? S/Si");

                String shortniñosconf = prendaShort.nextLine();

                //Flujo según confirmación
                if (shortniñosconf.equalsIgnoreCase("S") || shortniñosconf.equalsIgnoreCase("Si")) {
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidadshortwhile = false;
                    while (!cantidadshortwhile) {
                        cantidadprenda = prendaShort.nextInt();
                        prendaShort.nextLine();

                        if (cantidadprenda >= 1) {
                            MetodoPago.precioFinal = cantidadprenda * precioShortNiños;
                            System.out.println("El total a pagar sería: " + MetodoPago.precioFinal + " USD");
                            tallaShortValida = true;
                            cantidadshortwhile = true;
                        } else {
                            System.out.println("Por favor ingrese una cantidad válida");
                        }
                    }
                } else {
                    System.out.println("Regresando a la elección de prenda");
                    Productos.mostrarProductos(true);
                    return;
                }

            } else if (tallaShort >= 17 && tallaShort <= 30) {
                System.out.println("Talla para Adultos");
                System.out.println("El precio sería de: " + precioShortAdultos + " USD");
                System.out.println("¿Desea comprarlo? S/Si");

                String shortadultosconf = prendaShort.nextLine();

                //Flujo según confirmación
                if (shortadultosconf.equalsIgnoreCase("S") || shortadultosconf.equalsIgnoreCase("Si")) {
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidadshortwhile = false;
                    while (!cantidadshortwhile) {
                        cantidadprenda = prendaShort.nextInt();
                        prendaShort.nextLine();

                        if (cantidadprenda >= 1) {
                            MetodoPago.precioFinal = cantidadprenda * precioShortAdultos;
                            System.out.println("El total a pagar sería: " + MetodoPago.precioFinal + " USD");
                            tallaShortValida = true;
                            cantidadshortwhile = true;
                        } else {
                            System.out.println("Por favor ingrese una cantidad válida");
                        }
                    }
                } else {
                    System.out.println("Regresando a la elección de prenda");
                    Productos.mostrarProductos(true);
                    return;
                }
            } else {
                System.out.println("Por favor introduzca una talla válida");
            }
        }

    }
}
