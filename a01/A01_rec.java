package a01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escribir el método RECURSIVO:
Integer leerEntero()
Que pida un entero por consola, lo lea del teclado y lo devuelva.
Si la cadena introducida por consola no tiene el formato correcto, muestra un
mensaje de error y vuelve a pedirlo.
*/

public class A01_rec {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(leerEntero());
    }

    static Integer leerEntero() {
        System.out.print("Introducir entero: ");
        try {
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Tipo erróneo");
            sc.nextLine();
            return leerEntero();
        }
    }
}
