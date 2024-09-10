interface PedidoRestaurante {
    void adicionarItem(String item, double preco);
    double calcularTotal();
}

class Pedido implements PedidoRestaurante {

    @Override
    public void adicionarItem(String item, double preco) {
        System.out.println("Adicionando item: " + item);
        System.out.println("Adicionando o preço: "+ preco);
    }

    @Override
    public double calcularTotal() {
        return 0;       
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}