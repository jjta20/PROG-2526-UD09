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

public class A01 {

    public static void main(String[] args) {
        Integer n = leerEntero();
        System.out.println("El numero introducido es el: " + n);
    }

    static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        Integer resultado = null;
        
        while (resultado == null) {
            System.out.print("Introducir entero: ");
            try {
                resultado = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
                sc.next();
            }
        }
        
        return resultado;
    }
}
