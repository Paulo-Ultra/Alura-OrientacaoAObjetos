package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        //Collections.sort(palavras, comparator);

        palavras.sort((s1,s2) -> {
                if(s1.length() < s2.length())
                    return -1;
                if(s1.length() > s2.length())
                    return 1;
                return 0;
        });
//        palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length())); A de baixo é a forma mais suscinta

        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));

        //destrinchado sem ser lambda

        Function<String, Integer> funcao = String::length;
        //Ambas são lambdas mas a primeira é o method reference
        Function<String, Integer> funcao2 = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        System.out.println(palavras);

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);

//        for(String p : palavras){
//            System.out.println(p);
//        }
        //Lambda
        palavras.forEach(s -> System.out.println(s));
        // Ou
        palavras.forEach(System.out::println);

//        new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("Executando um Runnable");
//            }
//
//        }).start();
//
//        new Thread(() -> System.out.println("Executando um Runnable")).start();
//    }
}
//class ImprimeNaLinha implements Consumer<String>{
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}
class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
                return 1;
        return 0;
        }
    }
}
