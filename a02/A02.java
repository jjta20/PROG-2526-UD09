package a02;

import java.io.FileReader;
import java.io.IOException;

/*
Leer el archivo de texto Main.java de uno de los proyectos que hayamos terminado
y mostrarlo por pantalla. (NOTA: utiliza FileReader)
*/

public class A02 {

    static final String FICHERO = "D:\\SYNC\\Nextcloud\\DOCENCIA\\CODE\\NetBeans\\Projects\\U07-Herencia\\src\\main\\java\\a00\\Main.java";
    
    public static void main(String[] args) {
        String texto = "";
        FileReader in = null;

        try {
            //leemos el fichero Main.java
            in = new FileReader(FICHERO);
            int c = in.read();
            while (c != -1) { 
                texto = texto + (char) c;
                c = in.read();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally { 
            if (in != null) { 
                try {
                    in.close();
                    System.out.println("He terminado -> Cierro el fichero.");
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }
}
