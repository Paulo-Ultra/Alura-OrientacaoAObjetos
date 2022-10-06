package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");

        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);



        bytes = s.getBytes("UTF-8");
        System.out.println(bytes.length + ", UTF-8");
        sNovo = new String(bytes, "UTF-8");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US-ASCII");
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);

        String s1 = "13º Órgão Oficial";
        bytes = s1.getBytes();
        String s2 = new String(bytes, "UTF-8");
        System.out.println(s2);

    }
}
