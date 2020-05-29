import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

public class Livro {
    private String  titulo;
    private String  autor;
    private int     ano;
    private String  categoria;
    private int     estante;
    private int     prateleira;
    private boolean disponivel;

    // quero criar meu próprio método construtor
    public Livro(String titulo, String autor, int ano, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
        disponivel = false;
    }

    // Getters & Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public int getEstante() {
        return estante;
    }

    public void setPrateleira(int prateleira) {
        this.prateleira = prateleira;
    }

    public int getPrateleira() {
        return prateleira;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean solicitarEmprestimo(Livro livro) {
        return livro.isDisponivel();
    }

    public void emprestar(){
        this.disponivel = false;
    }

    public void devolver(){
        this.disponivel = true;
    }

    public void exibirInfo(){
        System.out.println(" LIVRO "+titulo+"("+autor+")"+  "  Ano: "+ano);
        System.out.println(" Categoria : "+categoria+"  Posicao: "+estante+"/"+ prateleira);
       
        if (this.disponivel)
            System.out.println("Disponivel para emprestimo");
        else
            System.out.println("*** Emprestado");
        
        System.out.println("-------------");
    }
}