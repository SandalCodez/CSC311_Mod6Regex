package org.example.csc311_mod6regex;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexController {
    @FXML
    private Label LNameRegexLabel;

    @FXML
    private Button addBtn;

    @FXML
    private TextField dateOfBirthField;

    @FXML
    private Label dobRegexLabel;

    @FXML
    private TextField emailField;

    @FXML
    private Label emailRegexLabel;

    @FXML
    private TextField fNameField;

    @FXML
    private Label fNameRegexLabel;

    @FXML
    private TextField lNameField;

    @FXML
    private Label zipCodeRegexLabel;

    @FXML
    private TextField zipcodeField;


    private Pattern firstnameRegex;
    private Pattern lastNameRegex;
    private Pattern emailRegex;
    private Pattern dateOfBirthRegex;
    private Pattern zipCodeRegex;
    private Matcher fNameMatcher;
    private Matcher lNameMatcher;
    private Matcher emailMatcher;
    private Matcher dateOfBirthMatcher;
    private Matcher zipCodeMatcher;

    @FXML
    public void initialize() {
        firstnameRegex = Pattern.compile("^[A-Za-z]{2,25}$");
        lastNameRegex = Pattern.compile("^[A-Za-z]{2,25}$");
        emailRegex = Pattern.compile("^[A-Za-z0-9._%+-]+@farmingdale\\.edu$");
        dateOfBirthRegex = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
        zipCodeRegex = Pattern.compile("^\\d{5}$");
    }

    @FXML
    private void handleAddBtn(ActionEvent event) {
        System.out.println("Add button clicked");
        checkFields();

    }

    private boolean checkFields() {
        boolean valid = true;

        fNameMatcher = firstnameRegex.matcher(fNameField.getText());
        if (!fNameMatcher.find()) {
            fNameRegexLabel.setText("First name is not valid");
            valid = false;
        } else {
            fNameRegexLabel.setText("");
        }

        lNameMatcher = lastNameRegex.matcher(lNameField.getText());

        if (!lNameMatcher.find()) {
            LNameRegexLabel.setText("Last name is not valid");
            valid = false;
        } else {
            LNameRegexLabel.setText("");
        }

        emailMatcher = emailRegex.matcher(emailField.getText());
        if (!emailMatcher.find()) {
            emailRegexLabel.setText("Email is not valid");
            valid = false;
        } else {
            emailRegexLabel.setText("");
        }
        dateOfBirthMatcher = dateOfBirthRegex.matcher(dateOfBirthField.getText());
        if (!dateOfBirthMatcher.find()) {
            dobRegexLabel.setText("Date of birth is not valid");
            valid = false;
        } else {
            dobRegexLabel.setText("");
        }
        zipCodeMatcher = zipCodeRegex.matcher(zipcodeField.getText());
        if (!zipCodeMatcher.find()) {
            zipCodeRegexLabel.setText("Zip code is not valid");
            valid = false;
        } else {
            zipCodeRegexLabel.setText("");
        }

        return false;


    }

}