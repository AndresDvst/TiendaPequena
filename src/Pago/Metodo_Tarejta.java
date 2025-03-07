package Pago;

import java.util.Scanner;

public class Metodo_Tarejta {
    public static void meotodoTarjeta(){
        Scanner MetodoTarjeta = new Scanner(System.in);

        //Mensaje
        System.out.println("Procesando Seleccion...");
        System.out.println("Usted ha elegido el metodo de pago tarjeta");
        System.out.println("Por favor ingrese los ultimo 4 digitos de la tarjeta:");

        //Operacion
        Boolean operacion = false;

        while (!operacion){

            //Inicio Operacion
            String numeroTarjeta = MetodoTarjeta.nextLine().trim();

            //Flujo si es correcto
            if (numeroTarjeta.matches("\\d{4}")){
                System.out.println("Procesando numero de tarjeta...");
                System.out.println("Numero de Tarjeta valido");
                System.out.println("Por favor seleccione el tipo de tarjeta");
                System.out.println("1.Ahorro 2.Corriente 3.Credito");

                //Flujo segun tipo de tarjeta
                Boolean tipoDeTarjeta = false;

                while (!tipoDeTarjeta){
                    String confirmacionTipoTarjeta = MetodoTarjeta.nextLine();

                    //Flujo despues de seleccion

                    //Ahorro
                    if (confirmacionTipoTarjeta.equalsIgnoreCase("1") || confirmacionTipoTarjeta.equalsIgnoreCase("Ahorro")){
                        System.out.println("Usted selecciono el tipo Ahorro");
                        System.out.println("Este es el tipo correcto de tarjeta? S/N");

                        //Confirmacion tipo de tarjeta
                        Boolean confirmacionTipotarjeta = false;

                        while (!confirmacionTipotarjeta){
                            String confirmacion = MetodoTarjeta.nextLine();

                            //Flujo si es positivo
                            if (confirmacion.equalsIgnoreCase("S") || confirmacion.equalsIgnoreCase("Si")){
                                System.out.println("Procesando tipo de tarjeta...");
                                System.out.println("Por favor ingrese la clave de la tarjeta");

                                //Clave tarjeta correcta
                                Boolean claveCorrecta = false;

                                while (!claveCorrecta){
                                    String claveTarjeta = MetodoTarjeta.nextLine();

                                    //Clave correcta
                                    if (claveTarjeta.matches("\\d{4}")){
                                        System.out.println("Procesando clave...");
                                        System.out.println("La clave es correcta");
                                        System.out.println("Procesando pago...");
                                        System.out.println("Pago procesado");
                                        claveCorrecta = true;
                                        confirmacionTipotarjeta = true;
                                        tipoDeTarjeta = true;
                                        operacion = true;

                                    //Clave incorrecta
                                    } else {
                                        System.out.println("Clave incorrecta");
                                        System.out.println("Por favor introduzca la clave de nuevo");
                                        continue;
                                    }
                                }

                            //Flujo si es negativo
                            } else if (confirmacion.equalsIgnoreCase("No") || confirmacion.equalsIgnoreCase("N")){
                                System.out.println("Por favor seleccion el tipo de tarjeta correcto");
                                System.out.println("Por favor seleccione el tipo de tarjeta");
                                System.out.println("1.Ahorro 2.Corriente 3.Credito");
                                confirmacionTipotarjeta = true;
                                continue;

                            //Si la respuesta no es valida
                            } else{
                                System.out.println("Por favor ingrese una respuesta valida");
                                confirmacionTipotarjeta = false;;
                                continue;
                            }
                        }

                    //Corriente
                    } else if (confirmacionTipoTarjeta.equalsIgnoreCase("Corriente") || confirmacionTipoTarjeta.equalsIgnoreCase("2")){

                        System.out.println("Usted selecciono el tipo Corriente");
                        System.out.println("Este es el tipo correcto de tarjeta? S/N");

                        //Confirmacion tipo de tarjeta
                        Boolean confirmacionTipotarjeta = false;

                        while (!confirmacionTipotarjeta){
                            String confirmacion = MetodoTarjeta.nextLine();

                            //Flujo si es positivo
                            if (confirmacion.equalsIgnoreCase("S") || confirmacion.equalsIgnoreCase("Si")){
                                System.out.println("Procesando tipo de tarjeta...");
                                System.out.println("Por favor ingrese la clave de la tarjeta");

                                //Clave tarjeta correcta
                                Boolean claveCorrecta = false;

                                while (!claveCorrecta){
                                    String claveTarjeta = MetodoTarjeta.nextLine();

                                    //Clave correcta
                                    if (claveTarjeta.matches("\\d{4}")){
                                        System.out.println("Procesando clave...");
                                        System.out.println("La clave es correcta");
                                        System.out.println("Procesando pago...");
                                        System.out.println("Pago procesado");
                                        claveCorrecta = true;
                                        confirmacionTipotarjeta = true;
                                        tipoDeTarjeta = true;
                                        operacion = true;

                                        //Clave incorrecta
                                    } else {
                                        System.out.println("Clave incorrecta");
                                        System.out.println("Por favor introduzca la clave de nuevo");
                                        continue;
                                    }
                                }

                                //Flujo si es negativo
                            } else if (confirmacion.equalsIgnoreCase("No") || confirmacion.equalsIgnoreCase("N")){
                                System.out.println("Por favor seleccion el tipo de tarjeta correcto");
                                System.out.println("Por favor seleccione el tipo de tarjeta");
                                System.out.println("1.Ahorro 2.Corriente 3.Credito");
                                confirmacionTipotarjeta = true;
                                continue;

                                //Si la respuesta no es valida
                            } else{
                                System.out.println("Por favor ingrese una respuesta valida");
                                confirmacionTipotarjeta = false;;
                                continue;
                            }
                        }

                    //Credito
                    } else if (confirmacionTipoTarjeta.equalsIgnoreCase("Credito") || confirmacionTipoTarjeta.equalsIgnoreCase("3")) {

                        System.out.println("Usted selecciono el tipo Credito");
                        System.out.println("Este es el tipo correcto de tarjeta? S/N");

                        //Confirmacion tipo de tarjeta
                        Boolean confirmacionTipotarjeta = false;

                        while (!confirmacionTipotarjeta){
                            String confirmacion = MetodoTarjeta.nextLine();

                            //Flujo si es positivo
                            if (confirmacion.equalsIgnoreCase("S") || confirmacion.equalsIgnoreCase("Si")){
                                System.out.println("Procesando tipo de tarjeta...");
                                System.out.println("Por favor ingrese la clave de la tarjeta");

                                //Clave tarjeta correcta
                                Boolean claveCorrecta = false;

                                while (!claveCorrecta){
                                    String claveTarjeta = MetodoTarjeta.nextLine();

                                    //Clave correcta
                                    if (claveTarjeta.matches("\\d{4}")){
                                        System.out.println("Procesando clave...");
                                        System.out.println("La clave es correcta");
                                        System.out.println("Procesando pago...");
                                        System.out.println("Pago procesado");
                                        claveCorrecta = true;
                                        confirmacionTipotarjeta = true;
                                        tipoDeTarjeta = true;
                                        operacion = true;

                                        //Clave incorrecta
                                    } else {
                                        System.out.println("Clave incorrecta");
                                        System.out.println("Por favor introduzca la clave de nuevo");
                                        continue;
                                    }
                                }

                                //Flujo si es negativo
                            } else if (confirmacion.equalsIgnoreCase("No") || confirmacion.equalsIgnoreCase("N")){
                                System.out.println("Por favor seleccion el tipo de tarjeta correcto");
                                System.out.println("Por favor seleccione el tipo de tarjeta");
                                System.out.println("1.Ahorro 2.Corriente 3.Credito");
                                confirmacionTipotarjeta = true;
                                continue;

                                //Si la respuesta no es valida
                            } else{
                                System.out.println("Por favor ingrese una respuesta valida");
                                confirmacionTipotarjeta = false;;
                                continue;
                            }
                        }

                    //Ningun tipo
                    } else {
                        System.out.println("Por favor seleccion un tipo valido de tarjeta");
                        System.out.println("Por favor seleccione el tipo de tarjeta");
                        System.out.println("1.Ahorro 2.Corriente 3.Credito");
                        continue;
                    }
                }

            //Flujo si es incorrecto
            } else {
                System.out.println("El numero de tarjeta no es valido");
                System.out.println("intentelo de nuevo");
                System.out.println("Por favor ingrese los ultimo 4 digitos de la tarjeta:");
                continue;
            }
        }
    }
}
