package a08;

import java.util.Scanner;
import java.io.*;

public class A08_v2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Introduce la ruta y nombre del fichero: ");
            String fichOriginal = scanner.nextLine();

            File fileOriginal = new File(fichOriginal);
            String carpeta    = fileOriginal.getParent();  // "D:\"
            String nombre     = fileOriginal.getName();    // "quijote.txt"
            String fichCopia  = (carpeta != null ? carpeta + File.separator : "") + "copia_de_" + nombre;

            try (BufferedReader in  = new BufferedReader(new FileReader(fichOriginal));
                 BufferedWriter out = new BufferedWriter(new FileWriter(fichCopia)))
            {
                String linea = in.readLine();
                while (linea != null) {
                    out.write(linea);
                    out.newLine();
                    linea = in.readLine();
                }
                System.out.println("Copia creada: " + fichCopia);

            } catch (IOException ex) {
                System.out.println("Error: " + ex);
            }
        }
    }
}