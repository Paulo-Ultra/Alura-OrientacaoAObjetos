package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de Saída com Arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Eos incidunt explicabo qui eaque repellat eum incidunt obcaecati ea minus unde");
        bw.write(System.lineSeparator());
        bw.write("uhaiuahauihauihaiu");

        bw.close();

    }
}
