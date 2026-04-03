package mock;

import model.CalendarioAcademico.CalendarioAcademico;
import model.Curso.Curso;
import model.Disciplina.Disciplina;
import model.Enum.Bloco;
import model.Enum.DiasDaSemana;
import model.HorarioAula.HorarioAula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DadosMock {

    // Calendário Acadêmico com as datas de início e fim do semestre letivo
    public static CalendarioAcademico obterCalendarioMock() {
        CalendarioAcademico calendario = new CalendarioAcademico();

        calendario.setDataInicio(LocalDate.of(2026, 2, 4));
        calendario.setDataFim(LocalDate.of(2026, 7, 4));

        return calendario;
    }

    // Retorna disciplinas com seus horários
    public static List<Disciplina> obterDisciplinasMock() {

        // Instanciando 1 objeto do tipo Curso
        Curso curso = new Curso(1L, "Banco de Dados");

        // Instanciando 2 objetos do tipo Disciplina
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setId(1L);
        disciplina1.setIdCurso(curso.getId());
        disciplina1.setNome("Arquitetura e Modelagem de Banco de Dados");
        disciplina1.setCargaHorariaTotal(80);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setId(2L);
        disciplina2.setIdCurso(curso.getId());
        disciplina2.setNome("Engenharia de Software");
        disciplina2.setCargaHorariaTotal(80);

        // Adicionando instâncias de HorarioAula às disciplinas

        // Horários da Disciplina 1
        List<HorarioAula> horariosD1 = new ArrayList<>();
        horariosD1.add(new HorarioAula(DiasDaSemana.SEGUNDA_FEIRA, Bloco.BLOCO_3));
        horariosD1.add(new HorarioAula(DiasDaSemana.QUARTA_FEIRA, Bloco.BLOCO_1));
        horariosD1.add(new HorarioAula(DiasDaSemana.QUINTA_FEIRA, Bloco.BLOCO_4));
        horariosD1.add(new HorarioAula(DiasDaSemana.QUINTA_FEIRA, Bloco.BLOCO_5));
        disciplina1.setHorarios(horariosD1);

        // Horários da Disciplina 2
        List<HorarioAula> horariosD2 = new ArrayList<>();
        horariosD2.add(new HorarioAula(DiasDaSemana.SEGUNDA_FEIRA, Bloco.BLOCO_1));
        horariosD2.add(new HorarioAula(DiasDaSemana.SEXTA_FEIRA, Bloco.BLOCO_1));
        horariosD2.add(new HorarioAula(DiasDaSemana.SEXTA_FEIRA, Bloco.BLOCO_2));
        horariosD2.add(new HorarioAula(DiasDaSemana.SEXTA_FEIRA, Bloco.BLOCO_3));
        disciplina2.setHorarios(horariosD2);

        // Retorna as instâncias criadas
        return Arrays.asList(disciplina1, disciplina2);
    }

    // Retorna curso com ID e nome
    public static Curso obterCursoMock() {
        return new Curso(1L, "Banco de Dados");
    }
}

/*
como usar:

// Pegando o calendário do semestre
CalendarioAcademico calendarioSemestre = DadosMock.obterCalendarioMock();

// Pegando a lista de disciplinas já com seus horários vinculados
List<Disciplina> disciplinasDoSemestre = DadosMock.obterDisciplinasMock();

// Exemplo de como você faria para imprimir no terminal e testar se deu certo:
System.out.println("Semestre inicia em: " + calendarioSemestre.getDataInicio());

for (Disciplina d : disciplinasDoSemestre) {
    System.out.println("Disciplina: " + d.getNome() + " | Carga Horária: " + d.getCargaHorariaTotal());
    for (HorarioAula h : d.getHorarios()) {
        System.out.println("  - Aula de " + h.getDia().getDescricao() + " no bloco " + h.getBloco().getHorario());
    }
}
* */