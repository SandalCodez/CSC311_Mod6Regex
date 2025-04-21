# Form Validation with JavaFX and RegEx

This project demonstrates a form validation application built with JavaFX. It uses regular expressions to validate user input across multiple fields and provides real-time feedback to users.

## Features

- Validates form fields using regex patterns:
  - First and last names (2-25 characters, allows apostrophes)
  - Email (must end with farmingdale.edu domain)
  - Date of birth (MM/DD/YYYY format)
  - Zip code (5 digits only)
- Real-time validation feedback
- Modern UI with custom styling
- Submit button that activates only when form is valid

## Project Structure

- `RegexApplication.java`: Main application class that launches the JavaFX application
- `RegexController.java`: Controller class that handles form validation logic
- `regex-app-view.fxml`: FXML file defining the UI layout
- `style.css`: CSS file containing custom styling for the application

## CSS Styling

The application uses a custom CSS theme with the following features:
- Light blue background color
- Modern button styling with gradient colors
- Hover and click effects for buttons
- Custom fonts and text colors
- Error messages displayed in red

## Requirements

- Java 17 or higher
- JavaFX 17 or higher

## Setup and Running

1. Clone the repository
2. Make sure your IDE is configured with the correct JavaFX libraries
3. Run the `RegexApplication` class to start the application

## Regular Expression Patterns

The application uses the following regex patterns:
- Names: `^[A-Za-z||']{2,25}$`
- Email: `^[A-Za-z0-9._%+-]+@farmingdale\\.edu$`
- Date of Birth: `^\\d{2}/\\d{2}/\\d{4}$`
- Zip Code: `^\\d{5}$`
