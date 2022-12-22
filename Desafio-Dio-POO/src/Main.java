import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("Curso Java");
       curso1.setDescricao("Descrição curso java");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Curso Js");
       curso2.setDescricao("Descrição curso js");
       curso2.setCargaHoraria(4);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("Mentoria de java");
       mentoria.setDescricao("Descrição mentoria de java");
       mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescrição("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devLaiz = new Dev();
       devLaiz.setNome("Laiz");
       devLaiz.increverBoocamp(bootcamp);
       System.out.println("Conteúdos Inscritos" + devLaiz.getConteudosInscritos());
       devLaiz.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos" + devLaiz.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos" + devLaiz.getConteudosConcluidos());
       System.out.println("XP: " + devLaiz.calcularTotalXp());

       System.out.println("------------");

       Dev devRodrigo = new Dev();
       devRodrigo.setNome("Rodrigo");
       devRodrigo.increverBoocamp(bootcamp);
       System.out.println("Conteúdos Inscritos" + devRodrigo.getConteudosInscritos());
       devRodrigo.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos" + devRodrigo.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos" + devRodrigo.getConteudosConcluidos());
       System.out.println("XP: " + devRodrigo.calcularTotalXp());

    }
}

