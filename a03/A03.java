package a03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Repetir la Actividad 2 usando un flujo de texto con búfer.
*/

public class A03 {

    static final String FICHERO = "D:\\SYNC\\Nextcloud\\DOCENCIA\\CODE\\NetBeans\\Projects\\U07-Herencia\\src\\main\\java\\a00\\Main.java";

    public static void main(String[] args) {
        String texto = "";
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(FICHERO));
            String linea = in.readLine();
            while (linea != null) { //mientras no llegue al final del archivo
                texto = texto + linea + '\n';
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}
