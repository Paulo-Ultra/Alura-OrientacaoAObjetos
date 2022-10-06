package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionar(new Aula("Criando uma aula", 20));
        javaColecoes.adicionar(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Todos os alunos matriculados:");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

//        Set<Aluno> alunos = javaColecoes.getAlunos();
//        Iterator<Aluno> iterator = alunos.iterator();
//        while (iterator.hasNext()){
//            Aluno proximo = iterator.next();
//            System.out.println(proximo);
//        } ----- Forma legada de percorrer


//        for(Aluno a : javaColecoes.getAlunos()){
//            System.out.println(a);
//        } Outra forma de percorrer com for sem ser foreach -- legado

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse turini está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));

        //Obrigatoriamente o seguinte é true:

        System.out.println(a1.hashCode() == turini.hashCode());
    }
}
