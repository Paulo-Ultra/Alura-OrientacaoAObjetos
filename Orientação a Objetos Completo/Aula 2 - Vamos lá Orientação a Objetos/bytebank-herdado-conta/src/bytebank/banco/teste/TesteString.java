package bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {

        String vazio = " Alura ";
        String outroVazio = vazio.trim();
        System.out.println(vazio.contains("Alu"));


        String nome = "Alura"; //object literal
//        String outro = new String("Alura");

        System.out.println(nome.length());
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String sub = nome.substring(1);
        System.out.println(sub);

        int pos = nome.indexOf("ur");
        System.out.println(pos);

        char c = nome.charAt(2);

        System.out.println(c);

//        char c = 'A';
//        char d = 'a';
//        String outro = nome.replace(c, d);
//        String outro = nome.toLowerCase();
//        System.out.println(outro);
        System.out.println(nome);

        System.out.println("Alura");

        /*
        public class System {
            public ????? out;
        }

        //System
        // - classe, java.lang, acesso publico(public)
        //out
        // - atributo, publico, referência, static
        //println
        // - método, publico, nao static, sobrecarga, não joga exceções do tipo checked
         */
    }
}
