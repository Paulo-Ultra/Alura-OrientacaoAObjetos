package bytebank.banco.teste;

import bytebank.banco.modelo.Cliente;
import bytebank.banco.modelo.ContaCorrente;
import bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {

        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(123, 321);
        Object cp = new ContaPoupanca(321, 123);
        Object cliente = new Cliente();

        System.out.println(cc);
        System.out.println(cp);
//        println(cliente);
    }

    static void println() {
    }
    static void println(int a) {
    }
    static void println(boolean valor) {
    }
    static void println(Object referencia) {
    }
}
