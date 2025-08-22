package desafio.domain;

import java.util.Objects;

public class Curso {
    private String descricao;
    private String titulo;
    private int cargaHoraria;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Curso curso)) return false;
        return getCargaHoraria() == curso.getCargaHoraria() && Objects.equals(getDescricao(), curso.getDescricao()) && Objects.equals(getTitulo(), curso.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao(), getTitulo(), getCargaHoraria());
    }
}
