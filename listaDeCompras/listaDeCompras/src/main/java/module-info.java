module com.example.listadecompras {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listadecompras to javafx.fxml;
    exports com.example.listadecompras;
}