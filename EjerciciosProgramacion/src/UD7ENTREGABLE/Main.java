/*
 * Proyecto EjerciciosProgramacionJava - Archivo Main.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD7ENTREGABLE;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 * @version 1.0
 * @date 29 ene. 2022 10:48:33
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean salir = false;
        Banco banco = new Banco();
        int posicion;
        int posOrigen;
        int posDestino;
        double cantidad;
        String titular;
        double saldo;

        do {

            System.out.println("\n"
                    + "1. Ver cuentas.\n"
                    + "2. Ingresar dinero.\n"
                    + "3. Retirar dinero\n"
                    + "4. Transferencia.\n"
                    + "5. Agregar cuenta.\n"
                    + "6. Eliminar cuenta.\n"
                    + "7. Buscar cuenta.\n"
                    + "8. Mostrar morosos.\n"
                    + "9. Salir.\n"
                    + "¿Opción?.");

            try {
                int opcion = in.nextInt();

                switch (opcion) {

                    case 1:
                        banco.imprimirTodos();
                        break;

                    case 2:
                        banco.imprimirTodos();
                        try {
                            System.out.println("Indica la posición de la cuenta.");
                            posicion = in.nextInt();

                            System.out.println("Indica la cantidad a ingresar.");
                            cantidad = in.nextDouble();

                            banco.ingresarDinero(cantidad, posicion);
                        } catch (InputMismatchException y) {
                            System.err.println("Error : no es un numero o es negativo");
                            in.nextLine();
                        } catch (CuentaException u) {
                            System.err.println(u.getMessage());
                        }
                        break;

                    case 3:
                        banco.imprimirTodos();
                        try {
                            System.out.println("Indica la posición de la cuenta.");
                            posicion = in.nextInt();

                            System.out.println("Indica la cantidad a retirar.");
                            cantidad = in.nextDouble();

                            banco.retirarDinero(cantidad, posicion);
                        } catch (InputMismatchException y) {
                            System.err.println("Error : no es un numero o es negativo");
                            in.nextLine();
                        } catch (CuentaException u) {
                            System.err.println(u.getMessage());
                        }
                        break;

                    case 4:
                        banco.imprimirTodos();
                        try {
                            System.out.println("Indica la posición de la cuenta de origen.");
                            posOrigen = in.nextInt();

                            System.out.println("Indica la posición de la cuenta de destino.");
                            posDestino = in.nextInt();

                            System.out.println("Indica la cantidad a transferir.");
                            cantidad = in.nextDouble();

                            banco.transferenciaCantidad(posOrigen, posDestino, cantidad);
                        } catch (InputMismatchException y) {
                            System.err.println("Error : no es un numero o es negativo");
                            in.nextLine();
                        } catch (CuentaException u) {
                            System.err.println(u.getMessage());
                        }

                        break;

                    case 5:
                        in.nextLine();
                        try {
                            System.out.println("Indica el titular de la cuenta.");
                            titular = in.nextLine();

                            System.out.println("Indica el saldo de la cuenta.");
                            saldo = in.nextDouble();

                            banco.agregarCuenta(new Cuenta(titular, saldo));
                        } catch (InputMismatchException w) {
                            System.err.println("Error : no es un numero o es negativo");
                            in.nextLine();
                        } catch (CuentaException u) {
                            System.err.println(u.getMessage());
                        }

                        break;

                    case 6:
                    try {
                        System.out.println("Indica la posición de la cuenta a eliminar.");
                        posicion = in.nextInt();

                        banco.eliminarCuenta(posicion);
                    } catch (InputMismatchException y) {
                        System.err.println("Error : no es un numero o es negativo");
                        in.nextLine();
                    } catch (CuentaException u) {
                        System.err.println(u.getMessage());
                    }

                    break;

                    case 7:
                        in.nextLine();
                        try {
                            System.out.println("Indica el nombre del titular que deseas buscar.");
                            titular = in.nextLine();

                            banco.mostrarCuenta(banco.buscarCuenta(titular));
                        } catch (CuentaException u) {
                            System.err.println(u.getMessage());
                        }
                        break;

                    case 8:
                        banco.mostrarMorosos();
                        break;

                    default:
                        System.out.println("Hasta la próxima");
                        salir = true;
                        break;
                }
            } catch (InputMismatchException w) {
                System.err.println("ERROR");
            }
        } while (!salir);

    }

}
