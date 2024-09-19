module com.example.projetonavegadorweb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens com.example.projetonavegadorweb to javafx.fxml;
    exports com.example.projetonavegadorweb;
}