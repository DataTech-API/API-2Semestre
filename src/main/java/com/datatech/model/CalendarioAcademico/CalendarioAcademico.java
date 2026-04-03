package model.CalendarioAcademico;

import java.time.LocalDate;
import java.util.List;

    public class CalendarioAcademico {

        private LocalDate dataInicio;
        private LocalDate dataFim;

        private List<LocalDate> feriados;
        private List<LocalDate> emendas;
        private List<LocalDate> diasLetivos;
        private List<LocalDate> diasNaoLetivos;
        private List<LocalDate> diasBloqueadosProva;

        public CalendarioAcademico() {
        }

        public CalendarioAcademico(LocalDate dataInicio, LocalDate dataFim,
                                   List<LocalDate> feriados,
                                   List<LocalDate> emendas,
                                   List<LocalDate> diasLetivos,
                                   List<LocalDate> diasNaoLetivos,
                                   List<LocalDate> diasBloqueadosProva) {
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
            this.feriados = feriados;
            this.emendas = emendas;
            this.diasLetivos = diasLetivos;
            this.diasNaoLetivos = diasNaoLetivos;
            this.diasBloqueadosProva = diasBloqueadosProva;
        }

        public LocalDate getDataInicio() {
            return dataInicio;
        }

        public void setDataInicio(LocalDate dataInicio) {
            this.dataInicio = dataInicio;
        }

        public LocalDate getDataFim() {
            return dataFim;
        }

        public void setDataFim(LocalDate dataFim) {
            this.dataFim = dataFim;
        }

        public List<LocalDate> getFeriados() {
            return feriados;
        }

        public void setFeriados(List<LocalDate> feriados) {
            this.feriados = feriados;
        }

        public List<LocalDate> getEmendas() {
            return emendas;
        }

        public void setEmendas(List<LocalDate> emendas) {
            this.emendas = emendas;
        }

        public List<LocalDate> getDiasLetivos() {
            return diasLetivos;
        }

        public void setDiasLetivos(List<LocalDate> diasLetivos) {
            this.diasLetivos = diasLetivos;
        }

        public List<LocalDate> getDiasNaoLetivos() {
            return diasNaoLetivos;
        }

        public void setDiasNaoLetivos(List<LocalDate> diasNaoLetivos) {
            this.diasNaoLetivos = diasNaoLetivos;
        }

        public List<LocalDate> getDiasBloqueadosProva() {
            return diasBloqueadosProva;
        }

        public void setDiasBloqueadosProva(List<LocalDate> diasBloqueadosProva) {
            this.diasBloqueadosProva = diasBloqueadosProva;
        }

        // MÉTODOS DO DIAGRAMA

        public boolean isFeriado(LocalDate data) {
            return feriados != null && feriados.contains(data);
        }

        public boolean isEmenda(LocalDate data) {
            return emendas != null && emendas.contains(data);
        }

        public boolean isDiaLetivo(LocalDate data) {
            return diasLetivos != null && diasLetivos.contains(data);
        }

        public boolean isDataBloqueadaParaProva(LocalDate data) {
            return diasBloqueadosProva != null && diasBloqueadosProva.contains(data);
        }

        public boolean isSabado(LocalDate data) {
            return data.getDayOfWeek().getValue() == 6;
        }

        public void addFeriado(LocalDate data) {
            if (feriados != null) {
                feriados.add(data);
            }
        }

        public void addEmenda(LocalDate data) {
            if (emendas != null) {
                emendas.add(data);
            }
        }

        public void addDiaBloqueado(LocalDate data) {
            if (diasBloqueadosProva != null) {
                diasBloqueadosProva.add(data);
            }
        }
    }


