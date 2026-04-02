import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // O "/" inicial indica que a busca começa na raiz da pasta resources
        URL fxmlLocation = getClass().getResource("/view/teste2.fxml");

        if (fxmlLocation == null) {
            throw new RuntimeException("Arquivo FXML não encontrado em: /view/teste2.fxml");
        }

        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        Parent root = loader.load();

        // Configuração da Janela (Cena)
        Scene scene = new Scene(root);

        primaryStage.setTitle("DataTech API - 2º Semestre");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}