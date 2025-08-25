package desafio.domain;

import java.util.Objects;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
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

    @Override
    public double calcularXp() {
        return XP_PADRAO *cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", descricao='" + descricao + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}


