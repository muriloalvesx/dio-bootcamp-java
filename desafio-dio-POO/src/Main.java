import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("descrição curso js");
        curso1.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMurilo = new Dev();
        devMurilo.setNome("Murilo");
        devMurilo.InscreverBootcap(bootcamp);
        System.out.println("Conteúdos Inscritos Murilo:" + devMurilo.getConteudosInscritos());
        devMurilo.progredir();
        devMurilo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Murilo:" + devMurilo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Murilo:" + devMurilo.getConteudosConcluidos());
        System.out.println("XP:" + devMurilo.calcularXP());

        System.out.println("-------------");

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.InscreverBootcap(bootcamp);
        System.out.println("Conteúdos Inscritos Caio: " + devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio: " + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Caio: " + devCaio.getConteudosConcluidos());
        System.out.println("XP:" + devCaio.calcularXP());

    }
}
