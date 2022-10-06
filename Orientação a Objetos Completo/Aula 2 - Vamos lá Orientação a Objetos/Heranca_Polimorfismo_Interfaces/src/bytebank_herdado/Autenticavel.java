package bytebank_herdado;

//contrato Autenticavel
    //quem assina esse contrato, precisa implementar
        //método setSenha
        //método autenticar
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);
    public abstract boolean autenticar(int senha);
}
