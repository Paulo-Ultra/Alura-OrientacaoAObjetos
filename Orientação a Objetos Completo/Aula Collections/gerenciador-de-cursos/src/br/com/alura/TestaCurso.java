package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionar(new Aula("Criando uma aula", 20));
        javaColecoes.adicionar(new Aula("Modelando com coleções", 22));

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(javaColecoes.getAulas());



    }
}
