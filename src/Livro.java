public class Livro extends ItemBibliografico{
    private String autor;
    private String isbn;

    public Livro(String codigo, String titulo, int anoPublicacao, String autor, String isbn) {
        super(codigo, titulo, anoPublicacao);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean validarCampos() {
        if (this.getAutor() == null) throw new RuntimeException("Autor inválido");
        else if ((this.getIsbn().length()) != 10 || (this.getIsbn().length()) != 13) throw new RuntimeException("Isbn inválido");
        return super.validarCampos();
    }
}