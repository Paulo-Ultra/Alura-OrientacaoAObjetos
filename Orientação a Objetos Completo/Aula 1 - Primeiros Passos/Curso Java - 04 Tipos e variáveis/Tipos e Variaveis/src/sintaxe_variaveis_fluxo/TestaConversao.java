package sintaxe_variaveis_fluxo;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.50;
        int valor = (int)salario;
        System.out.println(valor);

        float pontoFlutuane = 3.14f;
        long numeroGrande = 1565415641854654L;
        short valorPequeno = 2131;
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
