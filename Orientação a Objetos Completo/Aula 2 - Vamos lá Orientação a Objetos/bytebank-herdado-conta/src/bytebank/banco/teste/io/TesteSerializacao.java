package bytebank.banco.teste.io;

import bytebank.banco.modelo.Cliente;
import bytebank.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Paulo");
        cliente.setProfissao("Developer");
        cliente.setCpf("245151654845");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
