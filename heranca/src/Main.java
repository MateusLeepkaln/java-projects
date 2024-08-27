class Animal {
    public String nome;
    public void fazerSom(){
        System.out.println("A Nina late.");
    }
}

class Cachorro extends Animal {
    public void fazerSom() {
        super.fazerSom();
        System.out.println("Au Au");
}

public static class TesteHeranca{
    public static void main(String[] args) {
        Cachorro nina = new Cachorro();;
        nina.nome = "Nina";
        System.out.println("O nome do cachorro é: "+ nina.nome);
        nina.fazerSom();
    }
}
}