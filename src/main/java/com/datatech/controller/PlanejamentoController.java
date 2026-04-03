package com.datatech.controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ListView;
import javafx.event.ActionEvent;
import java.util.List;

import model.Aula.Aula;
import model.Disciplina.Disciplina;
import model.CalendarioAcademico.CalendarioAcademico;
import mock.DadosMock;
import service.GeradorAulasService;

public class PlanejamentoController {

    @FXML
    private MenuButton comboCursos;

    @FXML
    private MenuButton comboDisciplinas;

    @FXML
    private ListView<Aula> listViewAulas;

    private GeradorAulasService geradorService = new GeradorAulasService();
    private Disciplina disciplinaSelecionada; // Auxiliar para simular a seleção

    @FXML
    public void initialize() {
        // Limpa seleções anteriores
        comboCursos.getItems().clear();
        comboDisciplinas.getItems().clear();

        // Carrega o curso do Mock
        model.Curso.Curso cursoMock = DadosMock.obterCursoMock();
        MenuItem itemCurso = new MenuItem(cursoMock.getNome());

        itemCurso.setOnAction(e -> {
            comboCursos.setText(cursoMock.getNome());
            // Chama o filtro de disciplinas associadas a este curso
            carregarDisciplinasDoCurso(cursoMock.getId());
        });
        comboCursos.getItems().add(itemCurso);
    }

    private void carregarDisciplinasDoCurso(Long idCurso) {
        comboDisciplinas.getItems().clear();
        List<Disciplina> todas = DadosMock.obterDisciplinasMock();

        for (Disciplina d : todas) {
            // Verifica a associação pelo ID do Curso
            if (d.getIdCurso().equals(idCurso)) {
                MenuItem item = new MenuItem(d.getNome());
                item.setOnAction(e -> {
                    this.disciplinaSelecionada = d;
                    comboDisciplinas.setText(d.getNome());
                });
                comboDisciplinas.getItems().add(item);
            }
        }
    }

    @FXML
    void handleGerarAulas(ActionEvent event) {
        if (disciplinaSelecionada != null) {
            CalendarioAcademico cal = DadosMock.obterCalendarioMock();
            List<Aula> aulas = geradorService.gerarAulas(disciplinaSelecionada, cal.getDataInicio(), cal.getDataFim());

            listViewAulas.getItems().setAll(aulas);

            // Estilização para simular cards brancos independentes
            listViewAulas.setFixedCellSize(70.0);
            listViewAulas.setStyle(
                    "-fx-background-color: transparent; " +
                            "-fx-control-inner-background: #FFFFFF; " +
                            "-fx-background-insets: 5; " +
                            "-fx-padding: 10; " +
                            "-fx-border-color: #E2E8F0; " +
                            "-fx-border-radius: 10; " +
                            "-fx-background-radius: 10;"
            );
        }
    }
}