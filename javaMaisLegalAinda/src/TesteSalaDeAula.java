class SalaDeAula {
    static int numeroAlunos = 35;

    public static void adicionarContagem() {
        numeroAlunos++;
    }
    public static void verAlunos() {
        System.out.println(numeroAlunos);
    }
}
public class TesteSalaDeAula {
    public static void main(String[] args) {
            SalaDeAula.adicionarContagem();
            SalaDeAula.verAlunos();
            SalaDeAula.adicionarContagem();
            SalaDeAula.verAlunos();
        }
    }
