package br.com.alura;

import java.util.*;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.forEach(System.out::println); //Método reference só pode ser usado em situações com métodos mais simples se for alterado algum método já não funcionaria
        cursos.forEach(c -> System.out.println(c.getNome()));

        OptionalDouble media = cursos.stream()
                .filter(curso -> curso.getAlunos() > 100) // nessa linha como há um comparação não tem como usar o método reference
                .mapToInt(Curso::getAlunos)
                .average();

//        System.out.println(sum);

        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .findAny()
                .ifPresent(curso -> System.out.println(curso.getNome()));

//        Curso curso = optionalCurso.orElse(null);
//        System.out.println(curso.getNome());
        cursos.parallelStream()
                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                        .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}
