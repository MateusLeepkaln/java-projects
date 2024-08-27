class Funcionario {
    String nome;
    double salario;
    double aumento;

    Funcionario(String nome, double salario, double aumento) {
        this.nome = nome;
        this.salario = salario;
        this.aumento = aumento;
    }
}

class Assistente extends Funcionario {

    Assistente(String nome, double salario, double aumento) {
        super(nome, salario, aumento);
    }

    public void ganhoAnual() {
        this.salario += this.aumento;
    }
}

public class TesteHeranca {
    public static void main(String[] args) {
        Assistente joao = new Assistente("João", 3000, 500);

        System.out.println("O nome do assistente é: " + joao.nome);
        joao.ganhoAnual();
        System.out.println("O salário do Jõao é: " + joao.salario);
    }
}