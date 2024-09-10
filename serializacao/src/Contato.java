import java.io.Serializable;

class Contato implements Serializable {
    public String nome;
    public int telefone;

    public Contato(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
}