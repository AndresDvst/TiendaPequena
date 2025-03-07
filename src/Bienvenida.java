import java.util.Scanner;

public class Bienvenida {
    public static String bienvenida1() {
        System.out.println("Bienvenido a tiendas 1A");
        Scanner introduzcanombre = new Scanner(System.in);
        String nombreusuario = "";

        while (nombreusuario.isEmpty()){
            System.out.println("Por favor introduzaca su nombre: ");
            nombreusuario = introduzcanombre.nextLine().trim();

            if(nombreusuario.isEmpty()){
                System.out.println("El nombre no puede estar vacio");
            }
        }

        System.out.println("Bienvenido " + nombreusuario + " a tiendas 1A");

        return nombreusuario;
    }
}
