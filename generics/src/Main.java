class Caixa<T> {
    private T coisaNacaixa;

    public void guardar(T coisa) {
        this.coisaNacaixa = coisa;
    }

    public T pegar() {
        return this.coisaNacaixa;
    }
}

public class Main {
    public static void main(String[] args) {
        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Oi gente");
        String texto = caixaDeTexto.pegar();
        System.out.println(texto);


    }
}