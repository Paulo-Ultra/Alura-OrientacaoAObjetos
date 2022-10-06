package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de Saída com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//        PrintStream ps = new PrintStream(new File("lorem2.txt"));
        PrintWriter ps = new PrintWriter("lorem2.txt", StandardCharsets.UTF_8);

        ps.println("Eos incidunt explicabo qui eaque repellat eum incidunt obcaecati ea minus unde");
        ps.println();
        ps.println("kkkkkkkkkkkkkkkkkkkk");

        ps.close();

        System.out.println();

    }
}
