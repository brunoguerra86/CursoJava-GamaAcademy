public class AppBiblioteca{
    public static void main(String args[]){
        
      Livro l1 = new Livro("LOTR", "Tolkien", 1994, "Ficção");
      Livro l2 = new Livro("O Hobbit", "Tolkien", 1995, "Ficção");
      Livro l3 = new Livro("O Silmarillion", "Tolkien", 1999, "Ficção");
      
      l1.exibirInfo();
      l2.exibirInfo();
      l3.exibirInfo();

      l1.emprestar();
      l2.emprestar();

      l1.exibirInfo();
      l2.exibirInfo();
      l3.exibirInfo();
    }
}