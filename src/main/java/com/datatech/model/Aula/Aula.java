package model.Aula;

import model.Enum.Bloco;
import model.Enum.TipoAula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    public class Aula {
        private Long id;
        private Long idDisciplina;
        private LocalDate data;
        private LocalDate dataOriginal;
        private Bloco bloco;
        private TipoAula tipo;
        private String conteudo;
        private boolean remanejada;

        public Aula() {
        }

        public Aula(Long id, Long idDisciplina, LocalDate data, LocalDate dataOriginal,
                    Bloco bloco, TipoAula tipo, String conteudo, boolean remanejada) {
            this.id = id;
            this.idDisciplina = idDisciplina;
            this.data = data;
            this.dataOriginal = dataOriginal;
            this.bloco = bloco;
            this.tipo = tipo;
            this.conteudo = conteudo;
            this.remanejada = remanejada;
        }

        public void registrarConteudo(String texto) {
            this.conteudo = texto;
        }

        public void remaneja(LocalDate novaData) {
            if (this.dataOriginal == null) {
                this.dataOriginal = this.data;
            }
            this.data = novaData;
            this.remanejada = true;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getIdDisciplina() {
            return idDisciplina;
        }

        public void setIdDisciplina(Long idDisciplina) {
            this.idDisciplina = idDisciplina;
        }

        public LocalDate getData() {
            return data;
        }

        public void setData(LocalDate data) {
            this.data = data;
        }

        public LocalDate getDataOriginal() {
            return dataOriginal;
        }

        public void setDataOriginal(LocalDate dataOriginal) {
            this.dataOriginal = dataOriginal;
        }

        public Bloco getBloco() {
            return bloco;
        }

        public void setBloco(Bloco bloco) {
            this.bloco = bloco;
        }

        public TipoAula getTipo() {
            return tipo;
        }

        public void setTipo(TipoAula tipo) {
            this.tipo = tipo;
        }

        public String getConteudo() {
            return conteudo;
        }

        public void setConteudo(String conteudo) {
            this.conteudo = conteudo;
        }

        public boolean isRemanejada() {
            return remanejada;
        }

        public void setRemanejada(boolean remanejada) {
            this.remanejada = remanejada;
        }

        @Override
        public String toString() {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String dataStr = (data != null) ? data.format(formato) : "00-00-0000";

            String diaSemana = (data != null) ? converterDiaPortugues(data.getDayOfWeek()) : "";

           //DD-MM-AAAA DIA - BLOCO - CONTEÚDO
            return String.format("%s %s - %s - %s",
                    dataStr,
                    diaSemana,
                    (getBloco() != null ? getBloco().name() : "AULA"),
                    (getConteudo() != null ? getConteudo() : "SEM CONTEÚDO"));
        }

        private String converterDiaPortugues(java.time.DayOfWeek day) {
            switch (day) {
                case MONDAY: return "SEGUNDA-FEIRA";
                case TUESDAY: return "TERÇA-FEIRA";
                case WEDNESDAY: return "QUARTA-FEIRA";
                case THURSDAY: return "QUINTA-FEIRA";
                case FRIDAY: return "SEXTA-FEIRA";
                case SATURDAY: return "SÁBADO";
                default: return "DOMINGO";
            }
        }
    }

