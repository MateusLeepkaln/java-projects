
public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Nina", 10, "Rua Nina", "1414-1414");


        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Rua: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }
}