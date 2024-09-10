class CaixaDeBrinquedos {
     private Object coisaNaCaixa;

     public void guardar(Object coisa) {
         this.coisaNaCaixa = coisa;
     }

     public Object pegar() {
         return this.coisaNaCaixa;

     }

     public static void main(String[] args) {
         CaixaDeBrinquedos caixaDeCarrinhos = new CaixaDeBrinquedos();
         caixaDeCarrinhos.guardar(new Carrinho("Hot Wheels"));

         CaixaDeBrinquedos caixaDeBonecas = new CaixaDeBrinquedos();
         caixaDeBonecas.guardar(new Boneca("Barbie"));

         if (caixaDeCarrinhos.pegar() instanceof Carrinho) {
             Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar();
             System.out.println(carrinho.getModelo());
         }
         if (caixaDeBonecas.pegar() instanceof Boneca) {
             Boneca boneca = (Boneca) caixaDeBonecas.pegar();
             System.out.println(boneca.getNome());
         }
     }
 }
