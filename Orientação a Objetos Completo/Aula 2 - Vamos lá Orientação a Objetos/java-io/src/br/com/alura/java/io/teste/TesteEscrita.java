package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        //Fluxo de Saída com Arquivo
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Eos incidunt explicabo qui eaque repellat eum incidunt obcaecati ea minus unde 33 explicabo internos qui voluptates Quis. Non doloribus sint eos quia rerum non magnam quia. Sed nobis rerum ut cumque sequi ex accusamus quia. Rem quia maiores qui voluptatem dolorum id ullam voluptatem qui consequatur voluptas qui reiciendis laboriosam non consequatur quas.\n");
//        bw.newLine();
        bw.newLine();
        bw.write("------------------------------------");


        bw.close();
    }
}
