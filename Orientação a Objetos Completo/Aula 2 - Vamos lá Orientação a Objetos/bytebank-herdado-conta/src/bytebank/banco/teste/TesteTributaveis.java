package bytebank.banco.teste;

import bytebank.banco.modelo.ContaCorrente;
import bytebank.banco.modelo.SeguroDeVida;
import bytebank.banco.modelo.CalculadorDeImposto;


public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registrar(cc);
        calc.registrar(seguroDeVida);

        System.out.println(calc.getTotalImposto());
    }
}
