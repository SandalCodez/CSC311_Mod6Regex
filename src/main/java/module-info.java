module org.example.csc311_mod6regex {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311_mod6regex to javafx.fxml;
    exports org.example.csc311_mod6regex;
}