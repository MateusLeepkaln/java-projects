module com.example.editortexto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.editortexto to javafx.fxml;
    exports com.example.editortexto;
}