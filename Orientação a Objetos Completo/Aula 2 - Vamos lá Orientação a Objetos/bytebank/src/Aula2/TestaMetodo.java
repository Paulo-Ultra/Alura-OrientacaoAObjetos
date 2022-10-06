package Aula2;

public class TestaMetodo {
    public static void main(String[] args) {

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.depositar(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.sacar(20.00);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositar(1000);
        boolean sucessoTransferencia = contaDaMarcela.transferir(3000, contaDoPaulo);
        if(sucessoTransferencia){
            System.out.println("Transferência com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "Paulo Ricardo";
        System.out.println(contaDoPaulo.titular);
    }

}
