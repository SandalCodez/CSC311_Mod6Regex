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
    private TextField fNameField;
    @FXML
    private TextField lNameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField dateOfBirthField;
    @FXML
    private TextField zipcodeField;
    @FXML
    private Label FNameErrorLabel;
    @FXML
    private Label LNameErrorLabel;
    @FXML
    private Label emailErrorLabel;
    @FXML
    private Label dobErrorLabel;
    @FXML
    private Label zipCodeErrorLabel;
    @FXML
    private Label successLabel;
    @FXML
    private Button addBtn;

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

    private boolean formCheck = true;
    private int fieldFilledCount = 0;

    /**
     * This method contains all the regex patterns for each textField. It is also the initial caller for formManager and showButton.
     */
    @FXML
    public void initialize() {
        //both name patterns check for starting upper case character and allow for apostrophes!
        firstnameRegex = Pattern.compile("^[A-Za-z||']{2,25}$");
        lastNameRegex = Pattern.compile("^[A-Za-z||']{2,25}$");

        //email pattern doesnt allow for numbers to start and end in farmingdale.edu
        emailRegex = Pattern.compile("^[A-Za-z0-9._%+-]+@farmingdale\\.edu$");

        //can only be MM/DD/YYYY
        dateOfBirthRegex = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");

        //only 5 digit zipcodes
        zipCodeRegex = Pattern.compile("^\\d{5}$");

        formManager();
        showButton();
        addBtn.setOpacity(.5);
        addBtn.setDisable(true);
    }

    /**
     * This method handles the event of clicking the addBtn.
     * @param event The clicking of addBtn
     */
    @FXML
    private void handleAddBtn(ActionEvent event) {

        System.out.println("Add button clicked");
        if (formCheck && fieldFilledCount >= 4) {
            System.out.println("Form Filled");
            successLabel.setText("Form Filled");
        }

    }

    /**
     * This method checks if at least 5 text fields have been populated and if formCheck has been flagged as false.
     */
    private void showButton() {

        if (formCheck && fieldFilledCount >= 4) {
            addBtn.setOpacity(1);
            addBtn.setDisable(false);

            System.out.println("Add button shwoing");
        } else {
            addBtn.setOpacity(.5);
            addBtn.setDisable(true);
        }

    }

    /**
     * This method handles the focus of the fields and call necessary methods to show\not show add button.
     */
    private void formManager() {

        if (formCheck && fieldFilledCount >= 4) {
            addBtn.setOpacity(1);
            addBtn.setDisable(false);
        }
        fNameField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("fNameField focused");

            } else {
                System.out.println("fNameField not focused");
                if (!newCheck(firstnameRegex, fNameMatcher, fNameField.getText())) {
                    FNameErrorLabel.setText("First name is invalid");
                    formCheck = false;
                } else {
                    FNameErrorLabel.setText("");
                    formCheck = true;
                    fieldFilledCount++;
                }
                showButton();

            }
        });

        lNameField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("lNameField focused");
            } else {
                System.out.println("lNameField not focused");
                if (!newCheck(lastNameRegex, lNameMatcher, lNameField.getText())) {
                    LNameErrorLabel.setText("Last name is invalid");
                    formCheck = false;
                } else {
                    LNameErrorLabel.setText("");
                    formCheck = true;
                    fieldFilledCount++;
                }
                showButton();
            }
        });

        emailField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("emailField focused");
            } else {
                System.out.println("emailField not focused");
                if (!newCheck(emailRegex, emailMatcher, emailField.getText())) {
                    emailErrorLabel.setText("Email is invalid");
                    formCheck = false;
                } else {
                    emailErrorLabel.setText("");
                    formCheck = true;
                    fieldFilledCount++;
                }
                showButton();
            }
        });

        dateOfBirthField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("dateOfBirthField focused");
            } else {
                System.out.println("dateOfBirthField not focused");
                if (!newCheck(dateOfBirthRegex, dateOfBirthMatcher, dateOfBirthField.getText())) {
                    dobErrorLabel.setText("Date of birth is invalid");
                    formCheck = false;
                } else {
                    dobErrorLabel.setText("");
                    formCheck = true;
                    fieldFilledCount++;
                }
                showButton();
            }
        });

        zipcodeField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("zipCodeField focused");
            } else {
                System.out.println("zipCodeField not focused");
                if (!newCheck(zipCodeRegex, zipCodeMatcher, zipcodeField.getText())) {
                    zipCodeErrorLabel.setText("Zip code is invalid");
                    formCheck = false;
                } else {
                    zipCodeErrorLabel.setText("");
                    formCheck = true;
                    fieldFilledCount++;
                }
                showButton();
            }
        });

    }

    /**
     * @param pattern Regex pattern for the respective field
     * @param matcher Matcher object that uses respective pattern
     * @param string User inputted text from respective textField
     * @return boolean according to string matching pattern
     */
    private boolean newCheck(Pattern pattern, Matcher matcher, String string) {

        matcher = pattern.matcher(string);
        return matcher.find();
    }

}