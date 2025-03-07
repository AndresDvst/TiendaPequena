import Productos.Productos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Bienvenida
        String nombreusuario = Bienvenida.bienvenida1();
        boolean nombrevalido = !nombreusuario.isEmpty();

        //Seleccion producto a comprar
        Productos.mostrarProductos(nombrevalido);

        //Colores

    }
}