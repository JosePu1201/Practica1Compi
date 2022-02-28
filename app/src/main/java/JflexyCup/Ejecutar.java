package JflexyCup;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.sql.SQLOutput;
import java.util.Scanner;

import Graficas.Grafica;

public class Ejecutar {
    public  Ejecutar() {
        System.out.println("entra+-");
        String entrada = "Def Barras{\n" +
                "            \ttitulo: \"Grafica1 \";\n" +
                "            \tejex:[\"item1\", \"item2\"];\n" +
                "            \tejey:[5, 10+5];\n" +
                "            \tunir:[{0,1}, {1,0}];\n" +
                "}\n" +
                "Ejecutar(\"Grafica1\");";
        /*try {
            InputStream ins = new FileInputStream("src/main/java/JflexyCup/p.txt");
            Scanner obj = new Scanner(ins);
            while (obj.hasNextLine()){
                entrada += obj.nextLine();
            }

        }catch(Exception a){


        }*/
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
