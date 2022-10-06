package sintaxe_variaveis_fluxo;

public class TesteIR2 {
    public static void main(String[] args) {

        double salario = 3300.0;

        if(salario <= 2800.0){
            System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
        } else if (salario <= 3751.0){
            System.out.println("O IR é de 15% e pode deduzir na declaração o valor de R$ 350");
        } else {
            System.out.println("O IR é de 22,5% e pode deduzir na declaração o valor de R$ 636");

        }
        //ifs aqui
    }
}
