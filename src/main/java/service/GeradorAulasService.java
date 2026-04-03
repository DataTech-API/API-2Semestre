package service;

import model.Aula.Aula;
import model.Disciplina.Disciplina;
import model.Enum.DiasDaSemana;
import model.HorarioAula.HorarioAula;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeradorAulasService {

    /**
     * Gera a lista de aulas de uma disciplina com base no calendário do semestre.
     * Lista com todas as aulas geradas no período
     */
    public List<Aula> gerarAulas(Disciplina disciplina, LocalDate dataInicio, LocalDate dataFim) {

        // Lista que vai acumular todas as aulas geradas
        List<Aula> aulas = new ArrayList<>();

        // Variável de controle do laço — começa no primeiro dia do semestre
        LocalDate dataAtual = dataInicio;

        // Percorre dia a dia do semestre até atingir a data fim (inclusive)
        while (!dataAtual.isAfter(dataFim)) {

            // Converte o DayOfWeek do Java (MONDAY, TUESDAY...) para o enum do projeto (SEGUNDA_FEIRA, TERCA_FEIRA...)
            DiasDaSemana diaAtual = converterDia(dataAtual.getDayOfWeek());

            // Se for domingo (null), pula para o próximo dia
            if (diaAtual == null) {
                dataAtual = dataAtual.plusDays(1);
                continue;
            }

            // Percorre todos os horários cadastrados na disciplina
            for (HorarioAula horario : disciplina.getHorarios()) {

                // Verifica se o dia do horário bate com o dia atual da iteração
                if (horario.getDia().equals(diaAtual)) {

                    // Cria a aula usando setters pois o objeto Aula segue o padrão do projeto
                    Aula aula = new Aula();
                    aula.setIdDisciplina(disciplina.getId()); // vínculo com a disciplina pelo ID
                    aula.setData(dataAtual);                  // data real desta ocorrência
                    aula.setDataOriginal(dataAtual);          // registra a data original (útil caso seja remanejada futuramente)
                    aula.setBloco(horario.getBloco());        // bloco do horário (ex: BLOCO_1, BLOCO_3...)
                    aula.setTipo(null);                       // TipoAula será definido futuramente por outra task
                    aula.setRemanejada(false);                // não foi remanejada — é uma aula recém gerada

                    aulas.add(aula);
                }
            }

            // Avança para o próximo dia
            dataAtual = dataAtual.plusDays(1);
        }

        return aulas;
    }

    /**
     *Converte o enum nativo do Java (DayOfWeek) para o enum do projeto (DiasDaSemana).
     *Necessário pois LocalDate.getDayOfWeek() retorna o tipo do Java,
     *mas os horários da disciplina usam o enum customizado do projeto.
     */
    private DiasDaSemana converterDia(DayOfWeek day) {
        switch (day) {
            case MONDAY:    return DiasDaSemana.SEGUNDA_FEIRA;
            case TUESDAY:   return DiasDaSemana.TERCA_FEIRA;
            case WEDNESDAY: return DiasDaSemana.QUARTA_FEIRA;
            case THURSDAY:  return DiasDaSemana.QUINTA_FEIRA;
            case FRIDAY:    return DiasDaSemana.SEXTA_FEIRA;
            case SATURDAY:  return DiasDaSemana.SABADO;
            case SUNDAY:    return null; // domingo não tem aula
            default: throw new IllegalArgumentException("Dia não mapeado: " + day);
        }
    }
}

/*
 * ═══════════════════════════════════════════════
 *  COMO USAR — GeradorAulasService
 * ═══════════════════════════════════════════════
 *
 * 1. Obtenha os dados necessários (via mock ou futuramente via banco):
 *
 *      CalendarioAcademico calendario = DadosMock.obterCalendarioMock();
 *      List<Disciplina> disciplinas   = DadosMock.obterDisciplinasMock();
 *
 * 2. Instancie o serviço:
 *
 *      GeradorAulasService gerador = new GeradorAulasService();
 *
 * 3. Gere as aulas para cada disciplina:
 *
 *      for (Disciplina disciplina : disciplinas) {
 *          List<Aula> aulas = gerador.gerarAulas(
 *              disciplina,
 *              calendario.getDataInicio(),
 *              calendario.getDataFim()
 *          );
 *
 *          // Exemplo: imprimir no terminal para validar
 *          System.out.println("Disciplina: " + disciplina.getNome());
 *          for (Aula aula : aulas) {
 *              System.out.println("  " + aula); // usa o toString() de Aula: "dd/MM/yyyy - BLOCO_X"
 *          }
 *      }
 *
 */