class Produto {
    final private String nome;
    final private double preco;
    final private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String obterInfo(){
        return "Nome: " + nome;
    }

    public String obterPreco(){
        return "Preço: " + preco;
    }

    public String obterQuantidadeEmEstoque(){
        return "Quantidade em estoque: " + quantidadeEmEstoque;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("TV", 900.00, 10);
        System.out.println(produto.obterInfo());
        System.out.println(produto.obterPreco());
        System.out.println(produto.obterQuantidadeEmEstoque());
        }

}
