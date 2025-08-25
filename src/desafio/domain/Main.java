package desafio.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso2.setTitulo("curso de java avancado");
        curso2.setDescricao("descricao curso java");
        curso2.setCargaHoraria(4);

        curso2.setTitulo("curso de springboot");
        curso2.setDescricao("descricao curso springboot");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("mentoria para melhorar o mindset de contrucao de codigo");
        mentoria.setTitulo("mentoria para dev raiz");
        mentoria.setData(LocalDate.of(2025,9,3));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev Thiago = new Dev();
        Thiago.setNome("thiago porto");

        Dev Bruno = new Dev();
        Bruno.setNome("bruno porto");


    }
}