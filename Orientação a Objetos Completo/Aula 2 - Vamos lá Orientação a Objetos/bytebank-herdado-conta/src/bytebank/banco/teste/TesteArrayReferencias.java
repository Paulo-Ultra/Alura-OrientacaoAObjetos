package bytebank.banco.teste;

import bytebank.banco.modelo.Cliente;
import bytebank.banco.modelo.Conta;
import bytebank.banco.modelo.ContaCorrente;
import bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {


        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        System.out.println(cc2.getNumero());

//        Object referenciaGenerica = referencias[1];
//
//        System.out.println(referencias[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];

        System.out.println(ref.getNumero());
    }
}
