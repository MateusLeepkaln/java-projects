import java.util.Set;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        System.out.println("Contém '1'? " + conjunto.contains(1));
        conjunto.add(5);
        conjunto.remove(2);
        conjunto.remove(3);
        System.out.print("Conjunto inteiro: " +conjunto);

    }
}