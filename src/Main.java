class Veiculo {
    public void acelerar() {
        System.out.println("O veículo acelera");
    }
}

class Carro extends Veiculo {
    public void acelerar(){
        super.acelerar();
        System.out.println("O carro acelera");
    }
}

public class Main {
    public static void main(String[] args){
        Carro veiculo = new Carro();

        veiculo.acelerar();
    }

}