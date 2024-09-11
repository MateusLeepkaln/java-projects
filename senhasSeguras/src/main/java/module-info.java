module com.example.senhasseguras {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.senhasseguras to javafx.fxml;
    exports com.example.senhasseguras;
}