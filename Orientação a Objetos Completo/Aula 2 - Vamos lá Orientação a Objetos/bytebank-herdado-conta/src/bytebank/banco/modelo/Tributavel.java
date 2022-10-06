package bytebank.banco.modelo;

public interface Tributavel {

    //Não precisa usar o public nem o abstract por já ser default em interfaces
    double getValorImposto();
}
