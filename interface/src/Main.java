interface Veiculo {
    void inciar();
    void parar();

    default void buzinar() {
        System.out.println("Buzinando");
    }
}

class Carro implements Veiculo {

    @Override
    public void inciar() {
        System.out.println("Inciar");
    }

    @Override
    public void parar() {
        System.out.println("Parar");
    }
}

class Caminhao implements Veiculo {

    @Override
    public void inciar() {
        System.out.println("Inciar");
    }

    @Override
    public void parar() {
        System.out.println("Parar");
    }
}


public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.inciar();
        carro.parar();
        carro.buzinar();

        Caminhao caminhao = new Caminhao();

        caminhao.inciar();
        caminhao.parar();
        caminhao.buzinar();

    }
}