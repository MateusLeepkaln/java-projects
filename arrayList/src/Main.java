import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> filmes = new ArrayList<>();

        filmes.add("Ninita Bonita");
        filmes.add("Ninita Bonita 2");
        System.out.println("Ninita bonita 2 está na lista? " + filmes.contains("Ninita Bonita"));
        System.out.println("Todos os filmes: " + filmes);
    }
}