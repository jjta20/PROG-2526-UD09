package a01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escribir el método:
Integer leerEntero()
Que pida un entero por consola, lo lea del teclado y lo devuelva.
Si la cadena introducida por consola no tiene el formato correcto, muestra un
mensaje de error y vuelve a pedirlo.
*/

public class A01_throws {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Integer n = null;
        
        while (n == null) {
            try {
                n = leerEntero(leer);
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
                leer.nextLine();
            }
        }
        
        System.out.println("El numero introducido es el: " + n);
    }

    static Integer leerEntero(Scanner sc) throws InputMismatchException {
        System.out.print("Introducir entero: ");
        return sc.nextInt();
    }
}
