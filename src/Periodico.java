public class Periodico extends ItemBibliografico {
    private String periodicidade;
    private int volume;

    public Periodico(String codigo, String titulo, int anoPublicacao, String periodicidade, int volume) {
        super(codigo, titulo, anoPublicacao);
        this.periodicidade = periodicidade;
        this.volume = volume;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean validarCampos() {
        if (this.getPeriodicidade() == null) throw new RuntimeException("Periodicidade inválida");
        else if (this.getVolume() < 0) throw new RuntimeException("Volume inválido");
        return super.validarCampos();
    }
}
