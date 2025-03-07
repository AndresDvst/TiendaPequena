package Productos;

import Colores.Colores;

import java.util.Scanner;

public class Productos {

    //Eleccion prenda
    public static void mostrarProductos(boolean nombrevalido) {
        Scanner elecionPrenda1 = new Scanner(System.in);

        if (nombrevalido) {
            System.out.println("Por favor elija la prenda que desea comprar");
            System.out.println("1. Camisa 2. Pantalon 3.Zapatos 4.Shorts");

           boolean elecionvalida = false;

           while (!elecionvalida){

               //Eleccion
               String elecioPrenda2 = elecionPrenda1.nextLine();

                    //Ruta a camisas
               if(elecioPrenda2.equalsIgnoreCase("Camisa") || elecioPrenda2.equals("1")){
                   Camisas.camisas();
                   elecionvalida = true;

                   //Seguir a selecion de colores
                   Colores.colores();

                   //Ruta a pantalones
               } else if (elecioPrenda2.equalsIgnoreCase("Pantalo") || elecioPrenda2.equalsIgnoreCase("2")) {
                   Pantalones.Pantalon();
                   elecionvalida = true;

                   //Seguir a selecion de colores
                   Colores.colores();

                   //ruta a zapatos
               } else if (elecioPrenda2.equalsIgnoreCase("Zapatos") || elecioPrenda2.equalsIgnoreCase("3")){
                   Zapatos.Zapato();
                   elecionvalida = true;

                   //Seguir a selecion de colores
                   Colores.colores();

                   //ruta a shorts
               } else if (elecioPrenda2.equalsIgnoreCase("Shorts") || elecioPrenda2.equalsIgnoreCase("4")) {
                   Shorts.Short();
                   elecionvalida = true;

                   //Seguir a selecion de colores
                   Colores.colores();

               } else {
                   System.out.println("Por favor ingrese una opcion valida");
               }
           }

        }
    }
}