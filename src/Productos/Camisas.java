package Productos;

import java.util.Scanner;

public class Camisas {
    public static void camisas(){

        Scanner prendaCamisa = new Scanner(System.in);

        //Cantidad
        int cantidadprenda = 0;

        //Precios
        int precioCamisaNiños = 15;
        int precioCamisaAdultos = 30;
        int preciofinal = 0;

        //Mostrar tallas
        System.out.println("Usted eligio Camisa");
        System.out.println("Por favor introduzca la talla que desea comprar:");
        System.out.println("Niños (4-16) Adultos (17-30)");

        boolean tallancamisavalida = false;
        while (!tallancamisavalida){
            int tallaCamisa = prendaCamisa.nextInt();
            prendaCamisa.nextLine();

            //Flujo segun respuesta
            if (tallaCamisa >= 4 && tallaCamisa <= 16){
                System.out.println("Talla para niños");
                System.out.println("El precio seria de: " + precioCamisaNiños + " USD");
                System.out.println("Desea Comprarla S/Si");
                String camisaniñosconf = prendaCamisa.nextLine();

                //Flujo segun confirmacion
                if (camisaniñosconf.equalsIgnoreCase("S") || camisaniñosconf.equalsIgnoreCase("Si")){
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidacamisaswhile = false;
                    while (!cantidacamisaswhile){
                        cantidadprenda = prendaCamisa.nextInt();
                        prendaCamisa.nextLine();

                        if (cantidadprenda >= 1){
                            preciofinal = cantidadprenda * precioCamisaNiños;
                            System.out.println("El total a pagar seria: " + preciofinal + " USD");
                            tallancamisavalida = true;
                            cantidacamisaswhile = true;
                        } else {
                            System.out.println("Por favor ingrese una cantidad valida");
                        }
                    }
                } else {
                    System.out.println("Regresando a la eleccionde prenda");
                    Productos.mostrarProductos(true);
                    return;
                }

            } else if (tallaCamisa >= 17 && tallaCamisa <= 30) {
                System.out.println("Talla para Adultos");
                System.out.println("El precio seria de: " + precioCamisaAdultos + " USD");
                System.out.println("Desea Comprarla S/Si");
                String camisaadultosconf = prendaCamisa.nextLine();

                //Flujo segun confirmacion
                if (camisaadultosconf.equalsIgnoreCase("S") || camisaadultosconf.equalsIgnoreCase("Si")){
                    System.out.println("Por favor ingrese la cantidad que desea comprar");

                    boolean cantidacamisaswhile = false;
                    while (!cantidacamisaswhile){
                        cantidadprenda = prendaCamisa.nextInt();
                        prendaCamisa.nextLine();

                        if (cantidadprenda >= 1){
                            preciofinal = cantidadprenda * precioCamisaAdultos;
                            System.out.println("El total a pagar seria: " + preciofinal + " USD");
                            tallancamisavalida = true;
                            cantidacamisaswhile = true;
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
