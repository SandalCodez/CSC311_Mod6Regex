# Regex Validation Application

A JavaFX application that demonstrates form validation using regular expressions (regex). This application validates user inputs for common fields such as name, email, date of birth, and zip code according to specified patterns.

## Overview

This application provides a simple user interface for submitting personal information with real-time validation feedback. Each input field is validated against a specific regex pattern, and validation errors are displayed to the user.

## Features

- First name and last name validation (2-25 alphabetic characters)
- Email validation (must be a Farmingdale.edu email address)
- Date of birth validation (MM/DD/YYYY format)
- Zip code validation (5 digits)
- Real-time feedback on validation errors

## Requirements

- Java JDK 17 or higher
- JavaFX 17 or higher
- Maven (optional, for dependency management)

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── org/
│   │       └── example/
│   │           └── csc311_mod6regex/
│   │               ├── RegexApplication.java
│   │               └── RegexController.java
│   └── resources/
│       └── org/
│           └── example/
│               └── csc311_mod6regex/
│                   └── hello-view.fxml
```

## How to Run

1. Clone the repository
2. Make sure you have JavaFX configured in your project
3. Run the `RegexApplication.java` file

If using Maven, you can run the application with:
```
mvn javafx:run
```

## How It Works

1. The application uses the MVC (Model-View-Controller) design pattern.
2. The view is defined in `hello-view.fxml`.
3. The controller logic is in `RegexController.java`.
4. Regular expressions are defined in the controller's `initialize()` method.
5. The validation occurs when the user clicks the ADD button.

## Regular Expression Patterns

- First & Last Name: `^[A-Za-z]{2,25}$`
  - Must be 2-25 alphabetic characters
  
- Email: `^[A-Za-z0-9._%+-]+@farmingdale\.edu$`
  - Must be a valid farmingdale.edu email address
  
- Date of Birth: `^\\d{2}/\\d{2}/\\d{4}$`
  - Must be in MM/DD/YYYY format
  
- Zip Code: `^\\d{5}$`
  - Must be exactly 5 digits

## Contributing

This project was created for CSC311 Module 6. For educational purposes only.

## License

[Specify your license here if applicable]
