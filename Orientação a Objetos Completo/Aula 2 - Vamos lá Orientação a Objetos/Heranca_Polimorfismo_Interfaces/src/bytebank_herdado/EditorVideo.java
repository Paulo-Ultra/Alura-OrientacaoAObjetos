package bytebank_herdado;

public class EditorVideo extends Funcionario{

    public double getBonificacao(){
        System.out.println("Chamando a bonificação do Editor de Vídeo");
        return 150;
    }
}
