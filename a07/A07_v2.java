package a07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Como ejemplo, vamos a guardar en un fichero el texto:
 * "En un lugar de La Mancha,
 *  de cuyo nombre no quiero acordarme"
 * La primera línea, carácter a carácter usando for-each.
 * La segunda, en una sola sentencia usando el constructor con booleano append.
 * NOTA: Cada actividad usa su propio try-catch-finally.
 */
public class A07_v2 {

    public static void main(String[] args) {

        // --- Primera línea: carácter a carácter con for-each (sobreescribe el fichero) ---
        BufferedWriter out1 = null;
        try {
            out1 = new BufferedWriter(new FileWriter("quijote.txt")); // append=false por defecto
            String cad = "En un lugar de La Mancha,";
            for (char c : cad.toCharArray()) {
                out1.write(c);
            }
            //out1.newLine();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (out1 != null) {
                try {
                    out1.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

        // --- Segunda línea: en una sola sentencia, con append=true ---
        BufferedWriter out2 = null;
        try {
            out2 = new BufferedWriter(new FileWriter("quijote.txt", true)); // append=true
            String cad = "de cuyo nombre no quiero acordarme.";
            out2.newLine();
            out2.write(cad);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (out2 != null) {
                try {
                    out2.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
