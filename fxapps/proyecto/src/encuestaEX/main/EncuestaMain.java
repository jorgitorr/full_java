package encuestaEX.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EncuestaMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/encuestafx.fxml"));
        primaryStage.setTitle("Encuesta");
        primaryStage.setScene(new Scene(root, 500, 550));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
