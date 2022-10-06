package Aula2;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.00;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300.0;

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);


        if (primeiraConta == segundaConta) {
            System.out.println("São a mesmíssima conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
