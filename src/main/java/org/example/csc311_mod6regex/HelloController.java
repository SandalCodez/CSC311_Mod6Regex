package org.example.csc311_mod6regex;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {
    @FXML
    private Button addBtn;

    @FXML
    private TextField dateOfBirthField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField fNameField;

    @FXML
    private TextField lNameField;

    @FXML
    private TextField zipcodeField;

    private Pattern pattern1;
    private Pattern pattern2;
    private Pattern pattern3;
    private Pattern pattern4;
    private Pattern pattern5;
    private Matcher matcher1;
    private Matcher matcher2;
    private Matcher matcher3;
    private Matcher matcher4;
    private Matcher matcher5;

    @FXML
    private void handleAddBtn(ActionEvent event) {
        System.out.println("Add button clicked");

    }

    private boolean checkFields(){


        return false;
    }

}