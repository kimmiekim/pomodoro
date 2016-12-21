package sample.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import sample.model.Attempt;
import sample.model.AttemptKind;

import java.awt.*;

public class Home {

    @FXML
    private VBox container;

    @FXML private Label title;

    private Attempt mCurrentAttempt;

    private void prepareAttempt(AttemptKind kind) {
        clearAttemptStyles();
        mCurrentAttempt = new Attempt( "", kind);
        addAttemptStyle(kind);
        title.setText(kind.getDisplayName());
    }

    private void addAttemptStyle(AttemptKind kind) {
        container.getStyleClass().add(kind.toString().toLowerCase());
    }

    private void clearAttemptStyles() {
        for (AttemptKind kind : AttemptKind.values()) {
            container.getStyleClass().remove(kind.toString().toLowerCase());
        }
    }

    public void DEBUG(ActionEvent actionEvent) {
        System.out.println("HI MOM");
    }
}

