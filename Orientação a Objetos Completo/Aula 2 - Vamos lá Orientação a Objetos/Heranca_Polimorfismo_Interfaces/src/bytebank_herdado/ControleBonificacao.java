package bytebank_herdado;

public class ControleBonificacao {

    private double soma;

    public void registrar(Funcionario f) { // Mesmo usando uma referência genérica o método vai chamar o método da classe específica:
        double boni = f.getBonificacao(); // Polimorfismo
        this.soma += boni;
    }
    public double getSoma() {
        return soma;
    }
}
