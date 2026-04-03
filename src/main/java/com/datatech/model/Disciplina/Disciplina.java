package model.Disciplina;

import model.Aula.Aula;
import model.HorarioAula.HorarioAula;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Long id;
    private Long idCurso;
    private String nome;
    private int cargaHorariaTotal;
    private List<HorarioAula> horarios;

    public Disciplina() {
        this.horarios = new ArrayList<>();
    }

    public Disciplina(Long id, Long idCurso, String nome, int cargaHorariaTotal, List<HorarioAula> horarios) {
        this.id = id;
        this.idCurso = idCurso;
        this.nome = nome;
        this.cargaHorariaTotal = cargaHorariaTotal;
        this.horarios = (horarios != null) ? horarios : new ArrayList<>();
    }

    public List<Aula> gerarCronograma(LocalDate inicio, LocalDate fim) {
        return new ArrayList<>();
    }

    public boolean verificarCargaHoraria() {
        return false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public void setCargaHorariaTotal(int cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    public List<HorarioAula> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioAula> horarios) {
        this.horarios = horarios;
    }
}