package desafio.domain;

public abstract class Conteudo {

   protected static final double XP_PADRAO = 10d;

    protected String descricao;

    protected String titulo;

    public abstract double calcularXp();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
