package JflexyCup;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.sql.SQLOutput;
import java.util.Scanner;

import Graficas.Grafica;

public class Ejecutar {
    public  Ejecutar(String entrada) {

        System.out.println(entrada);
        Reader reader = new StringReader(entrada.toString());
        Lexico nuevo = new Lexico(reader);
        //sumasLexer2 = new AnalizadorLexico(reader);
        //sumasParser = new SumasParser(sumasLexer2);
         parser sumasParser = new parser(nuevo);

        try {
            sumasParser.parse();

        } catch (Exception e) {
           e.printStackTrace();
            // Aqui ustedes manejan de forma correcta el error.
        }
    }
}
