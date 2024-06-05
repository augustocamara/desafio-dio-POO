import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(mentoria.toString());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAugustor = new Dev();
        devAugustor.setNome("Dev Augustor");
        devAugustor.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdo Inscritos Augusto" + devAugustor.getConteudosInscritos());
        devAugustor.pregredir();
        devAugustor.pregredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Augusto" + devAugustor.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos Augusto" + devAugustor.getConteudosConcluidos());
        System.out.println("XP: " + devAugustor.calcularTotalXP());

        System.out.println("+++++++++++++++++++++++");

        Dev devJunior = new Dev();
        devJunior.setNome("Dev Junior");
        devJunior.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdo Inscritos Junior" + devJunior.getConteudosInscritos());
        devJunior.pregredir();
        devJunior.pregredir();
        devJunior.pregredir();
        System.out.println("-");
        System.out.println("Conteúdo Inscritos Junior" + devJunior.getConteudosInscritos());
        System.out.println("Conteúdo Concluídos Junior" + devJunior.getConteudosConcluidos());
        System.out.println("XP: " + devJunior.calcularTotalXP());

    }
}
