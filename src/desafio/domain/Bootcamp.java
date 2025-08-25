package desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInical = LocalDate.now();
    private final LocalDate datafinal = dataInical.plusDays(45);
    private Set<Dev> devinscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInical() {
        return dataInical;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public Set<Dev> getDevinscritos() {
        return devinscritos;
    }

    public void setDevinscritos(Set<Dev> devinscritos) {
        this.devinscritos = devinscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInical(), bootcamp.getDataInical()) && Objects.equals(getDatafinal(), bootcamp.getDatafinal()) && Objects.equals(getDevinscritos(), bootcamp.getDevinscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInical(), getDatafinal(), getDevinscritos(), getConteudos());
    }
}
