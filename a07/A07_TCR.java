package a07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
ACTIVIDAD 7 - UTILIZANDO: try-catch-resources
Como ejemplo, vamos a guardar en un fichero el texto:
"En un lugar de La Mancha,
de cuyo nombre no quiero acordarme“
La primera línea, carácter a carácter, y la segunda, en una sola sentencia.
*/

public class A07_TCR {

    public static void main(String[] args) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("quijote_TCR.txt")))
        {
            //La primera línea, carácter a carácter
            String cad = "En un lugar de la mancha,";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            
            //la segunda, en una sola sentencia
            cad = "de cuyo nombre no quiero acordarme.";
            out.newLine();
            out.write(cad);
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
