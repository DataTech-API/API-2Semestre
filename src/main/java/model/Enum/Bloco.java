package model.Enum;

public enum Bloco {
        BLOCO_1("18:45 às 19:35"),
        BLOCO_2("19:35 às 20:25"),
        BLOCO_3("20:25 às 21:15"),
        BLOCO_4("21:25 às 22:15"),
        BLOCO_5("22:15 às 23:05");

        private final String horario;

        Bloco(String horario) {
            this.horario = horario;
        }

        public String getHorario() {
            return horario;
        }

        @Override
        public String toString() {
            return name() + " - " + horario;
        }
    }

