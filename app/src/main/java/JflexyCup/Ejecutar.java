package JflexyCup;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import Graficas.Grafica;

public class Ejecutar {
    private parser sumasParser;
    public  Ejecutar(String entrada) {

        System.out.println(entrada);
        Reader reader = new StringReader(entrada.toString());
        Lexico nuevo = new Lexico(reader);
        //sumasLexer2 = new AnalizadorLexico(reader);
        //sumasParser = new SumasParser(sumasLexer2);
         sumasParser = new parser(nuevo);

        try {
            sumasParser.parse();

        } catch (Exception e) {
           e.printStackTrace();
            // Aqui ustedes manejan de forma correcta el error.
        }
        nuevo();

    }
    public  void nuevo(){
        ArrayList<Grafica> nuevo = sumasParser.graf();
        System.out.println();
        for (Grafica otro: nuevo
             ) {
            System.out.println(otro.toString());
            System.out.println("***************************************************");

        }
        System.out.println();
        for (String otro: sumasParser.ejecuciones()
             ) {
            System.out.println(otro+"/////");
        }


    }
}
