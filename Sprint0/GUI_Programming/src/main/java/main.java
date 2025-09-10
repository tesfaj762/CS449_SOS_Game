import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import view.SurveyForm;


public class main {

    public static class App extends Application {

        @Override
        public void start(Stage stage) {

            Scene scene = new SurveyForm().createSurveyForm();

            stage.setTitle("Sprint 0");
            stage.setScene(scene);
            stage.sizeToScene();
            stage.setResizable(true);
            stage.show();

        }
    }

    public static void main(String[] args) {

        Application.launch(App.class, args);

    }


}
