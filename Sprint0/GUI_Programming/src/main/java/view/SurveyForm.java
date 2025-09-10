package view;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class SurveyForm {

    private Button submitButton;
    private Button cancelButton;

    private TextField firstNameField;
    private TextField lastNameField;
    private CheckBox confirmationBox;
    private RadioButton firstTimeButton;

    public Scene createSurveyForm() {

        BorderPane borderPane = new BorderPane();

        GridPane buttonPane = setupButtons();
        GridPane userInputPane = setupUserInput();

        borderPane.setBottom(buttonPane);
        borderPane.setCenter(userInputPane);

        return new Scene(borderPane);

    }

    GridPane setupButtons() {

        submitButton = new Button("Submit");
        cancelButton = new Button("Cancel");

        GridPane pane = new GridPane();

        pane.add(cancelButton, 0, 0); //col row
        pane.add(submitButton, 1, 0);

        return pane;
    }

    GridPane setupUserInput() {

        GridPane pane = new GridPane();

        Label firstNameLabel = new Label("First name: ");
        firstNameField = new TextField();

        pane.add(firstNameLabel, 0, 0);
        pane.add(firstNameField, 1 ,0);

        Label lastNameLabel = new Label("Last name: ");
        lastNameField = new TextField();

        pane.add(lastNameLabel, 0, 1);
        pane.add(lastNameField, 1 ,1);

        confirmationBox = new CheckBox();
        Label confirmation = new Label("Check if you want response sent to you ");

        pane.add(confirmation, 0, 2);
        pane.add(confirmationBox, 1, 2);

        Label firstTimeLabel = new Label("Is this your first time filling this out? ");
        firstTimeButton = new RadioButton();

        pane.add(firstTimeLabel, 0, 3);
        pane.add(firstTimeButton, 1, 3);

        return pane;

    }

    public Button getCancelButton() {
        return cancelButton;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public TextField getFirstNameField() {
        return firstNameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public CheckBox getConfirmationBox() {
        return confirmationBox;
    }

    public RadioButton getFirstTimeButton() {
        return firstTimeButton;
    }
}
