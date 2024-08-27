class Livro {
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;

    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;

    }
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.preco = 0.0;

    }
    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

}

class Aplicacao {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        System.out.println(livro1.titulo);
        //System.out.println(livro1.autor);
        System.out.println(livro1.anoPublicacao);
        System.out.println(livro1.preco);

        Livro livro2 = new Livro("Ninita Bonita", "Nina");
        System.out.println(livro2.titulo);
        //System.out.println(livro2.autor);
        System.out.println(livro2.anoPublicacao);
        System.out.println(livro2.preco);

        Livro livro3 = new Livro("Ninita Bonita", "Nina", 2024, 0.00);
        System.out.println(livro3.titulo);
        //System.out.println(livro3.autor);
        System.out.println(livro3.anoPublicacao);
        System.out.println(livro3.preco);
    }
}
