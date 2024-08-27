class Personagem {
    String nome;
    int nivelDePoder;

    public Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }
    public void tentaModificarInt(int nivelDePoder) {
        nivelDePoder += 10;

    }
    public void mudarNome(Personagem personagem) {
        personagem.nome = nome;
    }
    public void modificarMesmo() {
        this.nivelDePoder += 10;
    }


}


public class Main {
    public static void main(String[] args) {
        Personagem nina = new Personagem("Nina", 1000000);
        System.out.println("Antes de aumentar o nível de poder: " + nina.nivelDePoder);
        nina.modificarMesmo();
        System.out.println("Depois de modificar o nível de poder: " + nina.nivelDePoder);

        }
    }
