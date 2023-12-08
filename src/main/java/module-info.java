module com.example {
    requires javafx.controls;
    requires transitive javafx.graphics; // Add this line
    requires javafx.fxml;
    requires java.sql;
    
    opens com.example to javafx.fxml;
    opens com.example.Controllers to javafx.fxml; // Open the Controllers package
    exports com.example;
}