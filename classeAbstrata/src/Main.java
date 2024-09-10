abstract class FiguraGeometrica {
   abstract float calcularArea(float base, float altura);
   abstract float calcularPerimetro(float base, float altura);
}

class Retangulo extends FiguraGeometrica {
    float calcularArea(float base, float altura) {
        return base * altura;
    }

    float calcularPerimetro(float base, float altura) {
        return base + altura;
    }
}

public class Main {
    public static void main(String[] args)  {
        Retangulo retangulo = new Retangulo();
        System.out.println(retangulo.calcularArea(4, 2));
        System.out.println(retangulo.calcularPerimetro(4, 2));

    }
}