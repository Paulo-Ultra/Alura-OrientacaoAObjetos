package bytebank.banco.teste.util;

import bytebank.banco.modelo.Cliente;
import bytebank.banco.modelo.Conta;
import bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEEquals {
    public static void main(String[] args) {

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

//        Conta ccTeste1 = new ContaCorrente(22, 22);
//        Conta ccTeste2 = new ContaCorrente(22, 22);
//        boolean igual = ccTeste1.ehIgual(ccTeste2);
//        System.out.println(igual);

        Conta cc = new ContaCorrente(22, 11);
        Cliente cliente = new Cliente();
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);
        System.out.println("Já existe? " + existe);

        for (Conta conta : lista){
            System.out.println(conta);
        }

    }
}
