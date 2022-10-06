package bytebank_herdado;

public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);



        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.00);

        Designer d = new Designer();
        d.setSalario(2000.00);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registrar(g1);
        controle.registrar(ev);
        controle.registrar(d);

        System.out.println(controle.getSoma());
    }
}
