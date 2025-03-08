package Bienvenida_Despedida;

import Main.Main;



import java.util.Scanner;

public class Despedida {

    private static Scanner despedida = new Scanner(System.in);

    public static void despedida (){

        //Despedida
        System.out.println("Muchas Gracias por su compra");
        System.out.println("Desea comprar algun otra prenda? S/N");

        //Para comprar mas
        Boolean comprarOtraPrenda = false;

        while (!comprarOtraPrenda){
            String confirmacionOtra = despedida.nextLine();

            //Segun confirmacion

            //Positiva
            if (confirmacionOtra.equalsIgnoreCase("Si") || confirmacionOtra.equalsIgnoreCase("S")){
                System.out.println("Procesando otra compra...");
                comprarOtraPrenda = true;
                Main.procesoTienda = false;
                continue;

            //Negativa
            } else {
                System.out.println("Gracias por su compra, por favor vuelva pronto");
                System.out.println("Cerrando tienda...");
                comprarOtraPrenda = true;
                Main.procesoTienda = true;
                despedida.close();
            }
        }
    }
}
