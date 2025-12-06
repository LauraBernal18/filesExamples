module com.example.filesexamples {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filesexamples to javafx.fxml;
    exports com.example.filesexamples;
}