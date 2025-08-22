package desafio.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        Mentoria mentoria = new Mentoria();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        mentoria.setData(LocalDate.of(2020,10,22));

        System.out.println(mentoria.getData());

    }
}