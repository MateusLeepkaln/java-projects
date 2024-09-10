import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ExemploSerialization {
    private static void serializarContatos(List<Contato> listaContato) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("contatos.txt"))) {
            outputStream.writeObject(listaContato);
            System.out.println("Contados salvos com sucesso");

        }
    }
    private static void desiarilarContatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("contatos.txt"))) {
            List<Contato> contatosLidos =(List<Contato>) inputStream.readObject();
            for (Contato contato : contatosLidos){
                System.out.println(contato);
            }
        }
    }
    public static void main(String[] args) {
        Contato contato1 = new Contato("Nina", 123123123);
        Contato contato2 = new Contato("Mateus", 123123123);

        ArrayList<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(contato1);
        listaContatos.add(contato2);

        try {
            serializarContatos(listaContatos);
            desiarilarContatos();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}