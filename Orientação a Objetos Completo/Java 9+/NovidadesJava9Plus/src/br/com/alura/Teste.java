package br.com.alura;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
       /* //Java 9
        //Factory Method para Coleções(06/2014)
        List<String> nomes = List.of("nome1", "nome2", "nome3");

        //Fluxo Reativo(08/2015)
        NotaFiscalSubscriber nfs = new NotaFiscalSubscriber();
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<NotaFiscal>();

        publisher.subscribe(nfs);

        NotaFiscal notaFiscal = new NotaFiscal("João", 39.99, LocalDate.now());

        publisher.submit(notaFiscal);

        //Java Modular(08/2015)

        module br.com.alura {
            requires br.com.alura.nf;
            requires br.com.alura.http;
        }

    }
    //Java 10
        //Inferência de variável(03/2016) && Interface para garbage collector(08/2016)
        public static void adicionarNaLista(){
            var nomes = new ArrayList<String>();
            nomes.add("João");
        }

        //Java 11
    //Execução de um arquivo java com um único comando (12/2017)
    C: \Users\Joao Victor>java Principal.java //Sem utilizar o javac
    Hello World;

    //HttpClient(05/2014)
    HttpClient httpClient = HttpClient.newHttpClient();

    HttpRequest httpRequest = HttpRequest.newBuilder(uri).GET().build();
    HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

    //Java 12

    //Inclusão de um novo garbage collector

    //Java13
    //Mudanças na Socket API(02/2019)
    //Text Blocks(04/2019);

    public void escreverSql(){
        String txt = """
                SELECT * FROM 
                PRODUTO
                INNER JOIN CLIENTE ...
                """;
        txt.length();
    }

    //Java 14
    //Helpful NullPointerExceptions(03/2019)

    //Switch Expressions(12/2017)

    switch (nome) {
        case "nome1", "nome2", "nome3" -> System.out.println("Achou o nome: "+ nome);
        default -> System.out.println("Não achou nenhum nome");
    }

    //Records(Preview)(04/2019)
    record ClienteDTO(String nome, String cpf){}*/
    }
}
