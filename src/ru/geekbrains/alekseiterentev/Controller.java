package ru.geekbrains.alekseiterentev;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    TextField msgField;

    @FXML
    TextArea chatField;

    public void sendMsgAction(Event actionEvent) {
        chatField.appendText(msgField.getText() + "\n");
        msgField.clear();
    }

    public void sendMsgOnKeyPressedAction(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sendMsgAction(keyEvent);
        }
    }
}
