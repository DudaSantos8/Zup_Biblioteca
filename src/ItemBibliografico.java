public abstract class ItemBibliografico {
    private String codigo;
    private String titulo;
    private int anoPublicacao;

    public ItemBibliografico(String codigo, String titulo, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean validarCampos(){

        if (this.getCodigo() == null) throw new RuntimeException("Código inválido");
        else if (this.getTitulo() == null) throw new RuntimeException("Titulo inválido");
        else if (this.getAnoPublicacao() < 1000 && this.getAnoPublicacao() > 2024) throw new RuntimeException("Ano inválido");

        return true;
    }
}
