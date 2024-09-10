abstract class Operacao {
    abstract Double calcular(Double a, Double b);
}

class Adicao extends Operacao {
    @Override
    public Double calcular(Double a, Double b) {
        return a + b;
    }
}

class Subtracao extends Operacao {
    @Override
    public Double calcular(Double a, Double b) {
        return a - b;
    }
}

class Multiplicacao extends Operacao {
    @Override
    public Double calcular(Double a, Double b) {
        return a * b;
    }
}

class Divisao extends Operacao {
    @Override
    public Double calcular(Double a, Double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero");
            return Double.NaN;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Operacao adicao = new Adicao();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();

        Double num1 = 10d;
        Double num2 = 5d;

        System.out.println("A soma dos números é: " + adicao.calcular(num1, num2));
        System.out.println("A subtração dos números é: " + subtracao.calcular(num1, num2));
        System.out.println("A multiplicação dos números é: " + multiplicacao.calcular(num1, num2));
        System.out.println("A divisão dos números é: " + divisao.calcular(num1, num2));
    }
}