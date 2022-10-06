package Aula4_ComposicaoDeObjetos;

public class TesteSacaValoresNegativos {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(100);
        System.out.println(conta.sacar(200));


        conta.sacar(101);
        System.out.println(conta.getSaldo());


        //proibido:
//        conta.saldo = conta.saldo - 101;
//        System.out.println(conta.saldo);
    }
}
