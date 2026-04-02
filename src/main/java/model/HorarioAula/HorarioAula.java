package model.HorarioAula;

import model.Enum.Bloco;
import model.Enum.DiasDaSemana;

public class HorarioAula {
    private DiasDaSemana dia;
    private Bloco bloco;

    public HorarioAula() {
    }

    public HorarioAula(DiasDaSemana dia, Bloco bloco) {
        this.dia = dia;
        this.bloco = bloco;
    }

    public DiasDaSemana getDia() {
        return dia;
    }

    public void setDia(DiasDaSemana dia) {
        this.dia = dia;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }
}
