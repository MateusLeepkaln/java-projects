abstract class  Veiculo {
    private final String placa;
    private final int ano;

    Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public void exibeInformacoes() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

class Onibus extends Veiculo {
    private final int assentos;

    Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Assentos: " + assentos);
    }
}

class Caminhao extends Veiculo {
    private final int eixos;

    Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        System.out.println("Eixos: " + eixos);
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo onibus = new Onibus("Placa1991", 2020, 40);
        Veiculo caminhao = new Caminhao("3as4534d5", 2022, 4);

        System.out.println("Informações do veículo ônibus:");
        onibus.exibeInformacoes();
        System.out.println("Informações do veículo caminhão:");
        caminhao.exibeInformacoes();

    }
}