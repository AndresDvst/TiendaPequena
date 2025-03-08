import Bienvenida_Despedida.Bienvenida;
import Colores.Colores;
import Productos.Productos;
import Pago.MetodoPago;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean procesoTienda = false;

    public static void main(String[] args) {

        //Proceso de la tienda

        //Bienvenida
        String nombreusuario = Bienvenida.bienvenida1();
        boolean nombrevalido = !nombreusuario.isEmpty();

        //Bucle tienda

        while (!procesoTienda){

            //Proceso de compra
            Productos.mostrarProductos(nombrevalido);

            //Despedida


        }

    }
}