package model.Enum;

public enum DiasDaSemana {
        SEGUNDA_FEIRA("Segunda-feira"),
        TERCA_FEIRA("Terça-feira"),
        QUARTA_FEIRA("Quarta-feira"),
        QUINTA_FEIRA("Quinta-feira"),
        SEXTA_FEIRA("Sexta-feira"),
        SABADO("Sábado");

        private final String descricao;

        DiasDaSemana(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        @Override
        public String toString() {
            return descricao;
        }
    }


